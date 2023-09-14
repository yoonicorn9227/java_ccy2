package p0914;

public class J0914_01 {

	public static void main(String[] args) {
		//생성자 - 객체생성때 초기화 메소드 - 데이터 입력
		// ▼ 1.기본생성자를 호출해서 값을 입력하는 방법.
		StuScore s1 = new StuScore(); // [StuScore();] -> 생성자(공간만 만들어짐) | [StuScore s1 = new StuScore();] -> 객체선언
		s1.setStuNo(1); //0값출??
//		s1.setName("홍길동");
//		s1.setKor(100);
//		s1.setEng(100); 
//		s1.setMath(100); 		
//		s1.setTotal(s1.getKor() + s1.getEng() + s1.getMath());
//		s1.setAvg(s1.getTotal()/3.0);
		System.out.println(s1.getStuNo());

		// ▼ 2. 전체 매개변수 생성자 StuScore클래스에 매개변수가 있는 생성자로 값을 입력하는 방법
		// StuScore s2 = new StuScore(1, "홍길동", 100, 100, 100);

		// ▼ 3. 2개 매개변수 생성자
//		StuScore s1 = new StuScore(1, "유관순");
//		s1.setKor(100);
//		s1.setEng(100);
//		s1.setMath(100);

	}// MAIN

}// CLASS
