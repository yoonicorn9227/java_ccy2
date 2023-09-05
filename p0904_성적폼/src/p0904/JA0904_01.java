package p0904;

import java.util.Scanner;

public class JA0904_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("------제4장. 조건문 사용-------");
		System.out.println("(활용예제)<조건문은 사용한 합/불>");
		// 점수를 입력받아 60점이상 합격
//		System.out.println("점수를 입력하세요.");
//		int score = scan.nextInt();
		// 조건문
		//if (score >= 60) {
			//System.out.println("합 격 입니다.");
		 //else {
			//System.out.println("불합격 입니다.");
		//System.out.println("점수 :" + score);


		System.out.println("------------------------");
		//숫잘르 입력받아 0보다 크면 0이상인 숫자입니다.
		//0보다 작으면 0미만 숫자입니다.
		//0이면 0입니다.
		
//		System.out.println("숫자를 입력하세요.");
//		int number = scan.nextInt();
//		
//		if(number>0) {
//			System.out.println("0보다 큰수입니다.");
//		}else if(number<0) {
//			System.out.println("0보다 작은수입니다.");{
//		}else {
//				System.out.println("0입니다.");
//			}
//
//		
//		System.out.println("숫자 : " +number);
//
		System.out.println("(활용예제)<조건문은 사용한 학점구분>|90점 이상이면 A, 80점 이상이면 B, 70점이상이면 C, 60점 이상이면D, F");
		//90점 이상이면 A, 80점 이상이면 B, 70점이상이면 C, 60점 이상이면D, F
		
		System.out.println("점수를 입력하세요.");
		int score1=scan.nextInt();
		
		if(score1>=90) {
			System.out.println("A");
		}else if(score1>=80) {
			System.out.println("B");
		}else if(score1>=70) {
			System.out.println("C");
		}	else if(score1>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		System.out.println("점수 : " + score1);


		
		
		
		

	}//main
}//class