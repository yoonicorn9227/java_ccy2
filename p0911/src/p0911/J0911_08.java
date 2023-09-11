package p0911;

import java.util.Scanner;

public class J0911_08 {
	int result; // 자동으로 0을 넣어줌. 인스턴스변수, 클래스변수는 가능 | 지역변수는 무조건 값을 넣어주어야함

	public static void main(String[] args) {
//입력받고
		// 계산하고
		// 출력
		int result = 0;
		// 객체선언 : [클래스 참조변수 = new 클래스명();]
		J0911_08 j = new J0911_08(); // [객체선언]
		result = j.addInput(); //[참조변수.변수명]
		System.out.println("결과값 : " + result);

	}// MAIN
	
	//인스턴스 메소드 = 객체선언후 [참조변수명.메소드명]
	int addInput() {
		int result = 0;

		// 입력받고 계산하기
		Scanner scan = new Scanner(System.in);
		System.out.print("1번째 숫자 : ");
		int a = scan.nextInt();
		System.out.print("2번째 숫자 : ");
		int b = scan.nextInt();
		result = a + b;

		return result;
	}

}// CLASS
