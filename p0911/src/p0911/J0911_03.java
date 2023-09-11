package p0911;

public class J0911_03 {

	public static void main(String[] args) {
		// 카드 객체 4개를 선언해서, Heart 1 Spade 1 Diamond 1 Clover 1을 출력하시오.

		String[] shape = { "♥Heart♥", "♠Spade♠", "◆Diamond◆", "♣Clover♣" };
		Card[] c = new Card[52]; //13장 카드를 (Heart 1-13)
 		for (int i = 0; i < c.length; i++) {
			c[i] = new Card();
			c[i].kind = shape[i/13];
			c[i].number = (i%13)+1;
			c[i].cardPrint();
		}//for
		//J0911_05 인스턴스 메소드 사용
// 		System.out.println("카드숫자합 : ");
// 		int result = J0911_05.add(c[0].number, c[5].number);
// 		System.out.print(result);
 		
		System.out.println("-----------------------------------------");
		
		Card c1 = new Card();
		c1.number = 1;
		c1.kind = "Heart";
		c1.cardPrint();

		Card c2 = new Card();
		c2.number = 1;
		c2.kind = "Spade";
		c2.cardPrint();

		Card c3 = new Card();
		c3.number = 1;
		c3.kind = "Diamond";
		c3.cardPrint();

		Card c4 = new Card();
		c4.number = 1;
		c4.kind = "Clover";
		c4.cardPrint();

	}// MAIN

}// CLASS
