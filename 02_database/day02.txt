Day2

1. 자료형
(1) 문자형
    - char : 고정길이
             char(4)로 만들고 'A'만 넣으면
             남은 자리는 공백으로 채움
    - varchar : 가변길이
             varchar(4)로 만들고 'A'만 넣으면
             1자리만 차지함
    => char의 장점은?? 없다.

(2) 숫자형
    - number(자리수) : 정수
    - int(자리수) : 정수
    - number(자리수, 소수점이하자리수) : 실수
      ex) number(5, 2) - 3.14

(3) 시간형
    - date : 날짜가 들어가는 타입
    - timestamp : 정밀도가 더 높은 날짜
      
    - sysdate : 오라클에서의 현재 시간 변수
      sysdate() : 마리아DB 등의 현재 시간 함수
    
    * input_dt가 date 타입이라면
      input_dt between to_date('20250810000000', 'yyyymmddhh24miss')
               and     to_date('20250810235959', 'yyyymmddhh24miss')
      => 조회가 빈번하다면 활용이 매우 불편함
      => input_dt를 varchar(8) 또는 varchar(14)로 만듬
      input_dt = '20250810'
      input_dt between '20250810000000' 
               and '20250810235959'

(4) LOB, BLOB, CLOB
    - Large Object, Binary LOB, Character LOB
    - 랍, 비랍, 씨랍
    - 데이터베이스는 데이터를 블럭(페이지)이라는 곳에 저장
      일반적으로 하나의 블럭에 여러 개의 데이터가 들어간다.
      * 하나의 블럭 크기 : 8K(오라클 디폴트)
    - 그런데 데이터가 너무 커서(html, image, 소스코드)
      외부에 저장(파일로)하고 그 위치를 가리키는 구조
    - 속도가 매우 느림
    - 데이터가 삭제되면 자동으로 용량이 줄어들지 않기 때문에
      shrink를 수행해야 용량이 확보됨

2. create table
    - 테이블을 생성하는 명령
    - 컬럼명, 컬럼타입, default, null 가능여부(nullable)

    - create table 테이블명
      (
            컬럼명1     컬럼타입    default **** not null,
            컬럼명2     컬럼타입
            ...
            컬럼명N     컬럼타입
      );

3. SQL 기본 문법
(1) select
    1) 기본 사용법
        select 컬럼명1, 컬럼명2, ...  (* - 전체컬럼 다)
        from   테이블명
        where  조건절    

        조건절이란 무엇인가?
        => 조건이 있는 문장
           반드시 true이거나 false
           조건절의 결과가 true인 row만 결과로 나온다.
           age < 10
           jumin_no = '0012313072131'

           >, <   : 초과, 미만
           >=, <= : 이상, 이하
           =      : 같다
           !=, <> : 같지 않다
           like   : like '%검색어%' => 검색어 포함
                    like '검색어%'  => 검색어로 시작
                    like '%검색어'  => 검색어로 종료

           ex) 찾아보기에서 "가입" => 찾기버튼
               content like '%가입%'

           ex) input_dt(14자리, 시간-시분초)
               20250810195122
               20250810164930
               20250512233112

               오늘 발생한 데이터는?
               input_dt like '20250810%'
               substr(input_dt, 1, 8) = '20250810'
               input_dt between '20250810000000'
                        and     '20250810235959'

               => 세 가지 방법 중 3이 가장 선호됨
                  substr 같이 인덱스 컬럼에 함수가 씌워지면
                  인덱스 동작 불가

               like '_검색어' : 검색어로 종료, 검색어 앞에는 단 1글자
               input_dt like '20250810______'

(2) insert
    - 데이터를 추가하는 문장
    - 기본 사용법
        insert into 테이블명 values(값1, 값2, ... , 값N)
        insert into 테이블명(컬럼2, 컬럼1, ...)
        values (컬럼2값, 컬럼1값, ...)

    - 컬럼명을 작성하지 않은 경우 모든 값들을
      순서에 정확하게 맞추어 넣어야 함
    - 컬럼명을 작성한 경우 컬럼에 매칭되는 값만 넣으면 됨
      순서도 작성한 컬럼명 순서에 따르면 됨
                    