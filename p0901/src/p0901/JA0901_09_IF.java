package p0901;

import java.util.Scanner;

public class JA0901_09_IF {
	public static void main(String[] args) {
		//System.out.println("----제 4장 조건문, 반복문----");

		
		//System.out.println("----조건문 if와 switch----");
		//System.out.println("<조건문 if>");
		////////////////////////////////////////////////////////////////
		
		//System.out.println("<01.조건문 1개 사용 if>");
		//<if 조건문 하나만 사용>
		// 아이디가 admin이면 페이지가 열립니다. 문구넣기
//		Scanner scan = new Scanner(System.in);
//		System.out.println("사원번호를 입력하세요.");
//		int number = scan.nextInt(); // 1001 -> CEO | 매출액 메뉴를 볼수 있음
//		
//		System.out.println("[네비게이션 메뉴]");
//		System.out.println("1. 회원정보보기");
//		System.out.println("2. 상품정보보기");
//		System.out.println("3. 회사소개보기");
		
//		if (number == 1001) {
//		System.out.println("4. 회사매출액보기");
			
			
		////////////////////////////////////////////////////////////////		
		System.out.println("<02.조건문 2개 사용 if>");
		
		//if -else 사용
		
	System.out.println("점수를 입력하세요");
	Scanner scan = new Scanner(System.in);
	int score = scan.nextInt();
	
	if(score>=60) {//2줄 이상이면 중괄호({})생략불가
		System.out.println("합격 입니다.");
	} else {
		System.out.println("불합격 입니다.");
	}
			
	
			
			
			
			
			
			


	}
}
