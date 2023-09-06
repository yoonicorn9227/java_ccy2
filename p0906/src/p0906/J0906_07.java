package p0906;

public class J0906_07 {

	public static void main(String[] args) {
		int[] score = new int[5];// {1,2,3,4,5};
		int[] num= {1,2,3};// {중괄호의 의미} //공간이 만들어지고 주소값만 저장할수 있음 |데이터 값을 저장할수는 없다.
		num = score; // 주소를 복사한것 값을 복사한거 아니다.

		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}

		System.out.println("score : " + score);
		System.out.println("num : " + num);

		num[0] = 10000;
		System.out.println(num[0]);
		System.out.println(score[0]);

	}// main

}// class
