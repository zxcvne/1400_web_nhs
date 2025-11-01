package day06;

import utils.Mu;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car("Black","MyTrip","Luxury");
		Mu.p(car1.describe());
		Mu.p(car2.describe());
	}

}

class Car{
	String color;
	String name;
	String type;
	
//	 생성자(Constructor)
	Car(){
		color = "미정";
		name = "비밀";
		type = "기본형";
		Mu.p("Cal() is called");
	}
	
	Car(String color, String name, String type){ 
		this.color = color;
		this.name = name;
		this.type = type;
		Mu.p("Cal(...) is called");
	}
	
	// Code Block
	// 생성자들 마다 공통으로 할 일이 있을 경우
	static {
		Mu.p("static { } is called : 오늘의 업무 시작");
	}
	
	{
		Mu.p("{ } is called : 새 손님 오심");
	}
	
	public String describe() {
		return "색상은 " + color + "이고, 이름은 " + name + ", 타입은" + type + "입니다.";
	}
	
}