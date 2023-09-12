package p0912;

import java.util.Scanner;

public class J0912_03 {

	public static void main(String[] args) {
		// 3명의 학생의 성적을 입력받아 출력하시오 StuScore 객체를 활용!
		Scanner scan = new Scanner(System.in);
		// 선언
		int stuNo = 0;
		String name = "";
		int[] score = new int[3];
		int[] StuScore = new int[3];
		String[] subject = { "국어", "영어", "수학" };

		StuScore2[] s = new StuScore2[3]; // 배열선언

		// 입력
		for (int i = 0; i < s.length; i++) {
			stuNo = i + 1;
			System.out.println("이름을 입력하세요.");
			name = scan.next();
			for (int j = 0; j < score.length; j++) {
				System.out.println(subject[j] + "점수를 입력하세요.");
				score[j] = scan.nextInt();
			} // for
			s[i] = new StuScore2(stuNo, name, score[0], score[1], score[2]);
		} // for

		// 출력
		System.out.println("=============================================================================================");
		for (int i = 0; i < s.length; i++) {
				System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.2f \n", s[i].stuNo, 
						s[i].name, s[i].kor, s[i].eng, s[i].math, s[i].total, s[i].avg);
		} // for

	}// MAIN

}// CLASS
