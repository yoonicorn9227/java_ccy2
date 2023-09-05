package p0904;

public class JA0904_11 {

	public static void main(String[] args) {

		System.out.println("<[for]명령어>");

		System.out.println("<1부터 100까지의 합을 출력하세요.>");
		int i = 0;
		int sum = 0;

		for (i = 1; i <= 10; i++) {
			// System.out.println(i);
			sum = sum + i;
		} // for - for문에 설정한 값은 for문 바깥부분에 나오면 사라짐 | for문 전에 선언해야함

		System.out.println("for문 밖 i : " + i);
		System.out.println("for문 밖 sum : " + sum);

		System.out.println("<1부터 100까지의 합을 출력하세요.>");
		// 1부터 100까지의 합을 출력하세요.

//		int num = 0, sum2=0;
//		for(num=1; num<=100; num++) {
//			//System.out.println(num);
//			sum2=sum2+num;
//		}//for문 <1부터 100까지의 합을 출력하세요.>
//		System.out.println("for 문 밖 num  : " + num);
//		System.out.printf("1부터 %d 까지의 합계 : %d \n", i-1,sum);

		// 1부터 100까지의 합에서 합이 200을 넘는 때는 언제일까요? 그 A와 sumA 출력하세요.
		// 1. 1부터 100까지의 합을 구함
		// 2. 조건문을 사용해서 sumA가 200이상 일때를 구함

		// 1.
		int A = 0, sumA = 0;
		for (A = 1; A <= 100; A++) {
			// System.out.println(A);
			sumA = sumA + A;
			if(sumA>=200) {
				break;
		}
		}
		System.out.println("1~100까지 합중 200이상이 될때의 총합 : " + sumA);
		System.out.println("합이 200이 넘을때 마지막으로 더한 숫자 : " + A);

	

		
		
		
		
	}// main

}// class
