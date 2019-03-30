## Thesis

## HOW TO RUN

`avro_producer` needs everything else to be up and running, so execute the next command until "thesis_avro_producer_1 is up-to-date":

```
docker-compose up -d avro_producer
```

Then set the correct query at `./Metamorphosys/src/main/java/phisco/streams/polimi/it/Parser/GregorTest.java` and run it.

## SRBENCH

- Download http://sonicbanana.cs.wright.edu/knoesis_linkedobservationdata_bill.tar.gz from http://wiki.knoesis.org/index.php/LinkedSensorData
- To execute the converter from the n3 files to streamable timestamped triples in json, sorted by timestamp, `{ subject: ..., predicate: ..., object: ..., timestamp: ... }` use the template in the `Makefile`
