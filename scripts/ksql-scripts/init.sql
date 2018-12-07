SET 'auto.offset.reset' = 'earliest';
CREATE STREAM triples ( s VARCHAR, p VARCHAR, o VARCHAR, ts BIGINT) WITH (KAFKA_TOPIC='sorted_triples', VALUE_FORMAT='AVRO', KEY='s', TIMESTAMP='ts');
