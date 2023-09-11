package p0911;

public class J0911_11 {

	public static void main(String[] args) {
		// 재귀호출관련 [▼for문 사용이 더빠르다.▼]|<5!=5*4*3*2*1>
		int result = 1;
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
			result = result * i;
		}//for
		
		System.out.println(result);
	
	}// MAIN

}// CLASS
