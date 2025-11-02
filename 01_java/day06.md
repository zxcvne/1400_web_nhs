Day6

1. 객체 지향 언어의 특징
(1) 상속(Inheritance)
    하위 클래스가 상위 클래스를 물려 받는 것
(2) 다형성(Polymorphism)
    cf) C : func1(int), func2(float), func3(char)
    같은 이름으로 호출하나
    호출 시 전달한 인자의 타입에 따라 다르게 설계 가능    
(3) 추상화(abstraction)
    사물(객체)의 속성이나 특성을 추출하는 것
(4) 캡슐화(Encapsulation)
    내부를 공개하지 않는 것(예 - 리모콘)
    불필요하게 복잡한 것을 피하고 위험에서 보호

2. 클래스의 구조
(1) 필드(Field)
    클래스가 보유한 변수
    클래스 함수 내에세 생성한 변수는 아님
    멤버 변수(member variable)

(2) 메서드(Method)
    함수인데, 클래스 소속의 함수
    멤버 함수(member function)

(3) 생성자(Constructor)
    클래스가 객체(제품)으로 만들어질 때 반드시 실행되는 메서드
    클래스가 만들어질 때 반드시 해야될 일
    ex) 필드 초기 세팅, 데이터베이스 접속, 객체 수 카운트

* 클래스 탄생 역사
    변수 : 하나의 값만 저장
    배열 : 여러 개의 값을 저장
    구조체(struct) : 여러 종류의 값을 저장 
                    // 자기소개 못함
    클래스 : 여러 종류의 값 뿐만 아니라
            여러 형태의 행동(메서드) 보유 // 자기소개 가능
                    class Man {
                        int age;
                        String name;
                        void introduce(){
                            제 이름은 name구요, 나이는 age입니다.;
                        }
                        static void hello(){
                            안녕하세요.
                        }
                    }
    
                    Man man1 = new Man();
                    man1.name = "신유빈";
                    man1.age = 27;
                    man1.introduce();

3. 요약
    Java로 개발한다 -> 클래스를 만든다
    클래스는 객체로 구현되어야 완성된다.

    Java는 웹 개발에 사용하는 것이 기본
    누가 먼저다 라는 개념은 없음

    Java로 만들어진 객체는 웹 서버(ex 톰캣)가
    관리하는 컨테이너라는 곳에 만들어진다.
    사용자가 요청할 때마다 객체를 잠시 빌렸다가 사용후 반납
    (Singleton)

    Java로 만드는 배치 프로그램
    public static void main(String[])를 실행
    java com.korea.batch.DailyClosure
    DailyClosure.sh

4. 필드와 메서드 2
(1) 클래스 내의 변수
    - 클래스 변수(static) // 다른 클래스에서도 사용할 수 있는 (개성o)
    - 인스턴스 변수 : 객체마다 다를 수 있는 변수 // 클래스 안에서는 자유롭게 사용 가능하지만 다른 클래스에서는 사용할 수 없다. (개성X)
    - 로컬 변수 // 함수 안에서 선언되었다가 함수가 끝나면 사라지는
    ex) void main(){
        int a
    }

(2) 메서드(Method)
    public static void main(String[] args)
    
    접근 제한자 
            [static]
                    리턴타입 
                            함수이름
                                (매개변수들)
                                            // throws Exception

    1) 접근제한자
        이 메서드를 누가 실행할 수 있는가?(권한)
        가장 넓은 권한은 public(누구나)

    2) static
        객체 생성을 하지 않아도 사용할 수 있다.
        왜 객체 생성이 필요없는가?
                => 객체마다 다를게 없다.
                => 그래서 공통 영역에 하나만 만든다.
    
    3) 리턴타입
        메서드가 값을 받기만 하는가? X
        일을 다 하고 결과를 전송해야 할 때
        ex) int add(int a, int b)
                a와 b를 더해서 돌려주는 함수
            void : 돌려주는 것 X
            int, float, double, long, String
            String[] int[] Welcome Welcome[]
    
    4) 메서드명
        변수명 만드는 규칙과 동일, 일반적으로 동사 + 목적어
        printScreen, getMember, getAllVariables

    5) 매개변수
        메서드의 입력값(parameter, argument)
        입력값의 개수가 정해져있을 때(String str)
        입력값의 개수가 정해져있지 않을 때(String[] str)

(3) 메서드 오버로딩(Overloading)
    같은 이름으로 여러 메서드를 구현 가능하다.
    printVar(int a)
    printVar(String a)
    printVar(double[] a)
    -> 자바는 이런 식으로 같은 이름의 메서드를 만들 수 있다.
    -> 사용자 편의성

    - 메서드 오버라이딩(Overriding)과 비교됨 // 덮어쓰기

(4) this와 초기화 블럭
    - this
        객체 본인을 일컫는 말, 현재 이벤트가 발생하는 이 곳
        ex) 표에 커서를 올릴 때마다 그 줄은 빨간색
            onMouseOver(this) {
                this.backgroundColor = red;
            }

    - 초기화 블럭
        2가지의 타입이 있음
        static { }
        {        }     

5. 권한
(1) 패키지
    클래스를 디렉토리별로 관리하기 위한 목적
    - 여러 개의 패키지를 모은 것을 라이브러리 라고 한다.

(2) 접근제어
    public : 누구든지(O)
    protected : 누구든지(X), 상속받은(O), 같은 디렉토리(O), 같은 클래스(O)
    (default) : 누구든지(X), 상속받은(X), 같은 디렉토리(O), 같은 클래스(O)
    private : 누구든지(X), 상속받은(X), 같은 디렉토리(X), 같은 클래스(O)

(3) final
    변수에 final을 붙이면 수정 불가
    메서드에 final을 붙이면 상속 후 수정 불가
    클래스에 final을 붙이면 상속 불가

