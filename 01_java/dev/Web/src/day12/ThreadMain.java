package day12;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m1 = new MyThread("인스타그램");
		MyThread m2 = new MyThread("핀터레스트");
		MyThread m3 = new MyThread("걸어서세상속으로");
		
		//run을 직접 실행하면 동시 작업 불가
//		m1.run();
//		m2.run();
//		m3.run();
		
		//start로 실행시켜야 한다.
		m1.start();
		m2.start();
		m3.start();
		
		System.out.println("자 이제 다 내 손을 떠났네 - 모나코에서 유람선");
	}

}
