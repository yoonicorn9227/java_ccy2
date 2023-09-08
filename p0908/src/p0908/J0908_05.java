package p0908;

public class J0908_05 {

	public static void main(String[] args) {
		// 학생성적 프로그램 | 베열때는 일일이 선언 설정
//		int []stuNo= new int[10];
//		String[]name= new String[10];

		// 객체
		StuScore s1 = new StuScore();
		s1.StuNo = 1;
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 88;
		s1.math = 92;
		s1.total();
		s1.avg();


		
		StuScore s2 = new StuScore();
		s2.StuNo = 2;
		s2.name = "유관순";
		s2.kor = 88;
		s2.eng = 98;
		s2.math = 92;
		s2.total();
		s2.avg();
		
	
		
		System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.2f%n", 
				s1.StuNo, s1.name, s1.kor, s1.eng, s1.math, s1.total,
				s1.avg);
		System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.2f%n", 
				s2.StuNo, s2.name, s2.kor, s2.eng, s2.math, s2.total,
				s2.avg);

		
		
		
	}// main

}// class
