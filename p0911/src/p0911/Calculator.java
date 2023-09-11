package p0911;

public class Calculator {
	// Calculator(){} 기본생성자 | (생략가능)
	public static void main(String[] args) {

		Cal1 c1 = new Cal1();
		c1.value = 10;
		System.out.println(c1.value);

//		 Cal2 c2 = new Cal2(); // Cal2는 기본생성자가 없음 - > Cal2 c2 = new Cal2(10);

		Cal2 c2 = new Cal2(10);
		// c2.value = 10; 생략됨
		System.out.println(c2.value);

	}// MAIN

}// CLASS

class Cal1 {
	// Cal1(){} 기본생성자
	int value;
}// class (Cal1)

class Cal2 {
	int value; // 인스턴스 변수 - 객체선언후 참조변수명.변수명
	// 기본생성자 안만들어짐.

	Cal2() {
	} // ★기본생성자 - 다른 생성자를 만들었다면 <<★★항상 기본생성자를 꼭 만드는 습관!★★>>

	Cal2(int x) {// 매개변수가 1개가 있는 생성자
		value = x;
	}
}// class (Cal2)
