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
				stuAction.stuInput(stuCount);
				break;

			case 3://3.학생성적 출력 메소드
				
				break;

			case 4://4.학생성적 삭제 메소드
				break;

			case 5://5.학생성적 검색 메소드
				break;

			case 6://3.학생성적 등수 메소드
				break;

			case 0:
				break;

			}// switch 메뉴

		} // while 전체



	}// MAIN

}// CLASS
