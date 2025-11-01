package day07;

public class RefTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ref1 ref1 = new Ref1();
	}

}

class Ref1 {
	Ref2 ref2;
	
	Ref1() {
		ref2 = new Ref2();
	}
}

class Ref2 {
	Ref1 ref1;
	
	Ref2() {
		ref1 = new Ref1();
	}
}
