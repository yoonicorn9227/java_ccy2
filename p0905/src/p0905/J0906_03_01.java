package p0905;

import java.util.Scanner;

public class J0906_03_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// ----------------------------------------------------
		///// 선언//////////////////////
		String[] name = new String[10];
		int[] arrKor = new int[10];
		int[] arrEng = new int[10];
		int[] arrMath = new int[10];
		int[] total = new int[10];
		double[] avg = new double[10];
		int count = 0; // 입력된 학생변수 | 중간에 프로그램 정지할때....

		for (int i = 0; i < arrKor.length; i++) {
			System.out.println("-----------------------------------");

			// 이름입력
			System.out.println((i + 1) + "번째 이름을 입력하세요.(중지하려면 : 0입력)");
			name[i] = scan.nextLine(); // "0" String값을 입력했을 때 빠져나오는 방법
			if (name[i].equals("0")) { // 0 눌렀을때 빠져나가는 조건값
				System.out.println("입력을 중지합니다.");
				break;
			} // if(입력중지 조건문)

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
		} // for문(입력)
		System.out.println();
		System.out.println("<<<<<<<<<<<<<<<<<<<<[학생성적표]>>>>>>>>>>>>>>>>>");
		System.out.println("================<최종 산출값>======================");

		// 출력
		System.out.printf("[이 름]\t <국어>\t <영어>\t <수학>\t |합계|\t 평균\n");
		System.out.println("--------------------------------------------------");

		for (int i = 0; i < count; i++) {
			System.out.printf("%d %s\t %d\t %d\t %d\t %d\t %.2f\n", i + 1, name[i], arrKor[i], arrEng[i], arrMath[i],
					total[i], avg[i]);
		} // for(데이터 입력값 최종출력)

//		System.out.printf("%s\t %d\t %d\n",name[0],arrKor[0], arrEng[0]);
//		System.out.printf("%s\t %d\t %d\n",name[1],arrKor[1], arrEng[1]);
//		System.out.printf("%s\t %d\t %d\n",name[2],arrKor[2], arrEng[2]);

	}// main

}// class
