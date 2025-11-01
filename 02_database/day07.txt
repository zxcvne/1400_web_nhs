Day7

1. 정규화
    => 중복된 데이터를 제거함으로써 사이즈 절감이 목적
       코드성 테이블의 내용이 변경되었을 때 전체 데이터 수정 불필요

2. 반정규화
    - 활용단계에서 정규화를 진행하지 않는 것이 더 장점이 있을 때

    ex) 게시판(board)

    1   Funny DBMS      apple
    2   Funny Java      apple
    3   Boring DBMS     honest

    hash tag
    1   DBMS
    1   like
    1   good
    3   DBMS
    3   boring

    -> 반정규화
    1   Funny DBMS      apple   #DBMS #like #good
    2   Funny Java      apple   
    3   Boring DBMS     honest  #DBMS #boring

3. Foreign Key(FK, 외래키)
    - 다른 테이블에 있는 컬럼으로 내 테이블 데이터에 제약 조건을 주는 것
    - 데이터 정합성을 위함

    contract_mast(현재 계약 상태)    
    cont_id(계약id)

    contract_hist(계약 이력)
    cont_id + date + seq

    contract_hist가 contract_mast의 cont_id로 FK를 설정
    => 현재 계약 상태가 없는 계약은 계약 이력에 생성 불가

    - 실제로 대형 데이터베이스를 가지고 있는 회사에서는
      FK를 안쓰는 것이 원칙
    - 데이터가 추가될 때마다 체크(제약) 조건을 살피게 된다.
      => 한가하냐 성능은 반드시 저하된다.
    - 데이터 삭제 시(Archiving, Data Cutting)
      병렬 작업 불가
      => 반드시 이력부터 지워야 현재 상태 테이블 삭제가 가능
         한가하냐 밤에 다 지울 수 있냐

    => 그럼 정합성은 뭘로 보장할건데?
        -> 점검 SQL 배치를 수행한다(데이터 품질)

2. Join
    - join이 없는 SQL은 영어에서 Fire burns의 느낌
    - 여러 곳에 분산되어 있는 정보 중 필요 정보만 가져와서
      결과를 만들어 내기 위한 방법
      * 왜 분산되어 있는가? => 관리 레벨이 다르고, 정규화가 되어 있기 때문
                            RDBMS는 원래 그런 것이기 때문이다.
    - join이 없다면 모든 데이터를 테이블별로 따로 조회한 다음
      프로그램이나 엑셀로 합쳐야 한다.

(1) inner join
    - 가장 일반적인 조인의 형태
    - 조건에 맞는 데이터가 양쪽에 존재할 때
    - 두 테이블 간의 관계가 되는 컬럼을 반드시 기술해야 함

    emp                     salary
    emp_no  name            emp_no  sal
    1       Paker           1       5000
    2       David           2       4800

    이름과 급여를 보고 싶다???
    select e.name, s.sal
    from   emp e, salary s
    where  e.emp_no = s.emp_no

    Paker   5000
    Paker   4800
    David   5000
    David   4800

    - 항상 등가(=)로만 조인하는 것은 아니다.
    - 표준 문법
        select a.나이, b.상세주소
        from   국민정보 a inner join 주소 b
                         on a.주민번호 = b.주민번호

    - 간소화 문법
        select a.나이, b.상세주소
        from   국민정보 a, 주소 b
        where  a.주민번호 = b.주민번호

    - 조인조건 없이 조인하는 것을
      catesian product(카테지안 곱)이라고 함(거의 실수)

(2) natural join(자연 조인)
    - 두 개 테이블 조인 시
      컬럼명이 같은 컬럼을 자동으로 inner join 수행
    - 테이블1 natural join 테이블2

    => 아무도 안쓴다 -> 쓰면 혼난다.
       컬럼명이 같다고 같은 데이터인 걸 누가 장담함?
       -> 실무에서는 활용하지 않는다.

(3) outer join
    - inner join은 두 개 테이블이 조건을 만족할 때 결과가 나옴
    - 한 쪽의 데이터는 있는데, 다른 쪽의 데이터가 있을지 없을지 모름
      -> 부족한 쪽의 데이터를 누락하지 않고 나오게 하는 조인
    - 3가지 종류가 존재함
        A left outer join B : A를 기준으로 B가 없어도
        A right outer join B : B를 기준으로 A가 없어도
        A full outer join B : A, B 둘 다 기준

    A : 국제 범죄자 리스트(human_id) - 전세계 나쁜 놈
    B : 한국인 데이터 테이블(human_id, address)

    국제 범죄자 중 한국에 주소가 있으면 주소를 넣어서 주시오.
    select A.name, B.address
    from   A, B
    where  A.human_id = B.human_id
    ;

    select A.name, case when B.address is null then "없음"
                        else B.address end as kor_addr
    from   A left (outer) join B 
             on A.human_id = B.human_id
    ;

    ** in Oracle
    select A.name, case when B.address is null then "없음"
                        else B.address end as kor_addr
    from   A, B 
    where  A.human_id = B.human_id(+)
    ;
