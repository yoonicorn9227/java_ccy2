package p0906;

import java.util.Arrays;
import java.util.Scanner;

public class J0906_05 {
	public static void main(String[] args) {
		int[] lotto = new int[45]; // 전체번호
		int[] winLotto = new int[6]; // 당첨번호
		int[] myNum = new int[6]; // 입력번호
		Scanner scan = new Scanner(System.in);

		// 1-45 번호입력
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;

		} // for(번호입력)

		// 번호섞기
		for (int i = 0; i < 500; i++) {
			int random = (int) (Math.random() * 45); // 0~44
			int temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		} // for(번호 섞기)

		// 당첨번호 입력
		for (int i = 0; i < 6; i++) {
			winLotto[i] = lotto[i];
		} // for(당첨번호 입력)
		Arrays.sort(winLotto);

		// 내번호 입력
		for (int i = 0; i < 6; i++) {
			System.out.println("로또번호를 입력하세요.(1-45)");
			myNum[i] = scan.nextInt();
		}
		Arrays.sort(myNum); // 순차정령 -낮은 숫자가 처음에 옴

		// 번호출력
		System.out.println("----------------------------");
		System.out.println("  ★☆로또 105호차 번호☆★");
		System.out.println("----------------------------");

		// 나의번호출력
		System.out.print("♣나의 입력번호 ♣ : ");
		for (int i = 0; i < myNum.length; i++) {
			if (i == 0) {
				System.out.print(myNum[i]);
				continue;
			}
			System.out.print(", " + myNum[i]);
		}

		System.out.println();

		//당첨번호출력
		System.out.print("★ 당 첨 번 호 ★ : ");
		for (int i = 0; i < 6; i++) {
			if (i == 0) {
				System.out.print(lotto[i]);
				continue;
			} // if(첫번째 값 쉼표 삭제)
			System.out.print(", " + winLotto[i]);

		} // for(출력)
		System.out.println();

	}// MAIN
}// CLASS
