#!/usr/bin/env python3
from rdflib import Graph
from rdflib.term import URIRef, Literal, BNode
import datetime
import json
import math
import multiprocessing as mp
import os
import sys

def getSJSON(s,p,o,t):
    type(t)
    r = {   "s":str(s),
            "p":str(p),
            "ts":t}
    if isinstance(o, Literal):
        r["o"]={
                "value": o.value,
                "type": "literal",
                "datatype": str(o.datatype)
                }
    elif isinstance(o,URIRef):
        r["o"]={
                "value": str(o),
                "type":"uri"
                }
    elif isinstance(o, BNode):
        r["o"]={
                "value": str(o.n3()),
                "type": "bnode"
                }
    return r

def datetime_converter(o):
    if isinstance(o, datetime.datetime):
        return o.__str__()

def divide_chunks(l, number_of_chunks): 
    n = math.ceil(len(l)/number_of_chunks)
    for i in range(0, len(l), n):  
        yield l[i:i + n]

def batch(data):
    number_of_chunks  = 5
    for chunk in divide_chunks(data["files"], number_of_chunks):
        g = Graph()
        for f in chunk:
            g.parse(os.path.join(directory,f), format=syntax)
        timestamps = g.query(data["timestamp_query"])
        for ts in timestamps:
            t = int(ts[0].toPython().timestamp())
            rs = g.query(data["construct_query"], initBindings={"o": ts[0]})
            for s, p, o in rs:
                print(json.dumps(getSJSON(s,p,o,t), 
			default=datetime_converter))


if __name__ == '__main__':
    if len(sys.argv) <2:
        print("Usage : script.py directory format construct_query timestamp_query [start end]", file=sys.stderr)
        print("e.g. : script.py rdf n3 construct_query.sparql timestamp_query.sparql 0 100",file=sys.stderr)
    else:
        directory, syntax, construct_query, timestamp_query = sys.argv[1:5]
        directories = sorted([el for el in os.listdir(directory) if el.endswith(syntax)])
        start, end = map(int,sys.argv[5:7]) if len(sys.argv)>=7 else (0, len(directories)) 
        directories = directories[start:end]
        construct_query = " ".join(open(construct_query).readlines())
        timestamp_query = " ".join(open(timestamp_query).readlines())
        cpus = mp.cpu_count()
        with mp.Pool(cpus) as p:
            p.map(batch, [ { "process": i, 
                    "files": files, 
                    "timestamp_query":timestamp_query, 
                    "construct_query":construct_query }
                for (i, files) in enumerate(divide_chunks(directories, cpus))] )
