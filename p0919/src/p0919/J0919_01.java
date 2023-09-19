package p0919;

public class J0919_01 {

	public static void main(String[] args) {

		int[] n = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < n.length; i++) { // 기본 for 문
			System.out.println(n[i]);
		}

		System.out.println("-------------------------");
		for (int a : n) { // 단순 for문
			System.out.println(a);
		}
		System.out.println("-------------------------");

	}// MAIN

}// CLASS

class JJJ { //public은 대표 <<J0919_01>> 에만 붙일수 있음 다른 class에는 못붙힘.
	
}

class KKK{
	
}