package day08;

import utils.Mu;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.length()
		String str1 = "qoewrkwqkfnksdahfkjhsdk";
		String str2 = "한글은요?"; // 한글도 1글자로 인식

		Mu.p("[length()] eng : " + str1.length());
		Mu.p("[length()] kor : " + str2.length());
		Mu.p("====================================");
		// 2. charAt()
		String str3 = "이것도 한글이 궁금합니다.";
		Mu.p("[charAt(0)] : " + str3.charAt(5));
		Mu.p("====================================");
		// 3. equals, equalsIgonreCase
		String str4 = new String("abcde");
		String str5 = new String("abcde");
		Mu.p("[equals()] : " + (str4 == str5));
		Mu.p("[equals()] : " + (str4.equals(str5)));
		String str6 = new String("ABCDE");
		Mu.p("[equals()] : " + (str4.equals(str6)));
		Mu.p("[equals()] : " + (str4.equalsIgnoreCase(str6)));
		Mu.p("====================================");
		// 4. replace()
		String str7 = "Heaven helps those who help themselves";
		String str8 = "help";
		Mu.p("[replace()]" + str7.replace(str8, "____"));
		Mu.p("====================================");
		// 5. substring()
		String str9 = str7.substring(0, 4);
		Mu.p("[substring()] : " + str9);
		Mu.p("====================================");
		// 두 번째 인자를 생략한 경우
		String str10 = str7.substring(5); // 인덱스 5부터 끝까지
		Mu.p("[substring()] : " + str10);
		Mu.p("====================================");
		// 실습 : str11에 str7의 오른쪽 5글자를 넣으시오.
		String str11 = str7.substring(str7.length() - 5);
		Mu.p("[substring()] : " + str11);
//		String str12 = str7.substring(-5);
//		Mu.p("[substring()] : " + str12);

		// 6. trim()
		Mu.p("[trim()] : " + "       검색어 ".trim());
		Mu.p("====================================");

		// 7. split()
		String[] str13 = str7.split("helps");
		for (String s : str13) {
			Mu.p("[split()] : " + s);
		}
		Mu.p("====================================");
		// 단어별 스플릿
		String[] str14 = str7.replace(".", "").split(" ");
		for (String s : str14) {
			Mu.p("[split()] : " + s);
		}
		Mu.p("====================================");
		// 글자별 스플릿
		String[] str15 = str7.replace(".", "").replace(" ", "").split("");
		for (String s : str15) {
			Mu.p("[split()] : " + s);
		}
		Mu.p("====================================");
		// 구분자가 2개일 때는 어떻게 할건가? e 또는 공백(" ")
		String[] str16 = str7.split("[e ]");
		for (String s : str16) {
			Mu.p("[split()] : " + s);
		}
		Mu.p("====================================");
		// 8.matches(regular expression)
		// str17번이 전화번호 타입인지 아닌지를 체크해보자.
		String str17 = "010-1234-1234";
		String rule = "[0-9]{3}[-][0-9]{3,4}[-][0-9]{4}";
		boolean result = str17.matches(rule);
		Mu.p("[matches()] : " + (result? "전화번호 맞다": "너 뭐 입력한거냐"));
		
		// 일이팔삼구육사
		
	}

}
