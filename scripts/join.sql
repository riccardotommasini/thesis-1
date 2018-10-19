create stream joined_stream_static as
select * 
from streaming_data left outer join static_data
on dev_sn = bb_s_n and date >= STARDTDATETIME  and date <= ENDDATETIME;
