package p0904;

import java.util.Scanner;

public class JA0904_03 {

	public static void main(String[] args) {
		
//		System.out.println("<알파벳 x또는 X를 입력하면 프로그램을 종료합니다. 라고 출력하시오.>");
		//알파벳 x또는 X를 입력하면 프로그램을 종료합니다. 라고 출력하시오
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("프로그램을 종료하려면 x 또는 X를 입력하세요.");
//		char result = scan.next().charAt(0); //[charAt(주소값);]문자열을 문자로 변경해주는 명령어
//		
//		if(result=='x' || result=='X') {
//			System.out.println("프로그램을을 종료합니다.");
//		}
		
		//문자 '0'에서 '9'사이의 문자이면 문자 숫자입니다. 그렇지 않은면 문자 숫자가 아닙니다. 출력하시오.
//		System.out.println("문자를 입력하세요.");
//		String A = scan.next();
//		char A1 = scan.next().charAt(0); //문자열일때만 주소값이 생긴다.
//		
//		if(A1>='0' && A1<='9') {
//			System.out.println("숫자가 입력되었습니다.");
//		}else{
//			System.out.println("숫자가 아닙니다.");
//		}
//		
//		System.out.println("문자를 입력하세요.");
//		A1= A.charAt(1); //문자열일때만 주소값이 생긴다.
//		
//		if(A1>='0' && A1<='9') {
//			System.out.println("숫자가 입력되었습니다.");
//		}else{
//			System.out.println("숫자가 아닙니다.");
//		}
//		
		System.out.println("사랑을 영어로 무엇일까요?");
		String result = scan.next();
		if(result.equalsIgnoreCase("love")) { //[equalsIgnoreCase();] 대소문자 구분없게 하는 명령어
			System.out.println("정답 입니다.");
		} else {
			System.out.println("오답 입니다.");
		}
		
		
		
		
		
		
		
		
		

	} //MAIN

} //CLASS
