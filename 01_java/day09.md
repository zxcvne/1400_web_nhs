Day9

1. 인터페이스 II
(1) 클래스와의 비교
    - 상속과 구현은 완전히 다르다.
    - 상속은 부모클래스의 기능을 자식이 물려받는 것
      구현은 자식이 반드시 만들도록 강제
    - 클래스 선언은 class
      인터페이스 선언은 interface
    - 클래스 상속은 extends(연장)
      인터페이스 구현은 implements(구현하다)

(2) 인터페이스의 특징
    1) 하나의 클래스가 여러 개의 인터페이스 구현 가능
    interface I1 { void x(); }
    interface I2 { void y(); }

    class C1 implements I1, I2 {
        void x() {   }
        void y() {   }
    }

    2) 인터페이스 상속이 된다.
    interface I3 {  void x();   }
    interface I4 extends I3 {
        void y();
    }

    class C2 implments I4 {
        void x() {}
        void y() {}
    }

(3) Headaches
    1) default, static : Java8 부터 만들어짐
    2) default : 메서드를 인터페이스가 만듬
        static : 구현한 클래스의 객체 없이 호출 가능
    3) default와 static은 왜 만들어졌을까??
        예) 메서드가 600개가 있던 인터페이스
            많은 기업들이 이 인터페이스로 구축 완료
            Java가 업데이트 되면서 400개 메서드 추가
            => 아무도 업데이트 안함
            => 개발이 끝나고 이미 운영 중
            => 불만도 없고 인력도 없으니 개발을 왜함 ??
            => 400개의 메서드를 Java 회사가 직접 만듬
            => 바꿀려면 바꿀 수 있음

(4) 인터페이스 모호함
    클래스와 사용 불분명(모호함)으로 혼란
    Spring에서 부활
        Spring의 MyBatis에서 java와 SQL(Mapper) 역할 분리
        Java에서는 인터페이스를 만들고 메서드 이름만 부여
        SQL XML에서 이름에 매핑되는 SQL을 작성함
        => Java에서는 구현하지 않았기 때문에
        interface의 기본 사상에 완벽하게 맞음

    => MyInterface.java MyClass.java
       InterMain.java

2. 예외처리(Exception)

(1) 에러
    컴파일 시 발생하는 에러
    런타임 시 발생하는 에러

(2) 예외
    런타임 시 발생하는 에러 중에 
    개발자가 처리 가능한 에러
    cf) 처리가 불가능한 에러
        OOM(Out Of Memory)
            - 예외처리할 메모리도 없음

(3) 예외처리 방법
    int a = 3;
    try {
        예외가 발생할 가능성이 있는 로직;
    }
    catch(예외명1){
        1번 예외에 대해 할 일;
    }        
    catch(예외명2){
        2번 예외에 대해 할 일;
    }        
    ...
    catch(Exception e) {
        예상 불가능한 오류 포함하여 모두에 대해 할 일;
    }
    
    * 몇 영역의 메서드들은 무조건 예외처리를 요청하는 경우가 있음
    ex) Network, Database, File, ...

    메서드 뒤에 throws Exception 계열

(4) 예외 출력 방법
    e.getMessage() : 오류의 기본적인 내용을 문자열로
    e.toString() : 오류의 조금 자세한 내용을 문자열로
    e.printStackTrace() : 오류의 상세 정보를 출력

=> ExceptionTest.java
=> MyExceptionTest.java
