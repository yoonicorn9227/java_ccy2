package p0915_test;

import java.util.Scanner;

public class J02 {

	public static void main(String[] args) {

	//	4개의 숫자를 입력받아, JMethod cal2 메소드를 만들어서
		//4개 숫자더하기와 곱하기를 한 결과값을 main에서 출력
		
		Scanner scan = new Scanner(System.in);
	//1.변수 사용법	
//		System.out.println("첫번째 숫자를 입력하세요.");
//		int n1 = scan.nextInt();
//		System.out.println("두번째 숫자를 입력하세요.");
//		int n2 = scan.nextInt();
//		System.out.println("세번째 숫자를 입력하세요.");
//		int n3 = scan.nextInt();
//		System.out.println("네번째 숫자를 입력하세요.");
//		int n4 = scan.nextInt();
//		
//		// 4칙 연산 총합을 구해서 출력
//		// 객체선언 후 참조변수명.메소드명
//		JMethod s = new JMethod(); //객체선언 
//		int result = s.calculate2(n1,n2,n3,n4);//참조변수명.변수명(n1,n2,n3,n4)
//		
//		
//		
//		System.out.println("결과값 : "+result);
		
		//2.배열사용
		int[]n= new int[4];
		for(int i=0; i<n.length ;i++ ) {
			System.out.printf("%d번째 숫자를 입력하세요.\n" + i+1);
			n[i]=scan.nextInt();
		}
		JMethod s = new JMethod(); //객체선언 
		int result = s.cal2(n[0],n[1],n[3],n[4]);
		int result2 = s.cal2(n);
		
		System.out.println("결과값 : " + result);
		System.out.println("결과값 : " + result2);
	}//MAIN

}//CLASS
