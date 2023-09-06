package p0905;

public class J0905_02 {

	public static void main(String[] args) {
		// 반복문
		// 1부터 10까지의 순번과 합을 출력하시오.
		int i = 0; // 순번
		int sum = 0; // 합계

		for (i = 1; i <= 100; i++) {
			sum = sum + i;
			System.out.printf("[순번 : %d], ",  i);
			System.out.println("합계 : " + sum);
			
			//1. 더해서 200 넘었을때 순번과 합의 값을 도출
			if(sum>=200) {
				break;
			}//if문
		}//for문

		//출력
		System.out.printf("정   답 : %d, %d \n ", i ,sum);
		System.out.printf("이전단계 : %d, %d ", i-1, sum-i); // 1번 문제의 전단계를 찾으세요.
		
	}//main

}//class
