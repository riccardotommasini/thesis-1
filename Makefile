.PHONY: datagen-stream

datagen-stream:
	sudo docker-compose up -d
	sudo docker run --network thesis_default --rm -d \
		--name datagen-stream \
		-v `pwd`/streaming-data.avro:/streaming-data.avro \
		confluentinc/ksql-examples:5.0.0 \
		ksql-datagen \
			bootstrap-server=broker:9092 \
			schema=/streaming-data.avro \
			format=json \
			key=devId \
			topic=streaming-data \
			maxInterval=500 \
			schemaRegistryUrl=schema-registry:8081

datagen-static:
	sudo docker-compose up -d
	sudo docker run --network thesis_default --rm -d \
		--name datagen-static \
		-v `pwd`/static-data.avro:/static-data.avro \
		confluentinc/ksql-examples:5.0.0 \
		ksql-datagen \
			bootstrap-server=broker:9092 \
			schema=/static-data.avro \
			format=json \
			key=bb_s_n \
			topic=static-data \
			maxInterval=500 \
			schemaRegistryUrl=schema-registry:8081

ksql:
	sudo docker run --network thesis_default --rm -ti \
     confluentinc/cp-ksql-cli:5.0.0 \
     http://ksql-server:8088
