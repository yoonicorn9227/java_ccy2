package p0907;

import java.util.Scanner;

public class J0907_06_01로또 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 선언
		int[] lotto = new int[45];
		int[] myNo = new int[6];
		int[] winNo = new int[6];
		int temp = 0, count = 0;

		// 로또번호 순차입력
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		} // for(로또번호 순차입력)

		// 로또 번호섞기
		for (int i = 0; i < 400; i++) {
			int random = (int) (Math.random() * 45); // 0-44
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		} // for(로또 번호섞기)

		// 6개 당첨 로또번호 추출
		for (int i = 0; i < 6; i++) {
			winNo[i] = lotto[i];
		} // for(6개 로또번호 추출)

		// 직접입력
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호를 입력하세요.");
			myNo[i] = scan.nextInt();
		} // for(직접입력)

		System.out.println();
		System.out.println("--------------------------");
		System.out.println("------<  당첨확인  >--------");
		System.out.println("--------------------------");
		
		//당첨번호출력, 직접입력한 번호 출력, 당첨갯수
		System.out.print(" ★★ 당첨번호 : ");
		for(int i =0; i<6; i++) {
		System.out.printf("%d ", winNo[i]);
		}
		System.out.println();
		
		//직접입력한 번호출력
		System.out.print(" ☞☞ 입력번호 : ");
		for(int i =0; i<6; i++) {
		System.out.printf("%d ", myNo[i]);
		}
		System.out.println();
		
	}//main
}//class
