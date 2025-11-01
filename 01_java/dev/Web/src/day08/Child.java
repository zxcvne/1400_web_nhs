package day08;

import utils.Mu;

public class Child extends Parent{
	String name = "Child";
	
	Child() {
		Mu.p("Child Created");
	}
	
	void print() {
		String name = "Super Child";
		Mu.p("name = " + name);
		Mu.p("this.name = " + this.name);
		Mu.p("familyName = " + familyName);
		Mu.p("super.name = " + super.name);
	}
	
	@Override
	void eat() {
		Mu.p("나" + this.name + "은 저녁 식사를 합니다.");
		// Parent가 먹는 건 다 먹고 추가로 더 먹을 예정
		super.eat();
		Mu.p("아이스크림 먹기");
		Mu.p("불량식품 먹기");
	}
}
