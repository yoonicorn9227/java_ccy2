package p0911;

import java.util.Scanner;

public class J0911_04 {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;

		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1번째 수를 입력하세요.(0입력해서 종료)");
			a = scan.nextInt();
			// 0입력해서 종료
			if(a==0) {
				System.out.println("[대수비교 종료]");
				break;
			}
			System.out.println("2번째 수를 입력하세요.");
			b = scan.nextInt();
			
			J0911_04 j = new J0911_04(); // 객체선언 | 클래스 변수면 삭제!
			int result =j.max(a, b); //같은 클래스내에 선언 되어있으면 클래스명 생략가능
			System.out.println("큰 수 : " + result);
			
			
		}//while
		

	}// MAIN

	// static 있으면 클래스 변수 <객체선언없이 클래스명.변수명 ,
	// static이 없으면 인스턴스 변수 <객체선언후 | [참조변수명.변수명]>
	// static 있으면 클래스 메소드 <객체선언없이 클래스명.메소드명
	// static이 없으면 인스턴스 메소드 - <객체선언후 |[참조변수명.메소드명]>

	static int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}// if(max)

}// CLASS
