package p0907;

public class J0907_01 {

	public static void main(String[] args) {

		int[] score = new int[10];

		// -----1차원 배열------------
		// 1~10숫자를 입력하세요!

		for (int i = 0; i < score.length; i++) {
			score[i] = i + 1;
		} // for (입력)

		// 출력
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i]+"  ");
		} // for(출력)
		System.out.println();
		
		System.out.println("----------------------------------");

		// 2차원 배열
		int[][] num = new int[5][3];  //int[a][b]num= new int[a][b]	| b*i+(j+1)

		// 2차원 배열 입력
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = 3 * i + (j + 1);

			} // for (2차원 배열 입력)
		}

		// 2차원 배열 출력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		} // for (2차원 배열 출력)

	}// main
}// class
