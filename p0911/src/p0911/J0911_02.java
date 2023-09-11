package p0911;

public class J0911_02 {

	public static void main(String[] args) {

		// 배열을 선언후 반복문을 이용하여 데이터를 추가해서 출력하는 방법.
		String[] shape = { "Heart", "Spaded", "Diamond", "Clover" };

		Card[] c = new Card[4];
		for (int i = 0; i < c.length; i++) {
			// 객체선언 넣을것
			c[i] = new Card();
			c[i].kind = shape[i];
			c[i].number = i + 1;
			c[i].cardPrint();
		} // for (객체배열 반복문)

		System.out.println("---------------------------------------");

		// 각각의 Card 객체를 선언후ㅡ 각각에 데이터를 추가해서 출력하는 방법
		Card c1 = new Card(); // 객체선언[참조변수명.변수명]
		c1.kind = "Heart";
		c1.number = 1;
		// System.out.printf("kind : %s, number : %d \n", c1.kind, c1.number);
		c1.cardPrint();

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 1;
		c2.cardPrint();

		Card c3 = new Card();
		c3.kind = "Diamond";
		c3.number = 1;
		c3.cardPrint();

		Card c4 = new Card();
		c4.kind = "Clover";
		c4.number = 1;
		c4.cardPrint();

		// 기본형 타입 선언후 사용방법
		// String kind = "Heart";
		// int number = 1;
		// int a; //변수선언후 값을 지정하지 않고 사용하면 에러
		// System.out.println(a);

	}// MAIN

}// CLASS
