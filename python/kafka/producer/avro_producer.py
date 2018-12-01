from confluent_kafka import avro
from confluent_kafka.avro import AvroProducer
import json
import sys
import os

topic = os.getenv("TOPIC", "sorted_triples")
ts = os.getenv("TIMESTAMP_KEY", "ts")
key = os.getenv("KEY", "s")
key_schema_file = os.getenv("KEY_SCHEMA_FILE", "Streaming-triples-subject-key.avsc")
value_schema_file = os.getenv("VALUE_SCHEMA_FILE", "Streaming-triples.avsc")
bootstrap_server = os.getenv("BOOTSTAP_SERVER",'localhost:9092')
schema_registry = os.getenv("SCHEMA_REGISTRY", 'http://localhost:8081')
if __name__ == '__main__':
    with open(key_schema_file) as kf, open(value_schema_file) as vf:
        value_schema, key_schema = avro.loads(" ".join([el.strip() for el in vf.readlines()])) , avro.loads(" ".join([el.strip() for el in kf.readlines()]))
        avroProducer = AvroProducer({'bootstrap.servers': bootstrap_server,
            'schema.registry.url': schema_registry
        }, default_value_schema=value_schema, default_key_schema=key_schema )
        for line in sys.stdin:
            triple = json.loads(line)
            try :
                avroProducer.produce(topic=topic, value=triple, key={"key" : triple["s"]}, timestamp=triple["ts"])
                avroProducer.flush()
            except BufferError as e:
                print(e, triple)
                avroProducer.flush()



