select 1 from dual;
select sysdate() from dual;

select *
from   hptl_mast
;

select * from hptl_mast where sido_cd_nm = '인천' and typ_cd_nm = '의원' 
limit 10
;