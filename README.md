## Thesis

## SRBENCH
- Download http://sonicbanana.cs.wright.edu/knoesis_linkedobservationdata_bill.tar.gz from http://wiki.knoesis.org/index.php/LinkedSensorData
- To execute the converter from the n3 files to streamable timestamped triples in json, sorted by timestamp, `{ subject: ..., predicate: ..., object: ..., timestamp: ... }` use the template in the `Makefile`

## AVRO
`java -jar ./avro-tools-1.8.2.jar compile schema converter .`
## SCHEMA REGISTRY
- Download the schema-registry-cli: `go get -u github.com/landoop/schema-registry/schema-registry-cli`
- register the schema with the schema registry through `make register-schema `

## KSQL
```
SET 'auto.offset.reset' = 'earliest';
CREATE STREAM triples ( s VARCHAR, p VARCHAR, o VARCHAR, ts BIGINT) WITH (KAFKA_TOPIC='sorted_triples', VALUE_FORMAT='JSON', KEY='S', TIMESTAMP='ts');
```

```
RUN SCRIPT '/ksql-scripts/init.sql';
```

```
CREATE TABLE W1 as select s, o from triples window tumbling (size 1 hour) where p = 'http://knoesis.wright.edu/ssw/ont/sensor-observation.owl#result' group by s, o;
CREATE TABLE W2 as select s from triples window tumbling (size 1 hour) where p = 'http://www.w3.org/1999/02/22-rdf-syntax-ns#type' and o ='http://knoesis.wright.edu/ssw/ont/weather.owl#RainfallObservation' group by s;

```

### Streaming-data:

```{"date":"Mar 26, 2018 6:01:56 PM","devSn":"IOTSPI216110315", "devId":10,"varId":5508,"value":0,"quality":false}```
- `date` : the timestamp of the measurement
- `devSn` : the sensor that generated the measurement
- `devId` : NOT USED
- `varId` : the variable measured
- `value` : the value of the variable measured
- `quality` : NOT USED

### Static-data:

```{"bb_s_n":"IOTSPI216110315", "MACHINE":"A561322", "CDI":"182CBAFBRY53", "ITEMID":"20A09132_WIP", "STARTDATETIME":"2018-03-26 00:32:56.000", "ENDDATETIME:"2018-03-26 02:31:13.000" }```
- `bb_s_n` : sensor present on the machine/item
- `MACHINE`: the workcenter used by the worker
- `CDI` :  NOT USED
- `ITEMID` : the item used by the worker
- `STARTDATETIME` : timestamp of begin of usage of an item at a workstation
- `ENDDATETIME` : timestamp of begin of usage of an item at a workstation

### Result wanted:
For `streaming-data.devSn` in a sliding window of 5 minutes the [streaming-data.varId -> streaming-data.value]

## How To:
- build ksql's project: 
`mvn clean package -DskipTests`


- write this in `~/.m2/settings.xml` to access confluent's snapshots' repository:
```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.1.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemoLocation="http://maven.apache.org/SETTINGS/1.1.0 http://maven.apache.org/xsd/settings-1.1.0.xsd">
	<mirrors>
		<mirror>
			<id>Confluent</id>
			<name>Confluent mirror</name>
			<url>http://packages.confluent.io/beta2018June/maven/</url>
			<mirrorOf>confluent</mirrorOf>
		</mirror>
	</mirrors>
</settings>

```

- run ksql-datagen in a container with the streaming-data.avro schema (also `make datagen-stream`):
```bash
docker-compose up -d
docker run --network thesis_default --rm -v `pwd`/streaming-data.avro:/streaming-data.avro  \
    confluentinc/ksql-examples:5.0.0 \
    ksql-datagen \
        bootstrap-server=broker:9092 \
        schemaRegistryUrl=schema-registry:8081 \
        schema=/streaming-data.avro \
        format=json \
        key=date \
        topic=data \
        maxInterval=500 
```

## Links
- https://github.com/confluentinc/avro-random-generator
