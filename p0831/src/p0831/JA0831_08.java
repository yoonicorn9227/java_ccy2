package p0831;

public class JA0831_08 {

	public static void main(String[] args) {
		int age = 20;
		String address = "서울 특별시 구로구 구로동";
		// 당신의 나이는 20세, 사는 곳은 서울특별시 구로구 구로동 입니다.
		System.out.println("당신의 나이는 " + age + "세, 사는 곳은 " + address + " 입니다.");
		System.out.printf("당신의 나이는 %d세, 사는 곳은 %s 입니다.", age, address);

		// 국어, 영어, 수학, 평균을 출력 소수점 2자리까지 출력하시오.
		// 100, 100, 99
		int kor = 0;
		int eng = 0;
		int math = 0;

		kor = 100;
		eng = 100;
		math = 99;
		int total=kor+eng+math;
		double avg = total / 3.0;
		System.out.println();
		System.out.println(total);
		System.out.println(avg);
		System.out.println("----------------------");
		System.out.printf("평균:%.2f \n", avg);
		System.out.println("----------------------");
		System.out.print("a");
		System.out.print("b");
		System.out.print("c"); //%04.2f = 
		System.out.println();
		System.out.printf("%4.2f", 5.8);
		System.out.println();
		System.out.printf("%05.2f", 5.8);
		System.out.println();
		System.out.printf("%15.2f", 5.8);
		System.out.println();
		System.out.printf("%015.2f", 5.8);
		System.out.println();
		
		
	}

}
