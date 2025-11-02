Day1

1. 데이터베이스 수업
    - Administrator 계열
    - SQL 개발 계열

2. 데이터베이스(Database, DB)
    - 데이터들의 집합소(저장소), 4가지 조건
    - 통합 : 데이터가 모여 있어야 된다.
    - 저장 : 데이터는 전원이 내려가도 그대로 존재해야 된다.
    - 운영 : 사용하는 데이터이어야 된다.
    - 공용 : 공유할 수 있는 데이터여야 한다.

    데이터베이스는 "파일"이다.

3. 데이터베이스 관리 시스템(DB Management System, DBMS)
    - 정의(Definition) : 데이터베이스 정의(사원, 부서, 고객)
    - 조작(Manipulation) : 데이터 조회/삽입/수정/삭제를 쉽고 빠르게
    - 제어(Control) : 허가된 사용자만 접근하도록 보안/권한 관리

4. DBMS의 종류
    - RDBMS(Relational DBMS) : 관계형DB, 전체의 95% 이상
        회원 : 회원ID, 성명
        주문 : 회원ID, 주문번호, 주문일, 결제방법
    - NoSQL(Not Only SQL) : MongoDB, Berkeley DB

5. RDBMS의 종류
    - Oracle : 독보적 1황, 압도적인 기능과 성능
    - Microsoft SQL Server(Windows NT, Windows Server)
    - MySQL(Oracle이 인수), Maria DB(무료)
    - PostgreSQL
    - Tibero(국산, TMaxSoft)
    - HANA(메모리DB)

6. 기본 용어
    - table : 데이터를 담는 통
    - row : 행, record, 하나의 독립된 데이터
    - column : 열, field, 같은 속성

    ex) 우리나라 국민 테이블
    주민등록번호    이름    주소    성별
    1234567       강감찬  서울어디  남
    1267123       부엉이  제주어디  여

    - index : 특정 데이터를 빠르게 찾아내기 위한 오브젝트

7. Maria DB + DBeaver
    root / 1234   port : 9933
    설치 완료 후 HeidiSQL 실행
    커넥션을 Web이라고 이름 짓고 내용에서 root pw와 포트 변경
    접속 확인 후 Web(커넥션명) 우클릭 > New > 데이터베이스
    이름을 web으로 하고 생성(언어타입을 utf8mb3_general_ci)
    생성 완료 시 정상 설치 확인된 것임

8. index
(1) Primary Key(PK)
    절대 이것이 똑같은 row는 이 테이블에 없다.
    1개 컬럼일 수도 있고 두 개 이상의 컬럼으로 이루어질 수도 있음
    
    국민테이블 : 주민번호
    주소변경이력 : 주민번호 + 변경일자 + 일련번호    

    모든 테이블에는 PK를 만드는 것이 원칙
    테이블 간의 연관관계를 표현하는 ERD에도 표현
    일종의 제약 조건(Constraint)
    로그성 데이터(인서트는 많으나 조회는 거의 안하는)는
    때때로 안 만들기도 함
    null을 허용하지 않음

(2) Unique Key(UK)
    절대 이것이 같은 row는 이 테이블에 없다.
    null을 허용함

    주소변경이력을 unique로 설정한 경우라면
    주민번호1 + null + null
    주민번호1 + null + null
    이 허용된다.

    null을 미확정이라고 보는 것

(3) 일반 인덱스(key)
    조회 속도 개선을 위해 만드는 인덱스
    PK, UK도 인덱스의 일종

    인덱스(주민번호)
    0012123062123  rowid(파일X에 X번블럭의 X번째 줄)

(4) 그럼 인덱스를 많이 만들면 좋은 것 아님?
    정답은 아님

    1) 인덱스 만들 때마다 용량이 추가로 필요함
    2) 조회 성능은 개선되나 삽입/수정 속도는 저하





