package day08;

import utils.Mu;

public class Parent {
	String name = "Parent";
	String familyName = "Leopard";
	
	Parent() {
		Mu.p("Parent created");
	}
	
	void eat() {
		Mu.p("나" + this.name + "은 저녁 식사를 합니다.");
		Mu.p("빵 먹기");
		Mu.p("밥 먹기");
		Mu.p("음료수 먹기");
		Mu.p("연타발에서 곱창 먹기");
	}
}
