select *
from movie
;

-- 테이블 정보 조회 방법
desc movie;

-- 장르(genre)를 추가해달라고 함
-- alter
alter table movie add column genre varchar(20);

-- 100세 관람가 => rating이 3으로 변경되어야 함
alter table movie modify column rating int(3);

insert into movie(movie_name) values('scream');
insert into movie(movie_name) values('screen');
insert into movie(movie_name) values('godfather');

-- 이름에 특수문자가 포함되는 경우
insert into movie(movie_name) values('Day\'s Dream');
insert into movie(movie_name) values("Day's Dream");
insert into movie(movie_name) value("Day's Dream");

-- 테이블에 있는 모든 데이터를 지우는 방법
truncate table movie;
-- truncate table이 모두 risky하기 때문에
-- 빈 테이블 생성을 함(원 테이블과 같은 레이아웃으로) -> 나중에 제2의 방법 소개
-- 테이블 exchange 

insert into movie values('파묘','20240222',12,'Horror');
insert into movie values('오리엔트특급살인', '20171129',12 ,'Drama');
insert into movie(movie_name, genre) values('반칙의 제왕','Comedy');

-- select
select *
from movie
where 1 = 1
-- and ****
;

-- SQL 기본 작성법
select movie_name -- 영화제목
	 , open_date  -- 개봉일자
	 , genre	  -- 장르
from movie 
;

-- 결과 건수를 제한할 때 ex) 데이터가 어떻게 들어있나 정도 확인
select * 
from movie
limit 2 -- oracle인 경우 where rownum <= 2
;

-- where 절 연습
select *
from movie 
where (open_date >= '20240101' and open_date != '99991231')
or	 genre = 'Drama'
;

-- update
-- 반칙의제왕이 20240914에 개봉하기로 함
-- select *
-- from movie
update movie 
set open_date = '20240914'
where movie_name = '반칙의 제왕'
;

-- 관객 등급이 12인 영화를 찾아서 10으로 변경하시오.

-- select * 
-- from movie 
update movie
set rating = 10
where rating = 12
;

-- delete
insert into movie(movie_name, open_date)
values('귀멸의칼날', '20250816')
;

delete from movie 
where movie_name like '귀멸%'
;

-- genre가 없는 영화를 지운다.
select * 
from movie
-- where genre = '' -- null을 선택하지 못함
-- where genre = '[NULL]' -- null을 선택하지 못함
-- where genre = null -- null을 선택하지 못함
where genre is null -- null 을 찾을때는 is 연산자 활용
-- where genre is not null -- null 이 아닌 값을 찾을때는 is not null
;

delete from movie
where genre is null;

-- Advanced SQL
insert into movie 
values('오늘', '20241003',12,'Fantasy');
insert into movie 
values('84m3', '20261003',19,'Drama');
insert into movie 
values('Le Grand Bleu', '20281003',12,'Drama');
insert into movie 
values('초원의집', '20301003',0,'Drama');

-- rating이 12-19인 것
select *
from movie
where rating between 12 and 19 

-- 개봉일자가 2024년부터 2027까지
select *
from movie
where open_date between '20240101' and '20271231' 
;

-- concat
select concat('나는', '소년', '입니다')
from dual
;

-- Fantasy 장르의 영화명과 개봉일자, 등급을
-- | 구분자로 구분하여 출력하시오.

select concat(movie_name,'|', open_date,'|', rating) 
	as 'result' -- 한글은 기본적으로 금기어
from movie
where genre = 'Fantasy'
;

-- create table
-- not null
create table movie2
(
	movie_name varchar(100) not null,
	open_date varchar(8) default '99991231'
);

insert into movie2(open_date) values('20250816');
-- movie_name이 not null인데 데이터를 넣지 않아 오류 발생

-- default
insert into movie2(movie_name) values('흐르는강물처럼');

select * 
from movie2
;

update movie2
set    movie_name = null
;

