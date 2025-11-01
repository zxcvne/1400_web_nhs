Day5

1. Built-in Function
(2) Group(Aggregate) Function
    - 한 개 이상의 입력/한 개의 출력

    1) count(*) : 결과의 개수를 셈
    2) distinct : 결과의 중복을 제거
    3) count(distinct ****) : Unique한 개수
    4) min, max
    5) avg, sum
    6) std, var : 표준편차, 분산

2. SQL Advanced
(1) order by
    - 결과를 정렬하기 위한 문장
    - HighSchool Student 테이블의 결과를 정렬하고 싶다.
    -> 저학년에서 고학년 순, 1반부터 N반의 순, 1번부터 N번 순
    -> order by 학년, 반, 번
    -> order by 학년 desc, 반, 번
    -> order by colname [asc|desc], colname2 ...

(2) group by
    - (aggregate 함수를) 그룹별로 적용
    - 한국어로 번역하면 ~별
    - select 학년, avg(점수)
      from 중간고사
      group by 학년
    - select 학년, 반, avg(점수)
      from 중간고사
      group by 학년, 반
      order by 학년 desc, 반

(3) having
    - aggregate 함수의 결과물에 대한 조건 Filtering
    - 평균이 60점이 되지 않는 반 리스트(운동장)
    - select 학년, 반, avg(점수)
      from 중간고사
      group by 학년, 반
      having avg(점수) < 60.0
      order by avg(점수) desc

(4) union, union all
    - 두 집합을 연결하는 구문
    - select * from 옛날영화      
      union
      select * from 운동경기
    - union은 중복을 제거, union all은 중복을 제거하지 않음

(5) case when
    - 없는 데이터를 만들어내는 기술
    - 모든 데이터를 테이블에 담을 수는 없다.
    - 예)
        가격에 대해 내가 심판을 내리고자 한다.
        1000원 미만 => 완전 저가
        10000원 미만 => 저가
        10000원부터 50000원까지 => 중가
        그 이상 => 바가지

        select price
             , case when price < 1000 then "완전 저가"
                    when price between 1000 and 9999 then "저가"
                    when price between 10000 and 50000 then "중가"
                    else "바가지" end as "나의 심판"
        from   prod
        ;

        select case when score < 60 then 'F'
                    when score between 61 and 70 then 'D'
                    ...

        select case when score >= 60 and subj1 >= 40 and ... then "합격"
                    else "불합격" end as "합격여부"

    - 각 when마다 중복되는 구간이 있으면 안됨

    - 여행상품 테이블이 있다고 가정
      '유럽', '아시아', '미주', '아프리카' 데이터 존재
      => 유럽, 미주, 아시아, 아프리카 순으로 정렬하랜다.

      select prod
           , case when region = '유럽' then '01-유럽'
                  when region = '아시아' then '03-아시아'
                  when region = '미주' then '02-미주'
                  else '04-아프리카' end as cls




