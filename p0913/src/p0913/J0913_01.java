package p0913;

public class J0913_01 {

	public static void main(String[] args) {
		// 카드 52장을 생성해서 숫자와 모야을 입력하고, 카드를 섞은 후, 처음부터 5장 출력
		// Card, Deck,main
		// 포함관계(객체선언)

		Deck d = new Deck();
		d.cardPrint();
		System.out.println("-----------------------------");
		d.shuffle();
		d.cardPrint();

		System.out.println("-----------------------------");
		System.out.println("[5장 뽑기]");
		for (int i = 0; i < 5; i++) {
			System.out.println(d.pick(i));
		}

		System.out.println("-----------------------------");
		System.out.println();
		// a,b

		Card[] a = new Card[5];
		Card[] b = new Card[5];
		// a[0] = new Card(); // 객체를 생성해서 저장할수 있는 공간 생김
		System.out.println("a : 카드 5장");
		for (int i = 0; i < 5; i++) {
			a[i] = d.pick(i);
			System.out.println(a[i]);
		}

		System.out.println("-----------------------------");
		
		System.out.println("b : 카드 5장");
		for (int i = 0; i < 5; i++) {
			b[i] = d.pick(i + 5);
			System.out.println(b[i]);
		}

		// a:5장 - a라는 배열을 만든후 5장을 저장해서 출력
		// b:5장 - b라는 배열을 만든후 5장을 저장해서 출력

	}// MAIN

}// CLASS
