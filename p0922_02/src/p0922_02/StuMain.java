package p0922_02;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction k = new StuAction();
		
		
		//123
		loop : while(true) {
			System.out.println("--------------------------------------------------------------------------------------------------------");
			System.out.println("[학생성적 프로그램]");
			System.out.println("--------------------------------------------------------------------------------------------------------");
			System.out.println("1.학생성적 입력");
			System.out.println("2.학생성적 출력");
			System.out.println("3.학생성적 수정");
			System.out.println("4.<<프로그램 종료>>");
			System.out.println("--------------------------------------------------------------------------------------------------------");
			System.out.println("(메뉴) 원하는 번호를 입력하세요!");
			int choice = scan.nextInt();
			switch(choice) {
			case 1://1. 학생성적 입력
				k.stuInput();
				break;
			case 2://2. 학생성적 출력
				k.stuOutput();
				break;
			case 3:
				break;
			case 0 :
					System.out.println("<<<프로그램 종료>>>");
					System.out.println();
					break loop;
			
			
				
			}//전체 switch
		}//전체 while
		
	}//MAIN

}//CLASS
