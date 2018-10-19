## Thesis

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
