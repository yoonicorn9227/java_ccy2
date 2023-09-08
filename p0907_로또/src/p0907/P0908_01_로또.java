package p0907;

import java.util.Scanner;

public class P0908_01_로또 {

	public static void main(String[] args) {

		// [순서]
		// 1. 선언 ->
		// 2. 로또순차입력->
		// 3. 로또번호 섞기->
		// 4. 6개 당첨번호 추출 ->
		// 5. 번호직접입력
		// 6. 당첨번호 출력
		// 7. 직접입력한 번호출력
		// 8. 당첨갯수 확인 출력

		// 1. 선언
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];
		int[] winNo = new int[6];
		int[] myNo = new int[6];
		int temp = 0;
		int count = 0;

		// 2. 로또순차입력->
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;

		}

		// 3. 로또번호 섞기
		for (int i = 0; i < 6; i++) {
			int random = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}

		// 4. 6개 당첨번호 추출 ->
		for (int i = 0; i < 6; i++) {
			winNo[i] = lotto[i];
		}

		// 5. 번호직접입력 | Scanner 이용
		for (int i = 0; i < 6; i++) {
			System.out.println("로또숫자를 입력하세요.>>>>>>>>>");
			myNo[i] = scan.nextInt();
		}

		// 6. 당첨번호 출력
		System.out.print("★[당.첨.번.호]★ 출력 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(winNo[i]);
		}
		System.out.println();
		// 7. 직접입력한 번호출력
		System.out.print("내가 입력한 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(myNo[i]);

		}
		System.out.println();
		// 8. 당첨갯수 확인 출력
		System.out.print("☆[당.첨.횟.수]☆ : ");
		for (int i = 0; i < 6; i++) {
			if (winNo[i] == myNo[i]) {
				count++;
			}
		}
		System.out.println(count);

	}// MAIN

}// CLASS
