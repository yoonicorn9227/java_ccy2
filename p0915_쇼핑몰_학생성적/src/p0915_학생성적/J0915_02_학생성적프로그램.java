package p0915_학생성적;

import java.util.Scanner;

public class J0915_02_학생성적프로그램 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int stuCount = 1;

		StuAction stuAction = new StuAction(); // 객체선언 참조변수명.변수명
		// 무한반복
		while (true) {
			// 메인화면 출력부분 (클래스 StuAction)
			int choice = stuAction.mainPrint();

			switch (choice) {
			case 1: // 학생입력메소드
				stuCount = stuAction.stuInput(stuCount);
				break;
			case 2:// 학생성적출력메소드
				stuAction.stuOutput();
				break;
				
				
			case 3 : 
				break;
			}// switch
		} // while

	}// MAIN
}// CLASS
