package p0918_학생성적;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {

	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();
	int mainPrint() {
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------");
		System.out.println("[학생성적 프로그램]");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------");
		System.out.println("[1. 학생성적 입력]");
		System.out.println("[2. 학생성적 출력]");
		System.out.println("[3. 학생성적 수정]");
		System.out.println("[4. 학생성적 삭제]");
		System.out.println("[5. 학생성적 검색]");
		System.out.println("[6. 학생성적 등수처리]");
		System.out.println("[0. 프로그램 종료]");
		System.out.println("원하는 <<번호>>를 입력하세요");
		int choice = scan.nextInt();
		return choice;
	}// mainPrint

	
	
	
	
	
	

	
}// CLASS
