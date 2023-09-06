package p0905;

import java.util.Scanner;

public class J0905_16 {

	public static void main(String[] args) {
		// 1~100 랜덤숫자를 생성해서 맞히는 프로그램을 구현하시오
		// 1~100까지 랜덤숫자 생성
		// 2. 입력
		// 3. 비교
		// 4. 출력
		// 변수, 클래스 선언

		Scanner scan = new Scanner(System.in);
		int[] arrNum = new int[10];
		int random = 0;
		int count = 0; // 숫자갯수를 입력하는 메소드 count 혹은 i int i == int count
		int number = 0;

		// 2.
		random = (int) (Math.random() * 100) + 1;
		// 무한반복
		while (true) {
			System.out.println("[1~100]까지의 숫자를 입력하세요.>>>>>>>>");
			number = scan.nextInt();
			arrNum[count] = number;
			if (random == number) {// 숫자가 맞는지 비교
				System.out.println("[★정 답★] 입니다.");
				break;
			}

			count++;// 도전횟수 1증가

			if (count > 9) {// 도전횟수가 10번인지 확인
				System.out.println("10번을 모두하셨습니다. 프로그램을 종료합니다.");
				count--;
				break;
			} // if-2

		} // while
		System.out.println("도전횟수 : " + (count + 1));

		// 배열을 출력하는 방법
		System.out.print("입력한 숫자 : ");
		for (int i = 0; i < 10; i++) {
			System.out.print(arrNum[i] + "  ");
		} // for
		System.out.println();
		System.out.println("랜덤숫자 : " + random);

	}// main

}// class
