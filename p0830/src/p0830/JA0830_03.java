package p0830;

public class JA0830_03 { // 클래스 이름은 대문자로 쓴다.
	public static void main(String[] args) {// 변수는 소문자로 쓴다.
		final int NUM3 = 100; // 상수이름은 대문자로 쓸것 (상수선언)
		int num1 = 1000; // 변수 선언 설정하고 출력 (변수선언)
		int num2 = 50;
		int temp = 0; // 변수는 선언한 후에 반드시 값이 들어가야함, 값이 들어가기전에 사용시 에러발생
		// int (while, for, system true등)은 예약어로 사용x
		// 합성어 쓸경우 특수문자 사용( _나 $ 사용) -> (예시) int company_intro / int companyIntro
		int temp2 = 0;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		System.out.println(temp);
		num1 = 10;
		num1 = 300;
		//NUM3 = 100; // final int num3 = 100; 이미 final값으로 선언되어 있으므로 /final int NUM3 = 100; 로표기
		// 상수는 값을 변경할 수 없음

	}
}
