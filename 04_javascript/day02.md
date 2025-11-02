Day2

1. Datetype과 변수
(1) Javascipt의 식별자(이름)
    식별자 : indentifier, 변수, 상수, 함수에 붙이는 이름
    - 1번째 글자 : 알파벳, 언더스코어, $
    - 2번째 글자 이하 : 알파벳, 언더스코어, 숫자, $ 가능
    - 대소문자 구분함
    - 키워드 사용 불가

(2) 문장 구분
      - 세미콜론(;)은 필수 요소는 아님
      - 한 줄에 여러 문장을 기술할 때 구분자로 사용
      i = i + 1
      j = j + 1
      k = k + 1; m = m + 1;

(3) 주석(comment)
    - 한 줄 주석 : //
    - 구간 주석 : /* ~ */

(4) 데이터 타입
    - 숫자(number) : 42, 3.141592
    - 논리(boolean) : true, false
    - 문자(string) : "안녕", "배고파", '라면'
    - 객체 레퍼런스 타입 : 객체(object)를 가리킴
    - undifined, null
        1) undifined : 타입이 정해지지 않았음
        2) null : 값이 정해지지 않았음

    - 데이터 타입을 알아내는 함수(메서드) : typeof()

(5) 변수의 선언
    - var 키워드로 선언
    - var score
    - var yy, mm, dd;
    - var address = '홈리스';

    - var 없이도 변수 사용 가능
      age = 20;
      정상적으로 동작하나, 만약에 상단에 age라는 변수가 
      이미 있었다면 값이 변경되어 버림 => Risk
      var age = 20 으로 사용했다면 오류가 발생하기 때문에
      명료하게 실수를 방지할 수 있음
      => 선언 시 var를 사용하십시오.

(6) 지역변수(local), 전역변수(global)
    - 변수는 사용범위(scope) : 지역과 전역이 있음
    - var로 선언하지 않고 사용하면 무조건 global
    - var로 선언했다면 사용한 곳에 따라서 local, global이 바뀜
        함수(function) 내에서 var로 선언했으면 local
        나머지는 모두 global

2. 호이스팅(Hoisting)
    - 선언의 위치와 관계없이, 존재하면 메모리에 할당

3. 자바스크립트의 또 다른 변수 타입
    - let, const
    - let : 수정 가능, 휘발성 변수
        ex) for(let i = 0; i < 100; i++)
    - const : 수정 불가능
        ex) const SIN90 = 1;
            const div = HTML의 특정 div를 선택
                div의 속성을 마구 변경함
                => 모순 아님?
                   div의 대상을 바꾸는 것은 안됨
                   DOM

4. 함수(Function)
(1) 용어
    인자(Parameter) : 매개변수(선언부, 정의부)
    인수(Argument) : 매개변수 자리에 들어가는 값

    function func1(age){
        이러저러한 활동하기;
    }

    myAge = 900;
    func1(myAge);

(2) 형태
    function 함수명(Param1, Param2, ...) {
        코드 작성;
        return 리턴값;
    }

    함수명 : 동사 또는 동사+목적어

(3) 다양한 함수의 형태 연습
    - 09_function.html