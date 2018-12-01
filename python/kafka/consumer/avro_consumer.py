from confluent_kafka import avro
from confluent_kafka.avro import AvroConsumer
import os

value_schema_file = os.getenv("VALUE_SCHEMA_FILE", "Streaming-triples.avsc")
bootstrap_server = os.getenv("BOOTSTAP_SERVER",'localhost:9092')
schema_registry = os.getenv("SCHEMA_REGISTRY", 'http://localhost:8081')
topic = os.getenv("TOPIC", "sorted_triples")

c = AvroConsumer({'bootstrap.servers': bootstrap_server,
    'group.id': 'streaming_triples_consumer',
    'schema.registry.url': schema_registry})

c.subscribe([topic])

while True:
    msg = c.poll(10)

    if msg is None:
        continue

    print("key:",msg.key,",value:",msg.value())

c.close()
