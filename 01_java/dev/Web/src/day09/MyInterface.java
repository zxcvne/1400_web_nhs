package day09;

public interface MyInterface {
	int aaa = 500; // 인터페이스에서 변수를 정의하면 자동으로 static이 된다.
	
	void myMethod();
	
	default void dMethod() {
		System.out.println("[dMethod] Called");
	}
	
	default void dMethod2() {
		System.out.println("[dMethod2] Called");
	}
	
	static void sMethod() {
		System.out.println("[sMethod] 누가 저 부르셨어요?");
	}
	
}
