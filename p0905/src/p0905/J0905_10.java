package p0905;

public class J0905_10 {

	public static void main(String[] args) {

		// 구구단을 for문으로 구현하시오
		// 2~9단까지 출력

		for (int a = 2; a <= 9; a++) {
			// if(a%2==1) { //짝수단만 출력조건
			// continue;
//		} //if

			for (int b = 1; b <= 9; b++) {
				if (b % 2 == 0) { // 뒤에수 홀수단만 출력조건
					continue;
				} // if
				System.out.printf("%d * %d = %d \n", a, b, a * b);
			} // for-2
		} // for

		System.out.println("------------[continue]명령어--------------");
		// [continue]명령어
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				// break; // 반복문을 완전히 멈춤.
				continue;// 1번 멈춤고 그다음 조건실행
			} // if
			System.out.println(i);

		} // for

	}// MAIN

}// CLASS
