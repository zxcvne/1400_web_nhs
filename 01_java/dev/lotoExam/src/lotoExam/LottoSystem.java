package lotoExam;

import java.util.Scanner;

public class LottoSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lottoMachine = new int[45];
		int[] lottoBalls = new int[6];
		int bonusNumber = 0;

		// 1 ~ 45
		for (int i = 0; i < lottoMachine.length; i++) {
			lottoMachine[i] = i + 1;
		}

		int count = 0;

		while (count < 7) {
			int index = (int) (Math.random() * (45 - count));
			// 선택된 index의 값이 0이 아니면 아직 미사용, 0이면 사용된 위치
			if (lottoMachine[index] != 0) {
				if (count < 6) {
					lottoBalls[count++] = lottoMachine[index];
				} else {
					bonusNumber = lottoMachine[index];
					count++;
				}
				// 사용 증명
				lottoMachine[index] = 0;
			}
		}

		for (int i = 0; i < lottoBalls.length; i++) {
			System.out.print(lottoBalls[i] + " ");
		}
		System.out.println("보너스 번호 : " + bonusNumber);

		// 사용자가 선택
		count = 0;
		Scanner sc = new Scanner(System.in);
		int[] userLotto = new int[6];

		while (count < 6) {
			System.out.println((count + 1) + " 번째 로또 번호! :");
			int balls = sc.nextInt();
			// 중복체크
			for (int i = 0; i < count; i++) {
				if (userLotto[i] == balls) {
					System.out.println(balls + "는 이미 존재하는 번호 !!");
					balls = 0; // 중복되었다는 의미
					break;
				} 
			} 
			if (balls != 0) {
				userLotto[count++] = balls;
			}
		} 
		sc.close();

		System.out.println("사용자 로또 : ");
		for (int i = 0; i < lottoBalls.length; i++) {
			System.out.println(userLotto[i] + " ");
		}

		System.out.println();

		int matchCount = 0;
		boolean isBonus = false;

		// 비교
		for (int i = 0; i < userLotto.length; i++) {
			for (int j = 0; j < lottoBalls.length; j++) {
				if (userLotto[i] == lottoBalls[j]) {
					matchCount++;
					break;
				}
			}
			// 보너스번호 맞는것 찾기
			if (!isBonus) {
				if (userLotto[i] == bonusNumber) {
					isBonus = true;
				}
			}
		}

		// 등수출력
		if (matchCount == 6) {
			System.out.println("😍당첨!!!! 1등😍");
		} else if (matchCount == 5 && isBonus) {
			System.out.println("😎당첨! 2등😎");
		} else if (matchCount == 5) {
			System.out.println("3등😊");
		} else if (matchCount == 4) {
			System.out.println("4등👍");
		} else if (matchCount == 3) {
			System.out.println("5등");
		} else {
			System.out.println("낙첨입니다.");
		}

	}// main
	
}// class
