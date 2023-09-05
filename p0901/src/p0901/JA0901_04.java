package p0901;

import java.util.Scanner;

public class JA0901_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자2개를 입력하세요."); // 27을 2, 7로분리해야함!
		String number = scan.next();

		
		System.out.println("----주소값 가져오기----");
		// String 분리 - String은 한글자당 주소가 배정됨(주소값 존재:0123456....) |String만 주소값이 있음
		//number.charAt(주소값) -> number에 입력된 값에서 주소값에 해당하는 값을 가져와라.
		char ch1 = number.charAt(0); // 문자열 27 첫번째(2)는 주소값이 : 0 (7)은 주소값이 : 1 | charAt(주소값);
		char ch2 = number.charAt(1); // String에서 해당주소값을 char타입으로 가져오는 명령어.

		// char ch3='2'; //'0'-> 48

		System.out.println(ch1);
		System.out.println(ch2);

		System.out.println("----char타입을 int타입으로 변경----"); // char타입을 int타입으로 변경
		int n1 = ch1 - '0';
		int n2 = ch2 - '0';
		int result = n1 + n2;

		System.out.println("두수 더하기 결과값 : " + result);

		
		
		
		
	}

}
