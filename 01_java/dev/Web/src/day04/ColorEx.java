package day04;

import java.util.Random;

public class ColorEx {
	
	public static void main(String[] args) {
		// -"\033[색상코드m" + 문장 + "\033[0m]"

		// - 색상코드

		// 30 ~ 37: 일반색상

		// 90 ~ 97: 밝은색상

		// 40 ~ 47: 일반색상(바탕색)

		// 100 ~ 107: 밝은색상(바탕색)

		// AA라는 글자를 8색으로 나타내시오

		// for문을 사용하여 AAAAAAAAAAAAAAAA

		// 일반색 8색을 구현하시오

		// for(int i = 30; i<38; i++) {

		// System.out.print("\033["+i+"m"+"AA"+"\033[0m");

		// }

		// Mu.p("");

		// for(int i = 90; i<98; i++) {

		// System.out.print("\033["+i+"m"+"AA"+"\033[0m");

		// }

		// Mu.p("");

		// for(int i = 40; i<48; i++) {

		// System.out.print("\033["+i+"m"+" "+"\033[0m");

		// }

		// Mu.p("");

		// for(int i = 100; i<108; i++) {

		// System.out.print("\033["+i+"m"+" "+"\033[0m");

		// }

		// 확장 256색을 구현하시오. (바탕색, 글자는 공백1글자로)

		// Mu.p("");

		// for(int i = 0; i < 256; i++)

		// System.out.print("\033[48;5;" + i + "m" + " " + "\033[0m");

		// }

		  

		// True Color(1670만색 256*256*256)

		// RED, GREEN, BLUE 각각을 0~255중 하나로 랜덤으로 뽑는다.

		// 픽셀로 나타낸다. 이 과정을 256번 반복한다.
		Random rd = new Random();

		for (int i = 0; i < 256; i++) {
			int red = rd.nextInt(256);
			int green = rd.nextInt(256);
			int blue = rd.nextInt(256);

			System.out.print("\033[48;2;" + red + ";" + green + ";" + blue + "m" + " " + "\033[0m");

		}

	} 

} 
