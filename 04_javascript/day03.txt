Day3

* interactive(인터렉티브) 웹
* inflearn

1. 내장 객체(Internal Object)
(1) Date 
    날짜, 시간에 관련된 오브젝트
    var now = new Date();

    getTime() : 1970 1월 1일 0시0분0초 기준의 밀리초
    get* : 각 시간을 구함

(2) Math
    기본 수학 연산에 대한 오브젝트
    floor, ceil, abs 등 기본 함수 보유
    random() : 0 ~ 1 사이의 소수를 돌려줌

2. Timeouts 
(1) setTimeout
    일정 시간 경과 후 실행(1회성)
    setTimeout(실행할 함수, 밀리초)

(2) setInterval
    일정 시간마다 실행
    var handler = setInterval(실행할 함수, 밀리초)

(3) clearInterval
    Interval 설정 취소
    clearInterval(handler)

3. Object(객체)
    객체의 고유한 속성을 Property라고 부르고
    여러 Property(key-value의 쌍)으로 표현됨

    account = {
        name: "Jack:",
        number: "001234-5678901",
        code: "24hour"
    }

    account.프로퍼티명
    account['프로퍼티명']

    객체는 함수를 가질 수 있으며 이를 메서드라고 부름

    account = {
        deposit: funtion(money){
            money를 기존 잔고에 더한다;
        }
    }

    account.deposit(10000);

    account.deposit2 = funtion(money){
        기존 잔액에 money를 추가하고 수수료 500원은 뺌;
    }
    account.owner = "나";

4. JSON(Javascript Object Notation) - 제이슨
    - Javascript용 표기 방식
    - REST API 등에서 많이 사용

    - JSON 표기법으로 작성된 스트링은 Object로 변환이 가능
      Object도 JSON 형태의 스트링으로 변환 가능
    
    - JSON.parse : JSON을 Object로 해석하기
    - JSON.Stringify : Object를 JSON 형태로 바꾸기

5. Array와 Object를 활용한 Menubook 만들기
    - 이름과 가격으로 구성된 아이템
    - 버튼 클릭 시 아이템을 메뉴에 추가
    - 메뉴에서 아이템을 클릭하면 메뉴 삭제

    - Array에 추가 push(), 삭제 splice()를 사용
    - 메뉴판 배경을 책(노트) 이미지로 대체하고
      폰트를 이탤릭체 계열로 바꾸면 퀄리티 상승

 
