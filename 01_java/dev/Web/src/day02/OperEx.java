package day02;

import utils.Mu;

public class OperEx {
	public static void main(String[] args) {
		// 1. 대입 연산, 세미콜론 2칸 뒤 주석
		int a = 100;  // a에 100을 할당
		String b = "Winter";
		
		// 2. 대입연산2
		a += 10; // a에 10을 더해서 a에 할당. a = a + 10
		
		// 3. 산술연산
		a = 5 + 5 * 2;  // 15
		a = (5 + 5) * 2;  //a = 20		
		final int NUM_OF_GROUPS = 11;
		int job = 378112324 % NUM_OF_GROUPS;
		Mu.p("담당 그룹은 " + job + "입니다." );
		
		// 4. 산술연산2
		float numf = 10 / 4;  // 정수와 정수의 연산 결과는 정수
		Mu.p("numf = " + numf);
		float numf2 = 10F / 4;
		Mu.p("numf2 = " + numf2);
		
		// 5. 0으로 나누어보기
		//float num = 10 / 0; // exception 부분에서 다시 다룸
		
		// 6. 증감 연산
		int x = 10, y = 10;
		int x1 = x++;  // x를 x1에 넣고 ++처리
		int y1 = ++y;  // y를 ++하고 y1에 넣음
		Mu.p("x1, y1 = " + x1 + ", " + y1);
		
		// 7. 비교연산
		int a1 = 10, a2 = 5;
		Mu.p("a1 == a2 => " + (a1 == a2));
		
		// 8. 논리연산
		Mu.p("true && false => " + (true && false));
		Mu.p("true || false => " + (true || false));
		Mu.p("true ^ false => " + (true ^ false));
		
		// 9. 삼항연산
		int score = 70;
		String dad1 = score > 60? "잘했어" : "!@%$@!@";
		String dad2 = score > 99? "당연" : "그것도 점수냐?";
			Mu.p("dad1, dad2 = " + dad1 + ", " + dad2);
		
			// 점수가 90 점이 넘으면 A , 80점이 넘으면 B, 그 이하는 죄다 F
			score = 65;
			String grade = (score>90)? "A": (score>80)? "B": "F";
			Mu.p("Final Grade : " + grade);
	}
}
