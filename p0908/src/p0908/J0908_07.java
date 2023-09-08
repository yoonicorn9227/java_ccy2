package p0908;

import java.util.Scanner;

public class J0908_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

// 		<일반배열>		
//		int[] hour = new int[3];
//		int[] minute = new int[3];
//		double[] second = new double[3];
//		int hour =0;
		
		// <객체배열>
		Time[] t = new Time[3]; // 배열선언
//		t[0] = new Time(); //1개의 시간저장 변수 생성
//		t[1] = new Time();
//		t[2] = new Time();
//		t[3] = new Time();

		for (int i = 0; i < 3; i++) {
			System.out.println("시 입력");
			t[i].hour = scan.nextInt();
			//hour[i] = scan.nextInt();
			System.out.println("분 입력");
			t[i].minute = scan.nextInt();
			//minute[i] = scan.nextInt();
			System.out.println("초 입력");
			t[i].second = scan.nextInt();
			//second[i] = scan.nextDouble();
		} // for

		for (int i = 0; i < 3; i++) {
			System.out.printf("%d : %d : %.2f \n", t[i].hour, t[i].minute, t[i].second);
			//System.out.printf("%d : %d : %.2f \n", hour[i], minute[i], second[i]);
		} // for

	}// MAIN

}//class
