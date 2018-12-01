FROM python:3.7.1
COPY requirements.txt ./
RUN pip install -r requirements.txt && pip install confluent-kafka[avro]
COPY avro_consumer.py ./
CMD python3 -u avro_consumer.py
