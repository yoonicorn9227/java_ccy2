package p0901;

public class JA0901_03 {

	public static void main(String[] args) {
		// 이항 연산자
//		int a = 1000000;
//		int b = 1000000;

		// long c =a*b; -727379968값 출력 (오버플로우 발생)
//		long c = (long) a * b;
//		System.out.printf("%d, c);

		// 아스키 코드
		char c1 = 'a';
		System.out.println(c1);
		char c2 = 97;
		System.out.println(c2);
		char c3 = 65;
		System.out.println(c3);

		char c4 = 65 + 1; // 또는 char c4 = (char)(c3 + 1);
		System.out.println(c4);

		char c5 = ++c1;
		System.out.println(c5);
		
		System.out.println("------------------------");
		
		char c6 = 48;
		System.out.println(c6);
		System.out.println(c6 + 1); // 괄호안에 char + int에서의 char가 int로 변환해서 +1 되는구조
		System.out.println((char) (c6 + 1));

		System.out.println("------------------------");
		int i = '4' - '0';
		System.out.println(i);
		int i2 = '7' - '0'; // 문자형 숫자를 int타입으로 변경방법은 '0'을 뺴주면 됨. int타입 변경 됨
		System.out.println(i2);
	}
}
