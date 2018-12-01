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
    # l = len(files)
    # print(f"{dest}:\tcomputing {l} files")
    number_of_chunks  = 5
    # nchunk = 0
    for chunk in divide_chunks(data["files"], number_of_chunks):
        # nchunk += 1
        # lchunk = len(chunk)
        # header = f"{process}:{nchunk}/{number_of_chunks}:"
        # print(f"{header}\tcomputing {nchunk}/{number_of_chunks} chunck of {lchunk} files")
        g = Graph()
        # g = Graph('SQLite')
        # g.open(os.path.join("sqlite",dest+"_sqlite"), create=True)
        # i=0
        for f in chunk:
            # i+=1
            # print(f"{header}\tparsing {f}\t({i}/{lchunk}) ")
            g.parse(os.path.join(directory,f), format=syntax)
        timestamps = g.query(data["timestamp_query"])
        # print(f"{header}\tDone computing timestamps: {len(timestamps)}")
        # i = 0
        # ltimestamps = len(timestamps)
        # res = []
        for ts in timestamps:
            # i+=1
            t = int(ts[0].toPython().timestamp())
            # print(f"{header}\tparsing\t{str(t)}\t({i}/{ltimestamps})")
            rs = g.query(data["construct_query"], initBindings={"o": ts[0]})
            for s, p, o in rs:
                print(json.dumps(getSJSON(s,p,o,t), 
			default=datetime_converter))
               #  print(json.dumps({ "s": str(s.toPython()), 
                                        # "p": str(p.toPython()), 
                                        # "o": str(o.toPython()),
               #                          "ts": t}))
    # print(f"{header}\treturning {len(res)} lines")


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
