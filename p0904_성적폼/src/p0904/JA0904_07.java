package p0904;

import java.util.Scanner;

public class JA0904_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 랜덤숫자 1-100까지 5개의 랜덤숫자를 생성해서 변수에 저장후 출력하시오. (숫자 중복가능)
//		int num = (int) (Math.random() * 100) + 1;
//		int num2 = (int) (Math.random() * 100) + 1;
//		int num3 = (int) (Math.random() * 100) + 1;
//		int num4 = (int) (Math.random() * 100) + 1;
//		int num5 = (int) (Math.random() * 100) + 1;
//		System.out.println("난수값 : " + num);
//		System.out.println("난수값 : " + num2);
//		System.out.println("난수값 : " + num3);
//		System.out.println("난수값 : " + num4);
//		System.out.println("난수값 : " + num5);

		// 1부터 10까지의 랜덤숫자를 1개 생성후 출력하시오. 1개만 출력
		int random = (int) (Math.random() * 10) + 1;
//		int num01=0;
//		int num02=0;
//		int num03=0;
		int num01 = 0, num02 = 0, num03 = 0;
		
		//1.
		System.out.println("첫번째 숫자를 입력하세요.");
		num01 = scan.nextInt();
		if (num01 == random) {
			System.out.println("당첨 입니다.");
		} else {
			System.out.println("결과 : 꽝");
		}
		
		//2.
		System.out.println("두번째 숫자를 입력하세요.");
		num02 = scan.nextInt();
		if (num02 == random) {
			System.out.println("당첨 입니다.");
		} else {
			System.out.println("결과 : 꽝");
		}
		
		//3.
		System.out.println("세번째 숫자를 입력하세요.");
		num03 = scan.nextInt();
		if (num03 == random) {
			System.out.println("당첨 입니다.");
		} else {
			System.out.println("결과 : 꽝");
		}
		
		//입력한 숫자 출력
		System.out.printf("입력번호 : %d, %d, %d \n", num01,num02,num03);


		// 3개의 숫자를 입력받아, 정답을 맞히는 프로그램을 구현하시오.
		// 1개 입력받아 맞는지 확인 | 정답이면 정답 오답이면 오답 출력
		// 3개의 입력값을 출력 | 출력형태는 입력번호 : 1,9,7

		// 정답번호 : 5
		System.out.println("당첨번호 : " + random);

		
		
		
	} // Main

} // Class
