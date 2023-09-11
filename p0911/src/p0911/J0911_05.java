package p0911;

import java.util.Scanner;

public class J0911_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		int d = 0;
//		int e = 0;

		int[] n = new int[10];
		int result = 0;

		for (int i = 0; i < n.length; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력하세요.");
			n[i] = scan.nextInt();
		}

		//System.out.println("[더하기]5개수를 입력하세요.");
//		a = scan.nextInt();
//		b = scan.nextInt();
//		c = scan.nextInt();
//		d = scan.nextInt();
//		e = scan.nextInt();

		result = add(n); // 또는 J0911_05.add(a,b); (같은 클래스안에서는 클래스명 생략가능)
		System.out.print("더하기 결과값 : ");
		System.out.println(result);

		//System.out.println("[빼 기]3개수를 입력하세요.");
//		a = scan.nextInt();
//		b = scan.nextInt();
//		c = scan.nextInt();
//		d = scan.nextInt();
//		e = scan.nextInt();
		result = subtract(n); // int[]n n 배열의 주소값을 매개변수로 보냄.
		System.out.print("빼기 결과값 : ");
		System.out.println(result);

		//System.out.println("[곱하기]3개수를 입력하세요.");
//		a = scan.nextInt();
//		b = scan.nextInt();
//		c = scan.nextInt();
//		d = scan.nextInt();
//		e = scan.nextInt();
		result = multiple(n);
		System.out.print("곱하기 결과값 : ");
		System.out.println(result);

		//System.out.println("[나누기]3개수를 입력하세요.");
//		a = scan.nextInt();
//		b = scan.nextInt();
//		c = scan.nextInt();
//		d = scan.nextInt();
//		e = scan.nextInt();
		result = devide(n);
		System.out.print("나누기 결과값 : ");
		System.out.println(result);
	}// MAIN

	// 클래스 메소드 [static] 붙어있음 | 객체선언 없이 사용가능
	static int add(int[]n) {
		int result=n[0];
		for(int i =1; i<n.length; i++) 
			result = result + n[i];
			return result;
	}

	static int subtract(int[]n) {
		int result=n[0];
		for(int i =1; i<n.length; i++) 
			result = result - n[i];
			return result;
	}

	static int multiple(int[]n) {

		int result=n[0];
		for(int i =1; i<n.length; i++) 
			result = result * n[i];
			return result;
	}

	static int devide(int[]n) {
		int result=n[0];
		for(int i =1; i<n.length; i++) 
			result = result / n[i];
			return result;
	}

}// CLASS
