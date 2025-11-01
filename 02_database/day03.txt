Day3

1. SQL 기본 문법(Cont'd)
(3) update
    - 테이블의 데이터를 변경하는 구문
    1) 기본 사용법
        --select *
        --from   테이블명
        update 테이블명
        set    변경할컬럼1 = 변경할값1
             , 변경할컬럼2 = 변경할값2
        where  조건식
        ;

    - 테이블에 200개의 컬럼이 있다고 가정
      나는 그 중 단 한개의 컬럼값만 바꿀 예정이다.
    => 해당 데이터만 바꾸는 방식(X)
       해당 row 전체를 지우고 + 새로운 200개짜리 row를 넣는다.
       update = delete + insert
       DB에 부담이 가장 많이 되는 명령문

(4) delete
    - 데이터를 삭제하는 명령
    1) 기본 사용법
        delete from 테이블명
        where  조건절
        ;
    - 데이터가 삭제되면 복구가 불가능하기 때문에
      백업을 받고 나서 삭제 처리
      => 이상이 없을 경우 백업 삭제

2. Advanced SQL
(1) where 조건에서의 and / or
    where cond1 and cond2 or cond3 - 오해의 소지
    where (cond1 and cond2) or cond3
    => 코드를 명료하게 작성할 것

(2) between
    - between A and B
    - A부터 B까지(A, B 둘다 포함)
    - age between 13 and 19
      age >= 13 and age <= 19
    - 가격(price)이 만원대
      price between 10000 and 19999

(3) 데이터 연결하기
    - 문자(열), 숫자 등을 붙이는 기술(+가 안통함)
    - Oracle
        'data1' || 'data2' => data1data2
        'data1' || '|' || 'data2' => data1|data2
    - MySQL(Maria) 계열
        concat(컬럼1, '|', 컬럼2, 컬럼3, 컬럼4)
        => 컬럼1|컬럼2컬럼3컬럼4
        cf) in Excel concatenate

3. create table
    - create table 테이블명
      (
            컬럼이름    타입    [default ***] [not null]
      );