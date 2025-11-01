select open_date, count(*)
from   hptl_mast
where  open_date between '20000101' and '20000131'
group by open_date
;

with base as (
	select '20000101' as yyyymmdd from dual union
	select '20000102' from dual union
	select '20000103' from dual union
	select '20000104' from dual union
	select '20000105' from dual union
	select '20000106' from dual union
	select '20000107' from dual union
	select '20000108' from dual union
	select '20000109' from dual union
	select '20000110' from dual
)
select b.yyyymmdd, sum(case when h.open_date is null then 0
                            else 1 end) as cnt
from   base b left outer join hptl_mast h
on     h.open_date between '20000101' and '20000131'
and    b.yyyymmdd = h.open_date
group by b.yyyymmdd
;

-- subquery
select h.hptl_nm, h.doc_num, h.sido_cd
from   hptl_mast h
     , sido_cd_dtl s
where  s.sido_cd_nm = '강원'
and    s.sido_cd = h.sido_cd
;

select h.hptl_nm, h.doc_num, h.sido_cd
from   hptl_mast h
where  h.sido_cd in (select sido_cd
                     from   sido_cd_dtl
                     where  sido_cd_nm = '강원')
;

-- scalar subquery
select h.hptl_nm
--      , g.siggu_cd_nm
     , (select siggu_cd_nm
        from   siggu_cd_dtl
        where  siggu_cd = h.siggu_cd
        limit 1) siggu_cd_nm
     , h.addr
from   hptl_mast h
     , typ_cd_dtl t
     , sido_cd_dtl s
--      , siggu_cd_dtl g
where  t.typ_cd_nm = '상급종합'     
and    s.sido_cd_nm = '강원'
and    h.sido_cd = s.sido_cd
and    h.typ_cd = t.typ_cd
-- and    h.siggu_cd = g.siggu_cd
;

-- exists와 in
-- 의사 수가 0인 병원을 blacklist라고 생성
create table blacklist as
select hptl_nm, sido_cd, siggu_cd
from   hptl_mast
where  doc_num = 0
;

-- 서울에 있는 병원 중 병원 이름이 blacklist에 존재하지 않는 병원
select hptl_nm, addr
from   hptl_mast h
where  h.sido_cd = '110000'  -- 서울 코드
and    not exists (select 1
                   from   blacklist
                   where  hptl_nm = h.hptl_nm
                   limit 1)
;

select hptl_nm, addr
from   hptl_mast h
where  h.sido_cd = '110000'  -- 서울 코드
and    h.hptl_nm not in (select hptl_nm
                         from   blacklist)
;

-- sequence
-- cache는 순서가 보장될 필요는 없고, 중복만 막기 위한 용도일때 사용
create sequence seq_test nocache;

select nextval(seq_test)
from   dual
;

-- view
create view big_hptl as
select h.hptl_nm, h.typ_cd, s.sido_cd_nm, h.doc_num
from   hptl_mast h
     , sido_cd_dtl s
where  typ_cd = '1'
and    doc_num > 100
and    h.sido_cd = s.sido_cd
;

select *
from   big_hptl
where  doc_num between 100 and 200
;





















