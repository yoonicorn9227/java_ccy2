package p0830;

public class JA0830_02 {
	public static void main(String[] args) { // 변수의 선언방법
		boolean bo = true; // 논리형
		boolean bo2 = false; // 논리형
		char ch = 'a'; // 문자형 char ch = 'aa' 는 에러
		char ch2 = 'b'; // 문자형
		byte by = 1; // 정수형 127이하
		short sh = 2;
		int a = 1; // int는 정수형 21억이하 자리까지만 사용 int <표준>
		int b = 20;
		int in = 2100000000;
		long lo = 100L; // 21억 이상부터는 뒤값에 접미사 L or l 을 입력!(안쓰면 에러)
		float f1 = 1.2F; // 무조건 접미사F or f붙여줄것
		double d = 11.12; // 실수형 소숫점 표기
		double dou = 1.2; // 접미사 D를 붙여줘도 되고 안붙여줘도 된다 [ex) double dou = 1.2D] <표준>
		System.out.println(a);                 
		System.out.println(b);
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // 나누었을때 몫
		System.out.println(a % b); // 나누었을때 나머지

	}
}
