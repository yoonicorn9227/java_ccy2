package p0920;

import java.util.Arrays;

public class J0920_15 {

	public static void main(String[] args) {

		int a = -5;
		System.out.println(Math.abs(a)); // 절대값

		System.out.println("---------------------------------");
		double b = 12.912;
		System.out.println(Math.ceil(b));// 소숫점 첫째자리 올림
		System.out.println(Math.floor(b)); // 소숫점 첫째자리 버림
		System.out.println(Math.round(b));// 반올림 | 타입 : long

		System.out.println("---------------------------------");
		int no1 = 10;
		int no2 = 15;
		int no3 = 13;

		System.out.println(Math.max(no1, no2)); // 최대값 추출
		System.out.println(Math.min(no1, no2)); // 최소값 추출
		
		
		
		System.out.println("---------------------------------");
		
		//no1 no2 no3최대값 최소값 출력
		System.out.println(Math.max(Math.max(no1, no2),no3)); // 최대값 추출
		System.out.println(Math.min(Math.min(no1, no2),no3)); // 최대값 추출
		
		System.out.println("---------------------------------");
				
		////no1, no2, no3 적은 숫자 순으로 출력 10,13,15
		int arr[] = {no1,no2,no3};
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++ ) {
			System.out.print(arr[i]);
		}//for
	
		
	}// MAIN

}// CLASS
