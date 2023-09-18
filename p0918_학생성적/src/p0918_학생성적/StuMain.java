package p0918_학생성적;

import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int stuCount = 1;
		StuAction stuAction = new StuAction();
		
		while (true) {
			int choice = stuAction.mainPrint();
			switch (choice) {
			case 1:// 1. 메인화면 출력부분
				stuAction.mainPrint();
				break;

			case 2: //2.학생성적 입력 메소드
				System.out.println();
				System.out.println("[학생성적 입력]");
				System.out.printf("(%d번째) 학생이름을 입력하세요. (0. 이전페이지로 이동)\n", stuCount);
				String name = scan.next();
				if (name.equals("0")) {
					System.out.println("▶이전페이지로 이동합니다.");
					System.out.println();
					break;
				} // if
				System.out.println("<<국어점수>>를 입력하세요.");
				int kor = scan.nextInt();
				System.out.println("<<영어점수>>를 입력하세요.");
				int eng = scan.nextInt();
				System.out.println("<<수학점수>>를 입력하세요.");
				int math = scan.nextInt();

				// 학생성적 저장
				stuAction.list.add(new StuScore(name, kor, eng, math));
				System.out.printf("<%d번째>학생성적이 <저장되었습니다.>",stuCount);
				break;

			case 3:
				break;

			case 4:
				break;

			case 5:
				break;

			case 6:
				break;

			case 0:
				break;

			}// switch 메뉴

		} // while 전체



	}// MAIN

}// CLASS
