package p0901;

import java.util.Scanner;

public class JA0901_06 {

	public static void main(String[] args) {
		System.out.println("----짝수 홀수 구분----"); // 소숫점 넷째자리 반올림
//		System.out.println(10 / 8); //1 몫 연산 값
//		System.out.println(10 % 8); //2 나머지 연산값

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();

		int result = num % 3; // 0 또는 1 | 0이면 짝수 1이면 홀수

		System.out.println("----조건문을 사용한 홀수 구분----");
		// 조건문 == if
		if (result == 0) //result값이 0이면 짝수 else(아니면) 홀수
		System.out.println("3의 배수 입니다.");
		else
		System.out.println("3의 배수가 아닙니다.");
		System.out.println("입력한 숫자 : " + num);

		
		
		
	}

}
