package day04;

import utils.Mu;

public class LoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mu.p("While Example");
		
		int i = 0;
		while(i < 100) {
			Mu.p("현재 i 값은" + i + "입니다.");
			i++;
			i = 10000;
		}
		
		// Infinity Loop
		i = 0;
		while(true) {
			Mu.p("현재 i 값은" + i + "입니다.");
			i++;
			if(i>10)
			break;
		}
		
		// For statement
		Mu.p("For Example");
		
		int j;
		for(j = 0; j < 100; j++) {
			Mu.p("현재 j의 값은" + j + "입니다.");
		}
		
		// do while
		Mu.p("do while Example");
		
		boolean isTeacher = true;
		do {
			Mu.p("야 이 바보야");
		}while(isTeacher != true);
		// 출력이 안될 것으로 생각했으나 출력이 된다.
		// do는 먼저 실행부터 함. 사용시 유의하시오(=쓰지마시오)
		
	}

}
