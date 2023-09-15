package p0915_test;

import java.util.ArrayList;
import java.util.Scanner;

public class JTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int stuCount = 1;
	
		String [] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		ArrayList list = new ArrayList();
		
		while (true) {

			System.out.println("----------------------------------------------------");
			System.out.println("[학생성적 프로그램]");
			System.out.println("----------------------------------------------------");
			System.out.println("[1.학생 성적입력]");
			System.out.println("[2.학생 성적출력]");
			System.out.println("[3.학생 성적수정]");
			System.out.println("[4.학생 성적삭제]");
			System.out.println("[5.학생 성적검색]");
			System.out.println("[6.학생 성적등수]");
			System.out.println("[0. 프로그램 종료]");
			System.out.println("----------------------------------------------------");
			System.out.println("원하는 <선택번호>를 입력하세요.");
			int choice = scan.nextInt();

			// 1.학생성적입력
			switch (choice) {
			case 1:
				System.out.println("[학생 성적입력]");
				System.out.printf("<%s번째> 학생 이름을 입력하세요.<0.이전 페이지로 이동>", stuCount);
				String name = scan.next();
				if (name.equals("0")) {
					System.out.println(">>이전 페이지로 이동합니다!");
					System.out.println();
				} // if
				System.out.println("국어성적을 입력하세요");
				int kor = scan.nextInt();
				System.out.println("영어성적을 입력하세요");
				int eng = scan.nextInt();
				System.out.println("수학성적을 입력하세요");
				int math = scan.nextInt();

				// 학생성적 저장
				list.add(new StuScore(name, kor, eng, math));
				System.out.printf("%d번째 학생성적이 <저장> 되었습니다.", stuCount);
				System.out.println();
				break;

			// 2. 학생성적 출력메소드
			case 2:
				System.out.println();
				System.out.println("[학생 성적출력]");
				
				
				
				System.out.println();
				System.out.println("----------------------------------------------------");
				for(int i = 0 ; i<list.size(); i++ ) {
					StuScore s = (StuScore)list.get(i);
					System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.2f\t %d\n",s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
				}//for
				
				break;

			}// switch

		} // while

	}// MAIN

}// CLASS
