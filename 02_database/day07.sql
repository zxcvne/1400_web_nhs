-- 정규화 연습
select *
from   hptl_mast
limit 10;

-- hptl_mast의 hptl_nm이 PK라고 가정(실제론 아님)
-- PK가 단일컬럼이면 진부분집합이 없다
-- -> 2차 정규화할 대상 없음
-- 3차 정규화 대상 => typ_cd로 결정되는 typ_cd_nm
-- 3차 정규화 대상 => sido_cd로 결정되는 sido_cd_nm
-- 3차 정규화 대상 => siggu_cd로 결정되는 siggu_cd_nm

-- typ_cd와 typ_cd_nm을 보관하는
-- typ_cd_dtl을 만드시오.
create table typ_cd_dtl as
select distinct typ_cd, typ_cd_nm
from   hptl_mast
;

create table sido_cd_dtl as
select distinct sido_cd, sido_cd_nm
from   hptl_mast
;

create table siggu_cd_dtl as
select distinct siggu_cd, siggu_cd_nm
from   hptl_mast
;

-- 작업 전 테이블은 반드시 백업
-- CTAS 또는 export
create table hptl_mast_bak as
select *
from   hptl_mast
;

-- 3개 컬럼 drop
alter table hptl_mast drop column typ_cd_nm;
alter table hptl_mast drop column sido_cd_nm;
alter table hptl_mast drop column siggu_cd_nm;
select *
from   hptl_mast
;

select *
from   hptl_mast hm
where  hptl_nm like '%한의원%'
and    open_date < '20000000'
and    exists (
				select 1
				from   hptl_mast
				where  hptl_nm = hm.hptl_nm
				and    addr <> hm.addr
				and    tel_no <> hm.tel_no
			  )
;

with multiple as (
	select hptl_nm
	     , count(*) cnt
	from   hptl_mast
	group by hptl_nm
	having count(*) > 1
)
select *
from   multiple
where  hptl_nm like '%한의원%'
-- and    open_date < '20000000'
;

select distinct hptl_nm, addr, tel_no
from   hptl_mast
;

-- join
-- table 2개 생성
create table acc_num
(
	id	varchar(10),
	amt	int(15)
);
insert into acc_num values('m1', 2784);
insert into acc_num values('m2', 4221);

create table member_cls
(
	cls		varchar(10),
	min_amt	int(15),
	max_amt	int(15)
);
insert into member_cls values('black', 2500, 2999);
insert into member_cls values('red', 3000, 5000);
insert into member_cls values('gold', 5001, 10000);

-- m1이라는 회원은 무슨 등급인지 구하시오.
select a.id, b.cls
from   acc_num a, member_cls b
where  a.id = 'm2'
and    a.amt between b.min_amt and b.max_amt
;

-- 정규화 3단계를 통해 테이블이 분할되었다.
-- 강원도에 있는 상급종합 병원의 병원명, 시군구명, 주소를 구하시오.
-- bak 테이블은 이용하지 마시오.
select h.hptl_nm as "병원명"
     , g.siggu_cd_nm as "시군구명"
     , h.addr as "주소"
from   hptl_mast h
     , typ_cd_dtl t
     , sido_cd_dtl s
     , siggu_cd_dtl g
where  s.sido_cd_nm = '강원'
and    t.typ_cd_nm = '상급종합'
and    h.typ_cd = t.typ_cd
and    h.sido_cd = s.sido_cd
and    h.siggu_cd = g.siggu_cd
;









