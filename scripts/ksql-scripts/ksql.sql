create stream if not exists streaming_data (
	DATE     BIGINT,
	DEV_SN   VARCHAR(STRING),
	DEVID    BIGINT,
	VARID    BIGINT,
	VALUE    BIGINT,
	QUALITY  BOOLEAN)
with (KAFKA_TOPIC='streaming-data', VALUE_FORMAT='JSON', KEY='devId', TIMESTAMP='date');

create stream if not exists static_data (
	BB_S_N         	 VARCHAR(STRING),           
	MACHINE         VARCHAR(STRING) ,          
	CDI             VARCHAR(STRING) ,          
	ITEMID          VARCHAR(STRING) ,          
	STARDTDATETIME  BIGINT,
	ENDDATETIME     BIGINT,
	VARID           BIGINT,
	VALUE           BIGINT,
	QUALITY         BOOLEAN )
with (KAFKA_TOPIC='static-data', VALUE_FORMAT='JSON', KEY='bb_s_n', TIMESTAMP='enddatetime');

