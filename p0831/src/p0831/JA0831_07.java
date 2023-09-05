package p0831;

public class JA0831_07 {

	public static void main(String[] args) {
		// 10.형변환(Casting)
		// 1. 큰쪽에서 작은 쪽으로 -> 강제형 변환
		double d = 1.6;
		int i = (int) d; // int i = d; int i = (int)d; 바꿔주면 정수부분만 입력
		System.out.println(i);

		// 2. 작은쪽에서 큰쪽으로 -> 자동형 변환(형변환 생략가능)
		int x = 10;
		double d2 = x; // 자동형 변환 - 형변환 생략가능 double d2 = x;
		System.out.println(d2);

		// 크기순서는 : char,byte,short < int < long< float < double < String

		// Chapter.03 연산자

		System.out.println(10 / 3.0); // 앞에꺼는 int 타입 뒤에는 double타입 둘중 double이 더 크다 15번재 소숫점 자리수까지는 정확 16번째 자리수는 임의숫자
										// 3.333333333333333 5에서 5는 임의숫자

		// 1. 1.형식화된 출력 <printf>
		System.out.println(10 / 3.0);
		// <실수형값 :%f> <정수형값 %d> <문자열값 %s>
		System.out.printf("%f", 10 / 3.0); // <%f= 실수 값을 받겠다.>
		System.out.printf("%f", 10 / 3.0); // <System.out.printf("%.3f", 10/3.0); = 소숫점 3째자리까지 만 출력>
		System.out.println("---------------------------------");
		System.out.printf("%.1f \n", 10 / 3.0); // <\n 줄바꿈> , <\t:사이띄움>
		System.out.println("---------------------------------");
		System.out.printf("%f.1f\t", 10 / 3.0);
		System.out.printf("%s \n", "홍길동입니다.");
		System.out.printf("%d", 1000);
		System.out.printf("%7d", 1000);
		System.out.printf("%07d", 1000);
		System.out.printf("%07d", 10000000);
		System.out.printf("%,07d", 10000000); //<%d,> = 자리수 표시
		System.out.printf("국어 : %d, 영어 : %d \n", 100, 99);

	}

}
