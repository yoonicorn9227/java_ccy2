package p0912;

public class Deck {

	String[] shape = { "♠Spade♠", "♥Heart♥", "◆Diamond◆", "♣Clover♣" };
	Card[] c = new Card[52]; // 클래스명[]. 참조변수명 = new 클래스명[생성데이터 값]

	Deck() {// 기본생성자
		for (int i = 0; i < c.length; i++) {
			c[i] = new Card(shape[i / 13], i % 13 + 1); // 객체선언
			// c[i].kind = shape[i / 13];
			// c[i].number = (i % 13) + 1;
			// System.out.println(c[i]);
		} // class 에서는 for문 못쓴다.
	}// Deck

	// 특정번호 카드뽑기 메소드
	Card pick(int no) {
		if (no > 52) {
			System.out.println("숫자를 <<잘못>> 선택하셨습니다.");
			return c[no % 52];
		}
		return c[no];
	}// 특정번호 카드뽑기 메소드

	// 랜덤으로 카드 가져오기
	Card pick() {
		int random = (int) (Math.random() * 52);
		return c[random];
	}// 랜덤으로 카드 가져오기

	// 카드섞기 메소드
	void shuffle() {
		// 52 -> 0-51
		// Card temp; 생략가능

		for (int i = 0; i < 1000; i++) {
			int random = (int) (Math.random() * 52);
			Card temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		} // for
	}// 카드섞기 메소드

	// 모든카드 출력메소드
	void cardPrint() {
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		} // for
	}// 출력메소드

}// CLASS
