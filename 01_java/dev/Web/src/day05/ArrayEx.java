package day05;

import java.util.Random;

import utils.Mu;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mu.p("Array Example");

		String[] str = new String[5];
		Mu.p("std.length? " + str.length);
		str[0] = "Eliot";
		str[3] = "Sala";
		Mu.p("std.length? " + str.length);

		// String 배열을 정의하는 2가지 방법
		String[] stdName1 = new String[5];
		String[] stdName2 = { "A", "B", "C", "D", "Federer" }; // 값을 미리 알 경우

		String aaa = new String("James");
		String bbb = "David";
		String ccc = new String("James");
		String ddd = "David";

		// 문자열은 값을 직접 입력하는 경우 같은 값을 갖는 변수끼리 재사용한다.
		// => 메모리 낭비를 막아줄 수 있음
		// => new로 선언하고 값만 같은 지 확인하기 위해서는 equals 메서드를 사용한다.
		Mu.p("aaa == ccc? " + (aaa == ccc));
		Mu.p("bbb == ddd? " + (bbb == ddd));
		Mu.p("aaa === ccc? " + (aaa.equals(ccc)));

		int score1 = 100; // primitive(원시적인) type
		Integer score2 = new Integer(100); // class type
		// Integer class의 기능을 활용하는 것이 아니면 primitive 사용 권장

		int[] scores = { 10, 20, 10, 30, 20 };

		// stdName2와 scores를 이용하여 학생의 이름과 점수를 출력해보세요.
		// 학생이름1 : **점
		// 학생이름2 : **점
		// ...

		for (int i = 0; i < stdName2.length; i++) {
			Mu.p(stdName2[i] + " : " + scores[i]);
		}

		// 2 - dimensional array
		String[][] classStd = { { "A", "B" }, { "C", "D" } };
		// classStd[0][0] ~ classStd[1][1]
		String[] class0 = classStd[0]; // 차원 축소 -> 곰곰히 생각해볼 것

		// for 문의 또다른 형태(Enhanced for)
		Mu.p("");
		Mu.p("Display All Student");
		Mu.p("Enhanced For");
		for (String name : stdName2) {
			Mu.p(name);
			// 이름이 C이면 그만둠
			if (name.equals("C"))
				break;
		}

		for (int score : scores) { // for(친구 : 친구들)
			Mu.p("score : " + score);
		}

		// Enhanced For를 활용한 Difficulty : GOD에 도전
		// String[][] classStd = {{"A","B"},{"C","B"}};
		// 모든 학생들의 이름을 출력해보시오.

		for (String[] cls : classStd) {
			for (String std : cls) {
				Mu.p(std);
			}
		}
		ArrayTest();

	}

	public static void ArrayTest() {
		System.out.println("\n\nArray Test : GOD");
		// 열 개의 이름, 열 개의 임의의 점수(소수점 1자리)
		// 점수 중 최고점과 최저점을 찾은 후
		// 그에 해당하는 이름과 점수를 출력

		// 1. 10개의 이름 설정하기
		String[] names = { "poe", "Doyle", "Cristie", "King", "Queen", "Carr", "Geiko", "Steven", "Seldon", "Nam" };
		// 2. 10개의 임의의 점수(소수점 1자리) 생성하기 - float[] scores
		Random rd = new Random();
		float[] scores = new float[10];

		// (1) 0 ~ 1사이의 소수를 뽑은 후 만드는 방법
		float score1 = rd.nextFloat();
//		Mu.p("score1 : " + score1);
		score1 = score1 * 1000; // score1 : 0 ~ 1000사이의 소수
		score1 = (int) score1; // score1 : 0 ~ 1000사이의 정수
		score1 = score1 / 10;
		Mu.p("score1 : " + score1);

		// (2) 0 ~ 1000사이의 정수를 뽑은 후 만드는 방법
		float score2 = rd.nextInt(1001) / 10F;
		Mu.p("score2 : " + score2);

		for (int i = 0; i < scores.length; i++) {
			scores[i] = rd.nextInt(1001) / 10F;
		}
		// 3. 최고점과 최저점의 인덱스 변수, 최고점과 최저점을 담을 변수 생성
		int indexTop = 0, indexBottom = 0;
		float scoreTop = 0, scoreBottom = 100;

		// 4. 최고점과 처저점 찾기(핵심)
		for (int i = 0; i < scores.length; i++) {
			// 최고점인지 체크
			if (scores[i] >= scoreTop) {
				scoreTop = scores[i];
				indexTop = i;
			}	
			// 최저점인지 체크
			if (scores[i] <= scoreBottom) {
				scoreBottom = scores[i];
				indexBottom = i;
			}
			
		}
		
		// 5. 출력하기
		Mu.p("");
		Mu.p("Top Score : " + scoreTop + "(" + names[indexTop] + ")");
		Mu.p("Bottom Score : " + scoreBottom + "(" + names[indexBottom] + ")");
	
	}
}
