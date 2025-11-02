Day6

2. SQL Advanced(Cont'd)
(6) with 절의 활용
    - SQL의 맨 윗 부분에만 존재 가능
    - 예전에는 서브 쿼리로만 가능했던 기술
    - 결과 집합의 이름을 미리 부여하여 테이블처럼 사용
    - 중요한 이점 2가지
        1) 가독성이 매우 뛰어나다.
        2) 다른 SQL로 쉽게 copy해서 사용할 수 있음
        3) 동일한 로직이 여러 번 수행될 것을 한 번만 수행해도 된다.
           /*+ materialize */

    with hpg as /* high price goods */
    (
        select prod_name, price
        from   prod
        where  price > 100000
    ), lpg as /* low price goods */
    (
        select prod_name, price
        from   prod
        where  price <= 1000
    ), hpg_prod as 
    (
        select prod_name
        from   hpg
    )
    select *
    from   hpg
    union
    select *
    from   lpg
    ;

    select *
    from   (
        select prod_name, price
        from   prod
        where  price > 100000
    ) as hpg
    union

2. 정규화(Normalization)
(1) 개요
    order_list(주문목록)
    order_no    prod        location    trans_fee
    1           pencil      seoul       2500
    2           plate       jeju        5000
    3           nintendo    seoul       2500

    order_list에서 location이 seoul이면 항상 2500원인데
    왜 2500원이라는 데이터를 주문마다 보관하고 있어야 하는가?

    trans_fee_map
    location    trans_fee
    seoul       2500
    jeju        5000

(2) 정규화의 목적
    - 테이블 간의 중복된 데이터를 허용하지 않는 것이 목표
    - 무결성을 유지하면서 DB의 저장 공간을 줄일 수 있음

(3) 정규화의 정의
    - 데이터의 삽입/삭제/수정 시 발생할 수 있는
      이상현상(anomaly)을 줄이는 과정
    - 데이터를 분리하는 것으로 보통 3차까지 진행

(4) 정규화의 종류
    1) 1차 정규화
        - 하나의 컬럼에는 하나의 정보만 존재해야 한다.
          => 원자성

        Building            Cost
        Farm, Factory       50, 100

        Building            Cost
        Farm                50
        Factory             100

    2) 2차 정규화
        - 후보키의 진부분집합에서 부분함수 종속성을 제거
          부분함수적 종속을 완전함수적 종속으로 바꾸는 과정

        이사 테이블
        주민번호    이사일자    일련번호    이름
        1234       2025.8.24    1       홍뿅뿅

    3) 3차 정규화
        - 1차 및 2차 정규화를 만족하고
          이행적 함수적 종속을 갖지 않는 정규형

        - 이행적 함수적 종속
            A를 알면 B를 알고, B를 알면 C를 아는 구조여서
            결국 A를 알면 C를 아는 구조 