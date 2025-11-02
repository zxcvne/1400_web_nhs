Day08

1. super 테스트
    - Super Test.java. Parent.java, Child.java

2. String Class
    String str1 = "abcde";
    String str2 = "abcde";
    str1 == str2 ?  => true

    String str3 = new String("abcde");
    String str4 = new String("abcde");
    str3 == str4 => false

(1) final 클래스로 상속 불가
    int, float ,double과 같은 primitive 데이터형과
    거의 유사한 입지, 취급
(2) new String("~"), "~" 두 가지로 생성 가능
(3) 다수의 메서드들이 존재
    1) length() : 문자열의 길이
        cf) char[] str => str.length
            String str => str.length()
    2) charAt(인덱스) : 인덱스 위치에 있는 글자
        jumin_no = "001231-8000121";
        gender = jumin_no.charAt(7);
    3) equeals(str) : str과 동일한 문자열 값인지 체크
        equalsIgnoreCase(str) : 대소문자 구분 없이
    4) replace(찾을 문자열, 대체 문자열)
    5) substring(시작인덱스, 종료인덱스) 
            결과의 글자 수 = 종료인덱스 - 시작인덱스
            jumin_no.substring(0,6) => "001231"
            jumin_no.substring(7) => "8000121"
    6) trim() : 문자열 앞 뒤의 공백 제거
    7) split(나눌문자) : 나눌문자를 기준으로 문자열의 배열로 돌려줌
    8) matches(정규표현식) : 문자열이 정규표현식에 맞는지 체크
                            (true of false)
        * 정규표현식(regular expression, RegExp) 
          영문자 : A-Za-z
          숫자 : 0-9
          한글 : 가-힣  ex) [가-힣]{1,10}
                            (.*?)\.(exe|sh|zip|alz)$

3. 인터페이스(Interface)
(1) 사전적 의미
    하나의 시스템을 구성하는 두 가지 요소 또는
    서로 다른 시스템 간 상호 작용을 이루는 경계
    하드웨어/소프트웨어/조건/규약 등을 포괄적으로 칭함

(2) Java에서의 인터페이스
    프로그램과 프로그램을 연결하는 것
    한 마디로 요약하면 [규제]
    특정한 규약에 의해 개발하도록 하는 목적
    클래스가 인터페이스를 이용하기로 하였다면,
    인터페이스가 규정한 메서드들을 다 만들어야 함
    인터페이스의 메서드를 구현하지 않으면 컴파일 실패

(3) 왜 만들었을까??
    계산기 프로그램 개발 프로젝트
    계산기 클래스는 A가, 
    계산기를 이용하는 응용 프로그램은 B가 개발

    동시에 개발을 하다보니 B는 A가 개발할 모습을 예측해서 진행
    그런데 나중에 통합 테스트를 하려다보니...
    A는 add(a, b)라고 개발했는데
    B는 add(a[]로 예상하고 개발함)
    => 폭망
    => Tom Wujec : Build a Tower, Build a Team

(4) 사용법
    [public] interface 인터페이스명 {
        [public][static][final] 자료형 상수명 = 값;

        [public] 리턴타입 메서드명(인자);

        [public] default 리턴타입 메서드명(인자){
            메서드 내용;
        }

        [public] static 리턴타입 메서드명(인자){
            메서드 내용;
        }

    }

    class 클래스명 implements 인터페이스명 {

    }

    * 클래스 생성시 가장 복잡한 형태
    class 클래스명 
    extends 부모클래스 
    implements 인터1, 인터2, 인터3...
    throws Exception

