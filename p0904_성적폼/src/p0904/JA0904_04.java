package p0904;

import java.util.Scanner;

public class JA0904_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String grade = "";
		System.out.println("<중첩 if>");
		// 90점 이상이면 A, 80점 이상이면 B, 70점이상이면 C, 60점 이상이면D, F
		// 점수를 입력받아, 성적을 출력하시오.
		// 98점 이상이면 (A+), 93점 이하 (A-)

		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
////////////////////////////////////////////////////////////////////////////////
		if (score >= 90) {
			// System.out.print("A");
			grade = "A";
			if (score >= 98) { // 중첩if
				// System.out.println("+");
				grade = grade + "+";
			} else if (score <= 93) {
				// System.out.println("-");
				grade = grade + "-";
			} else {
				System.out.println();
			}
///////////////////////////////////////////////////////////////////////////////
		} else if (score >= 80) {
			grade = "B";
			if (score >= 88) {
				grade = grade + "+";
			} else if (score <= 83) {
				grade = grade + "-";
			} else {
				System.out.println();
			}
///////////////////////////////////////////////////////////////////////////////
		} else if (score >= 70) {
			// System.out.print("C");
			grade = "C";
			if (score >= 78) {
				// System.out.println("+");
				grade = grade + "+";
			} else if (score <= 73) {
				// System.out.println("-");
				grade = grade + "-";
			} else {
				System.out.println();
			}
//////////////////////////////////////////////////////////////////////////////
		} else if (score >= 60) {
			// System.out.print("D");
			grade = "D";
			if (score >= 68) {
				// System.out.println("+");
				grade = grade + "+";
			} else if (score <= 63) {
				// System.out.println("-");
				grade = grade += "-"; // [grade = grade + "-"] 같다
			} else {
				System.out.println();
			}
//////////////////////////////////////////////////////////////////////////////
		} else
			// System.out.print("F");
			grade = grade + "F";

		System.out.println("학점 : " + grade);
		System.out.println("점수 : " + score);

	}// MAIN

}// CLASS
