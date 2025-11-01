package day12;

import java.util.ArrayList;

public class LambdaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Standard
		CalculableClass cc = new CalculableClass();
		cc.calculate(100, 1000);
		// 수식이 오래됐네..... 바꿔야? => 본체를 바꿔야 함
		
		// 2. Anonymous Object
		Calculable c1 = new Calculable() {
			public void calculate(int x, int y) {
				System.out.println("[익명객체-일반]" + (x*y));
			}
		};
		c1.calculate(100, 1000);
		
		// 3. Lambda I : 람다식으로 정의하면 자동으로 메서드와 매핑
		// 전제조건 : 인터페이스의 함수가 반드시 1개(구현해야하는)라면 가능
		Calculable c2 = (x, y) -> {
			System.out.println("[람다정식]" + (x*y));
			};
		c2.calculate(100, 1000);
			
		// 4. Lambda II : return이 있는 경우
		CalculableReturn c3 = (x) -> {
			return 3.14 * x * 2;
		};
		System.out.println("[람다리턴]" + c3.calculate(100));
		
		// 5. 인풋이 단 1개인 경우 괄호 생략
		CalculableReturn c4 = x -> {
			return 3.14 * x *2;
		};
		System.out.println("[람다리턴]" + c4.calculate(100));			
		
		// 6. 리턴이 단 한줄이면 중괄호도 생략
		CalculableReturn c5 = x -> 3.14 * x *2;
		System.out.println("[람다리턴]" + c5.calculate(100));
		
		// 7. 인터페이스는 내가 왜 만들어야 하는가? 하는 일도 없는데..
		// UnaryOperator : 1개 입력, 1개 출력
		// BinaryOperator : 2개 입력, 1개 출력
		// Consumer, forEach
		
		// 8. 람다식의 대표적인 예제 -> forEach
		ArrayList<String> al = new ArrayList();
		al.add("Steak");
		al.add("Stripers");
		al.add("Rock Group");
//		(1 == 2 == 3)
		// 1.
//		for(String name : al) {
//			System.out.println(name);
//		}
		// 2.
//		al.forEach(name -> System.out.println(name));
		
		// 3.
//		입력이 들어가서 아무런 가공없이 활용만 될 경우 :: 로 해결
		al.forEach(System.out::println);
		
	}// main

}// class
