package p0907;

import java.util.Scanner;

public class J0907_02 {

	public static void main(String[] args) {
		// [5][5] -> 1~25까지 숫자를 입력해서 2차원 형태로 출력하시오.

		Scanner scan = new Scanner(System.in);

		int[][] num = new int[5][5];
		int[] temp = new int[25];
		int n = 0;
		// <1차원 배열> temp 1-25까지의 숫자를 입력하세요.

		// <1차원 배열> temp 1-25까지의 숫자를 입력
		for (int i = 0; i < 25; i++) {
			temp[i] = i + 1;
		} // for (<1차원 배열> temp 입력)

		// 번호섞기
		for (int i = 0; i < 400; i++) {
			int random = (int) (Math.random() * 25); // 0-24ㅅ
			n = temp[0];
			temp[0] = temp[random];
			temp[random] = n;
		}

		System.out.print("숫자나열 : ");

		// <1차원 배열> temp 1-25까지의 숫자를 출력
		// for(int i =0; i<25; i++) {
		// System.out.print(temp[i]+" ");
		// }//for (<1차원 배열> temp 출력)

		System.out.println();

//----------------------------------------------------------------------------		
		System.out.println("_________☆____☆_____☆_______☆______☆____☆____________");
		System.out.println();
//----------------------------------------------------------------------------		
		// 2차원배열에 temp 배열을 입력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				// num[i][j] = (5 * i) + j + 1; //1-25
				num[i][j] = temp[(5 * i) + j];
			}
		} // for(2차원 배열 입력)
		
		while (true) {
			// -->무한루프
			// 2차원 배열 출력
			System.out.println("           [숫자 맞히기 게임]");
			System.out.printf(" |\t0\t1\t2\t3\t4\n");
			System.out.println("--------------------------------------------");
			for (int i = 0; i < 5; i++) {
				System.out.print(i + "|\t");
				for (int j = 0; j < 5; j++) {
					System.out.print(num[i][j] + "\t");
				}
				System.out.println();
			} // for(2차원 배열 출력)

			System.out.println("============================================");
			//원하는 숫자를 입력하세요 (1~25)
			System.out.println("원하는 숫자를 입력하세요.");
			int number= scan.nextInt();
			
			//모든 좌표값과 number 값을 비교 | 해당값을 입력해서 0으로 만든다.
			for(int i =0 ; i<5; i++) {
				for(int j=0;j<5;j++) {
					if(num[i][j]==number) {
						num[i][j]=0;
						break;
					} //if
				}
			}//for 모든 좌표값과 number 값을 비교
			
			
			
			//좌표를 넣어서 해당답을 0으로 변경
//			System.out.println("[좌표]를 입력 하세요. <<행>>");
//			int input1 = scan.nextInt();
//			System.out.println("[좌표]를 입력 하세요. <<열>>");
//			int input2 = scan.nextInt();
			// -->무한루프
			
			//좌표위치 값을 0으로 변경
			//num[input1][input2]=0;
			
			
		} // while

	}// main

}// class
