package day09;

public class InterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass mc = new MyClass();
		
		System.out.println("mc.aaa = " + mc.aaa);
		System.out.println("MyInterface.aaa = " + MyInterface.aaa);
		
		mc.dMethod();
		mc.dMethod2();
//		mc.sMethod();
		MyInterface.sMethod();
		
		MyInterface mi = new MyClass();
		mi.dMethod2();
	}

}
