Day7

1. Class Design 연습
    => DepartEx.java
    
2. 상속(Inheritance)
(1) 객체 지향 언어의 가장 큰 특징 > 재사용성 > 상속
    상속은 부모 클래스로부터 변수와 메서드를 물려받는 것
    클래스를 만들 때 처음부터 만드는 것이 아니라
    일단 부모로부터 받고 추가적인 것이나 변경해야할 부분 수정

(2) 상속의 특징
    1) 용어
        부모, 슈퍼, 상위, 베이스 : 상속을 주는 클래스가
        자식, 서브, 하위, 파생(Derived) : 상속을 받는 클래스

    2) 상속 방법
        extends 키워드 사용
        class Child extends Parent {

        }

    3) 상속의 특징
        - 단일 상속만 가능
        - 부모 객체가 먼저 만들어지고 자식 객체가 생성
        - 모든 클래스의 조상 : object

    4) super
        - 자식 클래스에서 부모 객체를 부르는 이름
        - super.필드, super.메서드()

(3) 메서드 재정의(Overriding = OverWriting) 
    부모 : print(String str)
    자식 : Print(String aaa)
    => 같은 메서드이다.

    1) 부모 클래스의 메서드를 자식 클래스가 변경하는 것
    2) 메서드명 뿐 아니라 메서드의 변수 타입이 동일
        메서드 명이 같은데 메서드의 변수 타입이 다르다?
        => 메서드 오버로딩(Overloading)
    3) 동일한 이름, 타입의 메서드는 자식이 우선
    4) 부모의 권한과 같거나 낮은 권한
        부모가 public이면 자식은 무조건 public

3. 상속과 다형성
    1) int i = 100;
    double d = i;  // 문제 없음

    double b = 10,34;
    int j = b; // 불가, 넓은 곳에서 좁은 곳으로 못감
    int j = (int)b;  //명시적인 형변환 후에만 가능

    2) 클래스의 형변환
        Parent p = new Child(); // (o)
        Child c = new Parent(); // (X)
        Child c = (Child)p; // (o)

        Parent p = new Parent();
        Child c = (Child)p;         // (x)

        * 이걸 왜 설명하느냐? 이걸 왜 쓰나?
        Food라는 클래스가 있다고 가정
        이 클래스를 100년 후에 누군가가 상속하여
        FrendchFood, koreanFood, AmericanFood로 만들었다.

        Food 활동 당시에
        eatFood라는 메서드가 있었다.
        eatFood(Food f) {
            f를 돈 안내고 맛있게 먹는다;
        }

        FrenchFood ff = new FrenchFood();
        FrenchFood kf = new FrenchFood();
        eatFood(ff), eatFood(kf)가 문제 없이 동작한다.

        상속받은 클래스가 늘어나더라도
        메서드를 고치지 않아도 문제없이 동작한다.

        


