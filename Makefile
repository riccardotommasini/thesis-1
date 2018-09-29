.PHONY: datagen-stream

datagen-stream:
	sudo docker-compose up -d
	sudo docker run --network thesis_default --rm \
		-v `pwd`/streaming-data.avro:/streaming-data.avro \
		confluentinc/ksql-examples:5.0.0 \
		ksql-datagen \
			bootstrap-server=broker:9092 \
			schema=/streaming-data.avro \
			format=json \
			key=devId \
			topic=data2 \
			maxInterval=500 \
			schemaRegistryUrl=schema-registry:8081

datagen-static:
	sudo docker-compose up -d
	sudo docker run --network thesis_default --rm \
		-v `pwd`/static-data.avro:/streaming-data.avro \
		confluentinc/ksql-examples:5.0.0 \
		ksql-datagen \
			bootstrap-server=broker:9092 \
			schema=/streaming-data.avro \
			format=json \
			key=date \
			topic=data \
			maxInterval=500 \
			schemaRegistryUrl=schema-registry:8081
