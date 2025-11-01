select *
from   hptl_mast
order by doc_num desc
-- where  doc_num = 1716
-- limit 100
;

-- secu_key_cd 컬럼 삭제
alter table hptl_mast drop column secu_key_cd;

-- 0. 전체 병원 개수를 구하시오.
select count(*) from hptl_mast;

-- 1. 시도별로 병원 개수를 구하시오.
select sido_cd_nm, count(*)
from   hptl_mast
group by sido_cd_nm
;

-- 2. 1번의 결과를 개수가 큰 것부터 정렬하시오.
select sido_cd_nm, count(*) as cnt
from   hptl_mast
group by sido_cd_nm
order by cnt desc
;

-- 3. 시도별, 타입별 병원 개수를 구하시오.
select sido_cd_nm, typ_cd_nm, count(*)
from   hptl_mast
group by 1, 2
;

-- 4. 병원 이름에 "서울"이 들어가는 병원의 전체 비율을 구하시오.
-- 방법1
select 
(select count(*)
from   hptl_mast
where  hptl_nm like '%서울%') * 100 / 
(select count(*)
from   hptl_mast
) as seoul_ratio
from dual
;

-- 방법2
select sum(case when hptl_nm like '%서울%' then 1
                else 0 end) / count(*) * 100 as result
from   hptl_mast
;

-- Challenge(Difficulty : GOD)
-- 병원설립일을 조회하여 1950년 이전은 "Legend"
-- 2000년 이전은 "고전", 2000년대는 "2000년대", 2010년 이후는 "최신"
-- 으로 분류했을 때 각각의 개수를 구하시오.
select -- hptl_nm, open_date
       case when open_date <= '19500100' then "Legend"
            when open_date < '20000101' then "고전"
            when open_date < '20100100' then "2000년대"
            when open_date > '20100100' then "최신" end as gubun
     , count(*)
from   hptl_mast
group by gubun
;

-- 위에서 나온 통계를 가로로 배열하시오.
-- Legend    고전		2000년대		최신
--    XXX    XXX        XXX     XXX
with stat as 
(
	select -- hptl_nm, open_date
	       case when open_date <= '19500100' then "Legend"
	            when open_date < '20000101' then "고전"
	            when open_date < '20100100' then "2000년대"
	            when open_date > '20100100' then "최신" end as gubun
	from   hptl_mast
)
select sum(case when gubun = 'Legend' then 1 else 0 end) as "Legend"
     , sum(case when gubun = '고전' then 1 else 0 end) as "고전"
     , sum(case when gubun = '2000년대' then 1 else 0 end) as "2000년대"
     , sum(case when gubun = '최신' then 1 else 0 end) as "최신"
from   stat
;

