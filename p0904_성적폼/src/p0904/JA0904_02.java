package p0904;

import java.util.Scanner;

public class JA0904_02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
//		System.out.println("love의 뜻은 무엇인지 입력하세요.");
//		String result = scan.next();
//		if(result.equals("사랑")) { //String은 참조형 변수이기떄문에 [==] 아니라 [.equals] 명령어 사용 | 8가지 기본타입이 아닌 경우, equal
//			System.out.println("정답 입니다.");
//		} else {
//			System.out.println("오답 입니다.");
//		}
		
		//System.out.println("5곱하기 4는 얼마일까요?");
		//int score=scan.nextInt();
		//if(score==20) {
			//System.out.println("정답 입니다.");
		//} else
			//System.out.println("오답 입니다.");
		
		//두수를 입력받아, 두수의 곱을 맞추는 프로그램 구현하시오.
		// 1. 두수를 입력받아, 출력하시오
		// 2. 두수의 곱의 정답을 입력해서, 맞으면 정답/틀리면 오답이라고 출력하시오.
		
		//1.
//		System.out.println("두수를 입력하시오.");
//		String number=scan.next();
//		char num1 = number.charAt(0); 
//		char num2 = number.charAt(1);
//		System.out.println(num1);
//		System.out.println(num2);

		////////////////////////////////////////////////////////////	
		
		System.out.println("1번째 숫자를 입력하세요.");
		int num01 = scan.nextInt();
		System.out.println("2번째 숫자를 입력하세요.");
		int num02=scan.nextInt();
			
		//2. 
		
		System.out.printf("%d*%d는 얼마일까요?\n", num01, num02) ;
		int score = scan.nextInt();
		
		if(score==(num01*num02)) {
			System.out.println("정답 입니다.");
		} else {
			System.out.println("오답 입니다.");
		}

	}// MAIN

}// CLASS