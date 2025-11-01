-- dual의 활용 
select 99 as score from dual;

select *
from(
	select 'java' as subject, 'b' as difficulty from dual
	union all
	select 'c', 'A' from dual
	union all
	select 'python', 'c' from dual
	) as t
;

-- table creation
create table movie
(
	movie_name varchar(100), 
	open_date varchar(8),
	rating int(2)
)
;


select * 
from movie
;

-- Y2K
-- 99년에서 00년으로 넘어갈 때
-- 19991231 20000101

desc movie;

-- insert
insert into movie values('좀비딸','20250730',12);
insert into movie(open_date,movie_name, rating)
values('20240222', '파묘', 19);
insert into movie(rating, movie_name, open_date)
values(70, '노인과바다', '19520611');


select 
-- *	 
	 movie_name
	,lengthb(movie_name) 
-- ,를 아래쪽에 두는게 유리
from movie
-- where open_date > '20250100' -- 올해 나온 영화
-- where rating = 70 -- 70세 관람영화
-- where lengthb(movie_name) < 10 
;


select * from movie;

-- 영화 10개 넣어놓기


insert  into movie(movie_name, open_date)
values
('범죄도시','20171003'),
('귀멸의칼날','20250815'),
('위대한개츠비','20101010');