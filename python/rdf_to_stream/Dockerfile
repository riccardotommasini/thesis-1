FROM python:3.7.1
COPY requirements.txt /
RUN pip install -r requirements.txt
COPY script.py script.sh construct_query.sparql timestamp_query.sparql /
CMD ./script.sh 0 10 rdf construct_query.sparql timestamp_query.sparql
