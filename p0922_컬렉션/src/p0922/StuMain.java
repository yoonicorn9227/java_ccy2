package p0922;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class StuMain {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		StuAction s = new StuAction();
		int choice = 0;

		// 시작시 파일 가져오기
		s.stuFOpen();
		s.stuOutput();

		System.out.println();

		loop: while (true) {
			System.out.println("--------------------------------------------------");
			System.out.println("[학생성적처리 프로그램]");
			System.out.println("--------------------------------------------------");
			System.out.println("01.|학생성적|▶ [입력]");
			System.out.println("02.|학생성적|▶ [출력]");
			System.out.println("03.|학생성적|▶ [수정]");
			System.out.println("04.|학생성적|▶ [삭제]");
			System.out.println("05.|학생성적|▷ [이름순 정렬]");
			System.out.println("06.|학생성적|▷ [낮은순 정렬]");
			System.out.println("07.|학생성적|▷ [높은순 정렬]");
			System.out.println("08.|학생성적|▶ [파일 가져오기]");
			System.out.println("09.|학생성적|▶ [파일저장]");
			System.out.println("10.|학생성적|▶ [등수처리]");
			System.out.println("0.<<[프로그램 종료]>>");
			System.out.println("--------------------------------------------------");
			System.out.println("(메뉴) ▼원하는 <번호>를 입력하세요▼");
			//String strCh =JOptionPane.showInputDialog("원하는 번호를 입력하세요"); //입력창 뜸
			//choice=Integer.parseInt(strCh);
			choice = scan.nextInt();
			switch (choice) {
			case 1:// 1.학생성적 입력
				s.stuInput();
				break;
			case 2:// 2.학생성적 출력
				s.stuOutput();
				break;
			case 3:// 3.학생성적 수정
				s.stuUpdate();
				break;
			case 4:// 4.학생성적 수정
				
				break;
			
			case 5:// 6.학생성적 이름순 출력
				s.stuNameSort();
				break;
			case 6:// 6.학생성적 낮은순 출력
				s.stuTotalLowSort();
				break;
			case 7:// 7.학생성적 높은순 정렬
				s.stuTotalHighSort();
				break;
			case 8: // 파일 가져오기
				s.stuFOpen();
				break;

			case 9:// 학생성적 파일저장
				s.stuFSave();
				break;
			case 0:// 프로그램 종료
				System.out.println("[[프로그램 종료]]");
				System.out.println();
				break loop;

			}// 전체 switch
		} // 전체 while

	}// MAIN

}// CLASS
