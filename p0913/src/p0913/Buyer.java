package p0913;

public class Buyer {
	String id = "aaa";
	String name = "hong";
	int money = 10000000;
	int bonusPoint = 0;

	void buy(Product p) {
		money = money - p.price;
		bonusPoint += p.bonusPoint;
	}

//▲다형성으로 상품을 다 상속받게 한다

	// Tv를 구매했을때 사용하는 메소드
//	void buy(Tv t) {
//		money = money - t.price;
//		bonusPoint += t.bonusPoint;
//	}
//
//	// Computer 구매 메소드
//	void buy(Computer c) {
//		money -= c.price;
//		bonusPoint = +c.bonusPoint;
//	}
//
//	void buy(Audio a) {
//		money -= a.price;
//		bonusPoint = +a.bonusPoint;
//	}

}// CLASS
