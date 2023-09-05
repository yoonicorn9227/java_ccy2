package p0901;

import java.util.Scanner;

public class JA0901_07 {

	public static void main(String[] args) {
		System.out.println("----조건문을 사용한 대소문자 구분----");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자 1개를 입력하세요.");
		String str = scan.next(); //문자열을 입력받음.
		char ch = str.charAt(0); //String 첫번째 주소값을 문자로 입력
		
		//조건문
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		System.out.println("영문 문자입니다.");
		
		else
		
		System.out.println("영문자가 아닙니다.");
		
		System.out.println("입력한 문자 : " +ch);
		
		System.out.println("----입력한 글자길이----");
		System.out.println("입력한 글자 길이 : " + str.length()); //입력한 글자길이를 알 수 있음.
		System.out.println("입력한 문자 : "+ch);
		
		
	
	}

}
