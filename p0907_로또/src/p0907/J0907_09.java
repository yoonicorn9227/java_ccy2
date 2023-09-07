package p0907;

import java.util.Scanner;

public class J0907_09 {

	public static void main(String[] args) {
		// 로또만들기
		// [순서]
		// 1. 선언
		// 2. 로또순차입력
		// 3. 로또번호 섞기
		// 4. 6개 당첨번호 추출
		// 5. 번호직접입력
		// 6. 당첨번호 출력
		// 7. 직접입력한 번호출력
		// 8. 당첨갯수 확인 출력

		// 1. 선언
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];
		int[] win = new int[6];
		int[] mine = new int[6];
		int temp = 0;
		int count = 0;
		// 2. 로또순차 입력
		for (int i = 0; i < lotto.length; i++){
			lotto[i] = i + 1;
		}

		//3. 로또번호 섞기
		for(int i = 0; i<400; i++) {
			int random=(int)(Math.random()*45);
			temp=lotto[0];
			lotto[0]=lotto[random];
			lotto[random]=temp;
		}
		
		// 4. 6개 당첨번호 추출
		for(int i=0; i<6; i++) {
			win[i]=lotto[i];
		}
		
		// 5. 번호직접입력
		for(int i=0; i<6; i++) {
			System.out.println("숫자를 입력하세요.");
			mine[i]=scan.nextInt();
		}
		
		
		// 6. 당첨번호 출력
		System.out.print("당첨번호 출력 : ");
		for(int i=0; i<6; i++) {
			System.out.printf("%d\t", win[i]);
		}
		
		System.out.println();
		
		// 7. 직접입력한 번호출력
		System.out.print("입력한 번호 : ");
		for(int i =0; i<6; i++) {
			System.out.printf("%d\t", mine[i]);
		}
		
		// 8. 당첨갯수 확인 출력
		
		
		
		
		
		
		
	}// main

}// class
