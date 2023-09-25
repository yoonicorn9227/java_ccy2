package p0925;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {

		StuAction s = new StuAction();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("■□■■■■■■■■■■■■■■■■■□■■■");
			System.out.println("   [★학생성적 프로그램☆]");
			System.out.println("■□■■■■■■■■■■■■■■■■■□■■■");
			System.out.println("01.학생성적 <입   력>");
			System.out.println("02.학생성적 <출   력>");
			System.out.println("03.학생성적 <수   정>");
			System.out.println("04.학생성적 <삭   제>");
			System.out.println("05.학생성적 <등수처리>");
			System.out.println("06.학생성적 <검   색>");
			System.out.println(" 0.프로그램 <종   료>");
			System.out.println("원하는 <<번호>>를 입력하세요.");
			int choice = scan.nextInt();
			switch (choice) {
			case 1: // 1.학생성적 입력 메소드
				s.stuInput();
				break;
			case 2: // 2.학생성적 출력 메소드
				s.stuOutput();
				break;
			case 3: // 3.학생성적 수정 메소드
				s.stuUpdate();
				break;
			case 4: // 4.학생성적 삭제 메소드
				s.stuDelete();
				break;
			case 5: // 5.학생성적 등수처리 메소드
				s.stuRank();
				break;
			case 6: // 6.학생성적 검색 메소드
				s.stuSearch();
				break;
			case 0: // 0.프로그램 종료
				s.stuExit();
				break;
			}// switch(메뉴)
			break;
		} // while(전체)
	}// MAIN
}// CLASS
