package p0904;

import java.util.Scanner;

public class JA0904_05 {

	public static void main(String[] args) {
		// 10, 5 두수를 입력받아, 큰수만 출력하시오. 큰수 : 5 작은수 : 5출력
		// 1.두수를 입력받아 출력하시오.
		// 2. 두수 비교해서 큰수 출력

		System.out.println("---(활용예제)두수를 입력받아, 큰수만 출력하시오.---");
		// 1. 두수를 출력하시오.
		//내가한거/////////////////////////////
		Scanner scan = new Scanner(System.in);
		System.out.println("두수를 입력하시오.");
		int num01 = scan.nextInt();
		int num02 = scan.nextInt();
		System.out.println("첫번째 입력 숫자 : " + num01);
		System.out.println("두번째 입력 숫자 : " + num02);

		// 2. 두수를 비교해서 큰수를 출력
		if (num01 > num02) {
			System.out.println("큰수는 : " + num01);
		} else if (num01 < num02) {
			System.out.println("큰수는 : " + num02);
		} else if (num01 == num02) {
			System.out.println("두수는 같다.");
		}
		///////////////////////////////////////////////////
		
		
		//1. 두수를 입력
		System.out.println("1번째 입력>>");
		int num1 = scan.nextInt();
		System.out.println("2번째 입력>>");
		int num2 = scan.nextInt();
		
		//2. 두수를 비교
		if(num1>num2) {
			System.out.println("큰수 : "+ num1);
			System.out.println("작은수 :" + num2);
		}else if(num1<num2) {
			System.out.println("큰수 : " + num2);
			System.out.println("작은수 : " + num1);
		} else {
			System.out.println("두수가 같습니다.");
		}
		
		//3. 두수를 출력
		System.out.printf("1: %d, 2:: %d", num1, num2);
		
		System.out.println("---(활용예제 02)두수를 입력받아, 큰수만 출력하시오.---");
		
		
		
	} // MAIN

} // CLASS
