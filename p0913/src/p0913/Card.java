package p0913;

public class Card {
	String kind;//모양
	int number;//카드번호
	String[] CardShape = {"0","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	private int flag; //접근제어자 // private는 같은 클래스에서만 사용가능 
	
	
	Card() {
	}// **기본생성자

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}// Card 메소드 생성자

	public String toString() {
		return String.format("[%s, %s]", kind, CardShape[number]);
	}//오버라이딩
	
	
	
	
}// CLASS
