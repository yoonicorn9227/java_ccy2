package p0905;

public class J0905_12 {

	public static void main(String[] args) {

		// 제 5장 배열
		System.out.println("/////////////<<제 5장 배열>>////////////////");

		System.out.println("---------------원하는 값을 각각 넣어서 배열출력------------------");
		int[] number = { 1, 6, 5, 7, 8, 10, 20 };

		System.out.println("---------------직접 넣어서 배열출력------------------");
		int[] score = new int[10];
		score[0] = 10;
		score[1] = 11;
		score[2] = 12;
		score[3] = 13;
		// ...
		score[9] = 19;

		System.out.println("------------for문을 이용한 배열출력----------------");
		for (int i = 0; i < 10; i++) {
			score[i] = i + 10;
		}

		System.out.println("---------------배열출력------------------");
		int[] num = new int[5]; // 배열선언 방법
		num[0] = 0;
		num[1] = 1;
		num[2] = 2;
		num[3] = 3;
		num[4] = 4;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);

		System.out.println("------------for문을 이용한 배열출력----------------");

		// for문을 이용한 배열출력
		for (int i = 0; i < 5; i++) {
			System.out.println(num[i]);
		} // 배열 for문

		System.out.println("---------------------------------------------");

		int n0 = 1;
		int n1 = 2;
		int n2 = 3;
		int n3 = 4;
		int n4 = 5;

		System.out.println(n0);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);

	}// main

}// class
