## Thesis

Streaming-data:
`{"date":"Mar 26, 2018 6:01:56 PM","devId":10,"varId":5508,"value":0,"quality":false}`

To build ksql's project: `mvn clean package -DskipTests`


Write this in ~/.m2/settings.xml to access confluent's snapshots' repository:
```
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

To run ksql-datagen in a container with the streaming-data.avro schema (also `make datagen-stream`):
```
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
