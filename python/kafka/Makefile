consumer:
	docker build -t phisco/avro_consumer consumer
producer:
	docker build -t phisco/avro_producer producer
push: consumer producer
	docker push phisco/avro_consumer
	docker push phisco/avro_producer
apply:
	kustomize build
	kustomize build | kubectl apply -f -
	
