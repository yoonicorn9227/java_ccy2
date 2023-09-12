package p0912;

public class J0912_01 {		

	public static void main(String[] args) {

		Time t = new Time();
		Data1 d1 = new Data1(); // 객체선언 할때 기본생성자 호출
		Data2 d2 = new Data2(); // <에러가 뜨면 ▶ 기본생성자가 없다!>

		Car c1 = new Car();
		System.out.println(c1.color);
		
		
		Car c2 = new Car("White", "Auto", 5);
		System.out.println(c2.color);
		System.out.println(c2.gearType);
	}// MAIN

}// CLASS
