package p0908;

import java.util.Scanner;

public class J0908_02 {
	public static void main(String[] args) {
//시분초
		Scanner scan = new Scanner(System.in);

		int[] hour = new int[3];
		int[] minute = new int[3];
		double[] second = new double[3];

		for (int i = 0; i < 3; i++) {
			System.out.println(" 시산간 중 시를 입력하세요");
			hour[i] = scan.nextInt();
			System.out.println("시간 중 분을 입력하세요.");
			minute[i] = scan.nextInt();
			System.out.println("초를 입력하세요.(예 : 45.02");
			second[i] = scan.nextDouble();
		}

		// 12:12:12.05
		System.out.printf("%d : %d : %.2f\n", hour[1], minute[1], second[1]);

		// 2번째 것만 입력한 시간을 출력하시오.
		hour[1] = 14;
		minute[1] = 14;
		second[1] = 14.55;
		System.out.printf("%d : %d : %.2f\n", hour[1], minute[1], second[1]);
		
		//3번째 시간 중 second를 59.10을로 변경해서
		//시 : 분 : 초 모두 출력하시오
		
		second[2]=59.10;
		System.out.printf("%d : %d : %.2f\n", hour[2], minute[2], second[2]);
		
		
		
		

	}// main
}// class
