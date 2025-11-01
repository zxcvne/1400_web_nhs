package day03;

import java.util.Random;

import utils.Mu;

public class RandomEx {

	public static void main(String[] args) {
		Random rd = new Random();
//		Mu.p("nextInt() : " + rd.nextInt());
//		Mu.p("nextInt(100) : " + rd.nextInt(100));
//		Mu.p("nextFloat() : " + rd.nextFloat());
//		Mu.p("nextDouble() : " + rd.nextDouble());	
		
		// nextInt(N) : 0 ~ N-1까지 중 하나가 나온다는 것을 이용하여
		// 주사위 범위(1 ~ 6) 중 하나가 나오도록 만들어 보시오(실습)
//		int BASE = 1;
//		int result = rd.nextInt(6) + BASE;
//		
//		Mu.p("랜덤 주사위: " + result);
		
		// Random Alphabet(A-Z)
//		char rchar = (char)(rd.nextInt(26)+65);
//		
//		Mu.p("랜덤 알파벳: " + rchar);
		
		// Random Alphabet(A-Z, a-z)
		// 'A' => 0x41, 65 'a' => 0x61, 97
//		char l_alpha = (char)(rd.nextInt(26)+65);
//		char s_alpha = (char)(rd.nextInt(26)+97);
//		
//		Mu.p("랜덤 알파벳 \n" + "대문자: " + l_alpha + "\n소문자: " + s_alpha);
		
		char rchar = (char)(rd.nextInt(26)+ 65 + 32 *rd.nextInt(2));
//		Mu.p("랜덤 알파벳 : " + rchar);
		
		String resetPassword = "";
		resetPassword +=(char)(rd.nextInt(26)+ 65 + 32 * rd.nextInt(2));
		resetPassword +=(char)(rd.nextInt(26)+ 65 + 32 * rd.nextInt(2));
		resetPassword +=(char)(rd.nextInt(26)+ 65 + 32 * rd.nextInt(2));
		resetPassword +=(char)(rd.nextInt(26)+ 65 + 32 * rd.nextInt(2));
		resetPassword +=(char)(rd.nextInt(26)+ 65 + 32 * rd.nextInt(2));
		resetPassword +=(char)(rd.nextInt(26)+ 65 + 32 * rd.nextInt(2));
		resetPassword +=(char)(rd.nextInt(26)+ 65 + 32 * rd.nextInt(2));
		resetPassword +=(char)(rd.nextInt(26)+ 65 + 32 * rd.nextInt(2));
		Mu.p("당신의 새로운 패스워드: \n" + resetPassword);
	}

}
