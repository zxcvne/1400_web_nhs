-- insert into select

select *
from movie;

-- movie에서 장르가 Drama인 것만 movie2에 적재

desc movie2;
insert into movie2 
select movie_name, open_date
from movie
-- where genre = 'Drama'
;

select *
from movie2;

-- primary key(PK)
alter table movie2 
add constraint movie2_pk primary key(movie_name)
;

truncate table movie2;
-- pk를 포함한 인덱스는 조회 성능을 좋게 한다.
-- 대신 데이터 삽입, 수정, 삭제는 성능이 저하된다.
-- 오블 밤에 데이터 10억건을 넣어야 한다??
-- 매 row마다 인덱스에 추가 + pk(constraint) 검사
-- 인덱스를 제거 -> 데이터 적재 -> 인덱스 재생성(rebulid)

-- index의 naming rule규칙
-- pk_movie, uk_movie, idx_movie_1 ... N => %movie%
-- movie_pk, movie_uk, movie_i1 ... N => movie%

-- CTAS
-- create table as select
-- 1) 오픈일자가 2010년 이후인 것만 가지고 테이블을 생성하시오(movie3)
create table movie3 as 
select *
from movie
where open_date >= '20100101'
;

-- 2) movie2의 컬럼만 가지고 movie4 테이블을 생성하시오
-- 데이터는 불필요함

create table movie4 as
select *
from movie2
where 1 = 0
;

select *
from movie4
;

-- alias
select *
from movie
;

-- 관객 등급이 있는 영화의 평균관람가 연령과 총 영화수를 구하시오.
select avg(r) as "평균관람가 연령"
	,  count(*) as "Rating이 있는 총 영화 개수"
from 
	(
		select movie_name as mn 
			 , rating as r
		from movie
		where rating is not null
	) as m
;


-- Built-in Function
-- (1) Single Row Function
-- numeric
select abs(-88.99) from dual;
select ceil(-4.9), ceil(4.9) from dual;
select round(33.897, 2)
	,  round(33.897,-1)
	,  round(33.897,-2)
from dual;

-- text
select LOWER('Maria'), upper('Heidi')
from dual
;
select length('asdfkjhasdkjfhsad') from dual;
select movie_name, length(movie_name) as "글자길이"
from movie; -- 한글을 3글자로 인식

select substr(open_date, 1, 4) yyyy
	,  substr(open_date, 5, 4) mmdd
from movie;

select * 
from movie 
where substr(open_date, 1, 4) = '2025'
;

-- 마지막 인자를 주이 않으면 끝까지
select substr('Worlds 7 wonders', 4)
from dual;
-- 음수인 경우 우측부터
select substr('worlds 7 wonders', -5)
from dual;

-- to_date, to_char
-- to_date : oracle, str_to_date : mysql
select open_date, str_to_date(open_date, '%Y%m%d')
from movie
;

-- 파묘의 개봉일이 100일 밀렸다.
select movie_name 
	,  open_date 
	,  to_char(
		date_add(
			str_to_date(
			open_date, '%Y%m%d')
			, interval 100 day)
			, 'yyyymmdd') as new_open_day
	,  date_add(str_to_date(open_date, '%Y%m%d'), interval 100 day)
from movie
where movie_name = '파묘'
;

update movie
set open_date = to_char(
					date_add(
						str_to_date(open_date, '%Y%m%d')
					  , interval 1 year) -- 100day
					, 'yyyymmdd')  
where movie_name = '파묘'
;

select * from movie;