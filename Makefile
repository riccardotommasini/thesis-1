up:
	sudo docker-compose up -d

build-converter:
	sudo docker build -t phisco/converter converter
	sudo docker push phisco/converter

run-converter:
	sudo docker run -v `pwd`/rdf:/rdf -v `pwd`/results:/results phisco/converter

register-schema:
	schema-registry-cli add sorted_triples_avro-value < converter/Streaming-triples.avsc

generate-data:
	./python/rdf_to_stream/script.sh 0 10 rdf python/rdf_to_stream/construct_query.sparql python/rdf_to_stream/timestamp_query.sparql
