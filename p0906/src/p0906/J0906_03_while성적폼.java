package p0906;

import java.util.Scanner;

public class J0906_03_while성적폼 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] name = new String[10];
		int[] arrKor = new int[10];
		int[] arrEng = new int[10];
		int[] arrMath = new int[10];
		int[] total = new int[10];
		double[] avg = new double[10];
		int count = 0;

		loop1: while (true) { // 무한반복 |{중괄호 안에서 무한반복 일어남} | loop :를 통해 이름을 달아놓는다.
			System.out.println("[ 학생 성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 종   료");

			System.out.println("----------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			scan.nextLine();
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
			switch (choice) {
			case 1:
				System.out.println("[ 성적 입력을 선택 ]");
				System.out.println("-----------------------------------");
				/////
				for (int i = count; i < name.length; i++) {
					System.out.println("___________________________________");

					System.out.println((i + 1) + "번째 이름을 입력하세요.(이전화면 : 0입력)");
					name[i] = scan.nextLine(); // "0" String값을 입력했을 때 빠져나오는 방법
					if (name[i].equals("0")) { // 0 눌렀을때 빠져나가는 조건값
						System.out.println("☞|입력을 중지합니다.|☜");
						break;
					}

					System.out.println((i + 1) + "번째 국어점수를 입력하세요.>>>");
					arrKor[i] = scan.nextInt();
					System.out.println((i + 1) + "번째 영어점수를 입력하세요.>>>");
					arrEng[i] = scan.nextInt();
					System.out.println((i + 1) + "번째 수학점수를 입력하세요>>>>>>>");
					arrMath[i] = scan.nextInt();
					scan.nextLine();

					total[i] = arrKor[i] + arrEng[i] + arrMath[i];// 합계입력
					avg[i] = total[i] / 3.0; // 평균입력

					count++;
				}
				System.out.println();
				break;
//////////////////////////////////////////////////////////////////////////////////////////////////
			case 2:
				System.out.println("성적 출력을 선택하셨습니다.");
				System.out.println("[ 성적 출력 선택 ]");
				//////////////////////////////////////////////////////////////////////////
				System.out.printf("[이 름]\t <국어>\t <영어>\t <수학>\t |합계|\t 평균\n");
				System.out.println("--------------------------------------------------");

				for (int i = 0; i < count; i++) {
					System.out.printf("%d %s\t %d\t %d\t %d\t %d\t %.2f\n", i + 1, name[i], arrKor[i], arrEng[i],
							arrMath[i], total[i], avg[i]);
				} // for(데이터 입력값 최종출력)
				break;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			case 3:
				System.out.println("[성적수정]을 선택하셨습니다.");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break loop1; // [loop]이름을 써서 [loop while] 문빠져나올수 있음

			}// switch

		} // while

	}// main

}// class
