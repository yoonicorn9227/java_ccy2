package p0922;

public class J0922_02 {

	public static void main(String[] args) {

		Week w = Week.FRIDAY;//객체선언 //String w2 = "FRIDAY";
		String w2 = "FRIDAY";

		String weekName = w.name();
		System.out.println(weekName);
		System.out.println(w.name()); //w참조변수 데이터 이름을 가져옴
		System.out.println(w2);

//		String[] kind = { "Heart", "HEART", "heart", "hEart" };
//
//		for (int i = 0; i < kind.length; i++) {
//			if (kind[i].equals("Heart")) {//enum은 내가 지정한것(Heart)만 ♥준다.
//				System.out.println("♥");
//			} // if
//		} // for

	}// MAIN

}// CLASS
