FROM python:3.7.1
COPY requirements.txt ./
RUN pip install -r requirements.txt && pip install confluent-kafka[avro]
COPY big_sorted_result.txt ./
COPY avro_producer.py Streaming-triples-subject-key.avsc Streaming-triples.avsc ./
CMD cat big_sorted_result.txt | python3 -u avro_producer.py  Streaming-triples-subject-key.avsc Streaming-triples.avsc sorted_triples2 s ts
