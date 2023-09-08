package p0908;

import java.util.Scanner;

public class J0908_01 {

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
		// 9. 본인이 맞춘 당첨번호 출력
		
		// 1. 선언
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];
		int[] winNo = new int[6];
		int[] myNo = new int[6];
		int[] myWinNo = new int[6];//내가 당첨된 번호
		int temp = 0;
		int count = 0;
		
		// 2. 로또순차입력
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		} // FOR(2. 로또순차입력)

		// 3. 로또번호 섞기
		for (int i = 0; i < 6; i++) {
			int random = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		} // FOR(3. 로또번호 섞기)

		// 4. 6개 당첨번호 추출
		for (int i = 0; i < 6; i++) {
			winNo[i] = lotto[i];
			System.out.printf("%d\t", winNo[i]);
		} // FOR(6개 당첨번호 추출)
		System.out.println();
		// 5. 번호직접입력 | Scanner 이용
		for (int i = 0; i < 6; i++) {
			System.out.println("로또숫자를 입력하세요.>>>>>>>>>");
			myNo[i] = scan.nextInt();
		} // FOR(5. 번호직접입력 | Scanner 이용)

		// 6. 당첨번호 출력
		System.out.print("★[당.첨.번.호]★ : ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d\t", winNo[i]);
		} // FOR(6. 당첨번호 출력)

		System.out.println();

		// 7. 직접입력한 번호출력
		System.out.print("◆[마.이.넘.버]◆ : ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d\t", myNo[i]);
		} // FOR(7. 직접입력한 번호출력)

		System.out.println();
		// 8. 당첨갯수 확인 출력
		System.out.print("☆[당.첨.횟.수]☆ : ");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (winNo[i] == myNo[j]) {
					myWinNo[count]=winNo[i];
					count++;
					break;
				}
			}
		}
		System.out.print(count + " 개");
		
		// 9. 본인이 맞춘 당첨번호 출력
		System.out.print("내가 맞힌 당첨번호 : ");
		for(int i = 0; i<count; i++) {
			System.out.printf("%d", myWinNo[i]);
		}
		
		
		if(count==6) {
			System.out.println("★축하합니다!★ [★1등★]입니다.");
		}


	}// MAIN

}// CLASS
