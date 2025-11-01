create table scores
(
	student_id	varchar(10),
	subject		varchar(20),
	score		int(3)
);

select * from scores;

insert into scores values('Paker', 'LoL', 99);
insert into scores values('Paker', 'BG', 10);
insert into scores values('Paker', 'Overwatch', 50);
insert into scores values('Ejae', 'LoL', 15);
insert into scores values('Ejae', 'BG', 70);
insert into scores values('Ejae', 'Overwatch', 16);
insert into scores values('Amazon', 'LoL', 26);
insert into scores values('Amazon', 'BG', 80);
insert into scores values('Amazon', 'Overwatch', 90);
insert into scores values('르세라핌', 'LoL', 60);
insert into scores values('르세라핌', 'BG', 80);
insert into scores values('르세라핌', 'Overwatch', 20);
insert into scores values('Pakel', 'LoL', 30);
insert into scores values('Pakel', 'BG', 10);
insert into scores values('Pakel', 'Overwatch', 5);

-- Aggregate Function
-- count, distinct

-- scores 테이블의 전체 건수
select count(*) as "전체건수"
from   scores
;

-- 전체 과목
select distinct subject
from   scores
;

-- 전체 과목의 개수는?
select count(distinct subject)
from   scores
;

-- 실습 : 전체 응시한 사람 수는?
select count(distinct student_id)
from   scores
;

-- 실습 : 전체 응시한 사람 중 P로 시작하는 아이디를 갖는 사람 수
select count(distinct student_id)
from   scores
where  student_id like 'P%'
;

-- 70점 이상인 과목이 있는 학생 수
select count(distinct student_id)
from   scores
where  score >= 70
;

-- 과목별 평균 점수를 구하시오.
select subject, avg(score)
from   scores
group by subject
;

-- 학생별 평균 점수를 구하고, 평균 점수가 높은 학생들부터 정렬하시오.
select student_id, avg(score)
from   scores
group by student_id
order by avg(score) desc
;

-- 학생별 평균 점수를 구하고 평균이 50점 이상인 학생만 보여주세요.
select student_id, avg(score)
from   scores
group by student_id
having avg(score) >= 50
;

-- union, union all
-- BG 점수가 50점 이상인 학생 + 평균 점수가 40점 이상인 학생
select '01' as gubun, student_id
from   scores
where  subject = 'BG' and score >= 50
union all  -- 결과의 중복을 제거하지 않는다. -> 90% 이상 사용
select '02' as gubun, student_id
from   scores
group by student_id
having avg(score) >= 40
;







