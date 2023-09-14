package p0913;

import p0913_02.CCard;

public class J0913_03 {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "Spade";
		c1.number = 1; 
		//c1.flag = 1; //private는 같은 클래스에서만 사용가능. |객체선언도 안됨.
					 //▲ Card 클래스에서 int flag 인스턴스변수에 private가 있어서 사용불가능
		System.out.printf("%s %d", c1.kind, c1.number);
		//System.out.printf("%s %d %d", c1.kind, c1.number, c1.flag);

		// CCard2 c2 = new CCard();
		CCard c2 = new CCard(); // public

		
	}// MAIN

}// CLASS
