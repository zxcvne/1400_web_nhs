package day02;

import utils.Mu;

public class VariableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mu.p("Variable Example");
		
		// 1. int, long, float, double
		int var1 = 30; // 정수를 정수에
		long var2 = 30; // 정수를 정수보다 큰 곳에
		
		double var3 = 3.1; // double을 double에 => 문제 전혀 없음
		// float var4 = 3.1; // double을 float에 => 넓은 곳에서 좁은 곳으로는 그냥 못감
		float var4 = (float)3.1; // 명시적 표현 필요

		int var5 = (int)3.1; // 소수점 이하를 자를 때 자주 쓰는 trick #프로그래밍에서 trick => 테크닉이라는 뜻
		Mu.p("var5 = " + var5);
		
		double var6 = var5;
		Mu.p("var6 = " + var6);
		
		float var7 = 3.1F;
		long var8 = 3L;
		
		// 2. char 문자로 지정하면 숫자로 저장되며, 읽으면 다시 문자처럼 보여줌
		char ch1 = 'a';
		char ch2 = 0x61; // ASCII(American Standard Code for Information Interchange)
		Mu.p("ch1, ch2 = " + ch1 + ", " + ch2);
		
		// 3. String
		String myName = "BTS"; // 문자열
		Mu.p("My name is " + myName);
		
		// 4. boolean : true of false
		boolean b1 = true;
		boolean b2 = 3 < 5;
		Mu.p("b1, b2" + b1 + ", " + b2);
	}

}
