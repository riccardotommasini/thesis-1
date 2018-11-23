from rdflib.plugins.sparql.algebra import pprintAlgebra, translateQuery
from rdflib.plugins.sparql import parser
import os
import sys
fs = sys.argv[1:]

for f in fs:
    with open(f) as fr:
        ls = fr.readlines()
        q = " ".join([ el.strip() for el in ls])
        pq = parser.parseQuery(q)
        tq = translateQuery(pq)
        print(f.split(".")[0] +" : ")
        print("".join(ls))
        print("Algebra :")
        pprintAlgebra(tq)
        print("=================")
