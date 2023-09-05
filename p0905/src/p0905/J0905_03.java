package p0905;

public class J0905_03 {

	public static void main(String[] args) {
		// 선언
//		int i = 0;
//		int sum = 0;
//		
//		for (i = 0; i <= 100; i++) {
//			System.out.println(i);
//			sum = sum + i;
		// }// for문

		// 출력
//		System.out.println("i : " + (i-1)); //i에서 -1을 해줘야함 (i-1) | for문에서 i갑이 101이 될때 나오게 되므로 -1을 해줘야 맞는 순번
//		System.out.println("sum : " + sum);

		// (활용) 1부터 100까지 1,3,5,7...........합계를 구하세요.
		int a = 0;
		int sumA = 0;

		for (a = 1; a <= 100; a += 2) {
			sumA = sumA + a;
			System.out.printf("%d,", a);
			System.out.println("합계 :" +sumA);
		}//for문

	}// Main

}// Class
