package p0911;

import java.util.Scanner;

public class J0911_10 {

	public static void main(String[] args) {
		Cal c = new Cal();
		Scanner scan = new Scanner(System.in);
		// 두수를 입벽받아
		System.out.print("1번째 숫자 : ");
		c.num1 = scan.nextInt();

		System.out.print("2번째 숫자 : ");
		c.num2 = scan.nextInt();
		System.out.println("주소값 : "+c);
		
		calculate(c); //c는 주소값
		System.out.println("더하기 결과값 : " + c.addResult);
		System.out.println("빼 기 결과값 : " + c.subResult);
		System.out.println("곱하기 결과값 : " + c.multiResult);
		System.out.println("나누기 결과값 : " + c.divResult);

	}// MAIN

	static void calculate(Cal c2) { //주소값을 받는다 의미
		System.out.println("주소값 : "+ c2);
		c2.addResult = c2.num1 + c2.num2;
		c2.subResult = c2.num1 - c2.num2;
		c2.multiResult = c2.num1 * c2.num2;
		c2.divResult = c2.num1 / (double)c2.num2;
	}//메소드(calculate)

}// CLASS
