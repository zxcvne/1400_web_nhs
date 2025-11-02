Day10

1. 기본 클래스(Base Class)
(1) System
    System.out.println("Hello world!");

    System s = new System(); (이렇게 안함)
    out은 System의 static 변수이다.
    in도 System의 static 변수이다.

    System.currentTimeMillis()
        : 현재 시간을 밀리초 단위로 리턴
        : 1970년 1월 1일 0시 0분 0초 기준

        어디에 씀?
        변수1 = System.currentTimeMillis();
        나의 로직 수행
        변수2 = System.currentTimeMillis();
        변수2 - 변수1 = 나의 로직이 수행된 시간(ms)

(2) StringBuffer
    String은 값이 바뀔 때마다 새롭게 공간을 만들고 값을 넣음
    StringBuffer는 새로 할당하지 않는다.

    String은 값을 비교하는 equals()가 있으나
    StringBuffer는 없음
    대신 StringBuffer는 toString() 메서드가 존재하여
    A.toString().equals(B.toString)

    insert, delete, append

(3) Math 
    abs(값) : 절대값(양수는 그대로, 음수는 양수로)
    ceil, floor : 올림, 내림
                  ceil(3.4) => 4
                  ceil(-3.4) => -3
    round(300.45) => 300
    rount(300.45, 1) : 일반적인 타 언어에서는 존재 
                       Java는 없음
    => 일단 10을 곱한다 => 3004.5
    => round를 씌운다 => 3005
    => 다시 10으로 나눈다 => 300.5\

    min(a,b). max(a,b) : a, b 중 최소, 최대   
    "10001" "2"

(4) Date, Calendar
    날짜와 달력
    

2. Collection Framework
(1) 개요
    코딩 중에 객체(기본형 포함) 여러 개를
    저장하고 꺼내쓰는 경우가 빈번
    => 가장 간단하게 구현한 것이 배열[]

    배열 선언 방법
        데이터타입[] 배열명 = new 데이터타입[개수];
        int[] socres = new int[5];

    배열은 전체 개수를 알고 있을 때에는 사용이 편리
    전체 개수를 모르거나 변경이 가능할 때
    - 매번 생성 시 1000개씩 만들자 -> 공간 낭비
    - 배열에서 데이터를 지우면 그 공간은 빈 자리
    => 배열의 알려진 문제점 + 잘 알려진 구조로
        데이터 추가/삭제/검색이 편리하도록
        java.util 패키지 안에 여러 개의 인터페이스와 클래스를 추가
    => 이것을 컬렉션 프레임워크라고 부른다.

(2) List
    - 객체를 일렬로 늘어놓은 구조
    - 객체를 인덱스로 완리
    - 객체를 저장하면 인덱스를 자동으로 부여
    - 인덱스로 객체 검색, 삭제, 변경 가능

    * 대표적인 리스트
    ArrayList, Vector, LinkedList

(3) Set  
    - 집합, 복주머니 속의 구슬
    - 중복을 허락하지 않음
    - 저장 순서 보장하지 않음
    - 데이터 검색 속도가 매우 빠름
    - 대표적인 클래스가 HashSet, TreeSet

(4) Map
    - Key-value 로 구성된 Entry
    - {name} : {James}, {age} : 25
    - REST API에서 사용하는 데이터 타입과 동일
    - Key가 중복 저장 안됨, Value는 가능
    - 대표적인 클래스로 HashMap, TreeMap이 있음

