Day2

1. 변수(Variables)
    - 변할 수 있는 값 < - > 상수 (Constant)
    - 크게 문자형과 숫자형으로 나누어짐
      문자 1 + 1 = 11 | 숫자 1 + 1 = 2
    - 문자형 : char, String
    - 숫자형 : int, long, float, double
              int : -21억XXX ~ 21억XXX
              long : int로 표현할 수 없는 정수 범위
              float, double은 소수점이 있는 숫자형
    - 기타형 : boolean(true of false)

    - 변수 이름 명명 규칙
        숫자로 시작 X : 1num(X), num1(O)
        특수기호는 $와 _만 허용
        자바의 reserved word(예약어)는 사용 불가

    표기법은 2가지
        myAge : 카멜 표기법
        my_age : 스네이크 표기법

cf) 상수 : PI, NUM_OF_SAMPLES
    시스템 변수 : _또는__로 시작

2. 연산(Operation)
(1) 대입 연산(Assignment)
    = : (왼쪽) = (오른쪽)   (오른쪽)을 (왼쪽)에 넣는다.
    += : 더해서 넣는다. i += 1; i = i + 1;
    -=, *=, /= 도 가능하나 보기 힘듬

(2) 산술 연산
    우리가 알고 있는 사칙연산(+-*/)
    나머지를 구하는 %
    주민번호가 들어있는 데이터 100만건
    작업을 10개로 분할하여 수행할 예정이다?
    => 주민번호 맨 뒷자리로 분할 가능
    작업을 31개로 분할하면?
    => 주민번호 뒤 세자리 % 31 => 0~30까지 나오고 이를 작업번호로

(3) 증감 연산
 ++ : 1 증가
 -- : 1 감소

    int a = 10;

    (1) int b = a++ => b는 얼마인가? 10
    (2) int c = ++a => c는 얼마인가? 11

    (1)의 케이스는 b = a; a++;

(4) 비교 연산 : 비교를 한 후 결과가 true 또는 false
    A > B : true, false
    A < b , A >= B
    A == B : A와 B가 같은가?
    A != B : A와 B가 다른가?

(5) 논리 연산 : 여러 개의 true/false를 연결하는 연산
    A조건식 && B조건식 : and
    A조건식 || B조건식 : or
    A조건식 ^ B조건식 : XOR, exclusive OR, 베타적 OR
                       A와 B의 결과가 다르면 true

                       ex) A, B 가 시골 화장실 등불
                           둘다 켜면 전기세 낭비
                           둘 다 끄면 귀신나옴

    !A조건식 : not A

(6) 삼항연산(삼항조건문)
    조건식? A : B => 조건식이 true이면 A, false이면 B
    