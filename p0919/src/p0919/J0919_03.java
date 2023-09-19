package p0919;

import java.util.Scanner;

public class J0919_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");

		System.out.println("for문을 실행할까요? <1.예 2. 아니오>");
		int choice = scan.nextInt();
		if (choice == 1) {
			for (int i = 0; i < 10; i++) {
				System.out.println(i + 10);
				try {// 예외가 발생이 될것 같은 부분을 넣어줌.
					System.out.println(10 / 0); // ArithmeticExcetion
				} catch (Exception e) {
					e.printStackTrace(); //어떤 에러가 났는지 알려주는 것
					System.out.println("예외가 발생이 되었지만 프로그램을 계속 실행합니다."); 
				} // try-catch |에러가 나도 종료가 안되게 하기위해서.
			} // for
		} // if
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");

	}// MAIN

}// CLASS
