package p0921;

public class Card {

	public Card() {} // 생성자
	public Card(int number, String kind) {
		this.number = number;
		this.kind = kind;
	}

	private int number; // 인스턴스 변수
	private String kind;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

//	@Override
//	public String toString() {
//		return String.format("%d,%s", number, kind);
//	}

}// CLASS
