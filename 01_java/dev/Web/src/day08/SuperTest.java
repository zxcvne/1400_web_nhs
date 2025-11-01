package day08;

import utils.Mu;

public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		Child c = new Child();
		
		c.print();
		Mu.p("==================================");
		p.eat();
		Mu.p("==================================");
		c.eat();
	}

}
