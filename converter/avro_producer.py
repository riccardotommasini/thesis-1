from confluent_kafka import avro
from confluent_kafka.avro import AvroProducer
import json
import sys

if __name__ == '__main__':
    if len(sys.argv)<2:
        print("help: ./avro_producer.py key_avsc_schema value_schema topic key timestamp < file_to_be_sent")
        print("e.g.: ./avro_producer.py Streaming-triples-key.avsc Streaming-triples-value.avsc topic s ts < file_to_be_sent")
    key_schema_file, value_schema_file, topic, key, ts = sys.argv[1:6]
    with open(key_schema_file) as kf, open(value_schema_file) as vf:
        value_schema, key_schema = avro.loads(" ".join([el.strip() for el in vf.readlines()])) , avro.loads(" ".join([el.strip() for el in kf.readlines()]))
        avroProducer = AvroProducer({'bootstrap.servers': 'localhost:9092',
            'schema.registry.url': 'http://localhost:8081'
        }, default_value_schema=value_schema, default_key_schema=key_schema )
        for line in sys.stdin:
            triple = json.loads(line)
            try :
                    avroProducer.produce(topic=topic, value=triple, key={"s" : triple["s"]}, timestamp=triple["ts"])
                    avroProducer.poll(0)
            except BufferError as e:
                print(e, triple)
                avroProducer.flush()



