package p0912;

public class Card {
	Card(){}//기본생성자
	
	Card(String kind, int number){
		this.kind = kind;
		this.number=number;
	}
	
	final int NUMBER_MAX = 13; // 카드갯수 선언
	String kind;
	int number;  //i+1 = 1,13
	String[] CardShape = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" }; // J-11, Q-12, K-13

	public String toString() {
		// String cardName = String.format("[%s, %d]", kind , number);
		return String.format("[%s, %s]", kind, CardShape[number]);
	}// toString() : 공용으로 쓰는 메소드!

}// CLASS
