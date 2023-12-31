package p0914;

import java.util.ArrayList;

public class Buyer {

	Buyer() {
	}

	Buyer(String id, String name) {
		this.id = id;
		this.name = name;
	}

	String id;
	String name;
	int money = 10000000;
	int bonusPoint = 0;
	// **Product[] cart = new Product[10];

	// ▼ 컬렉션 선언|콜렉션 프레임 워크
	ArrayList list = new ArrayList(); // 콜렉션 프레임 워크 : 여러 객체를 모아놓은 것(배

	// **int i =0;
	int buy(Product p) { // b1.buy(t)
		// 상품금액이 현재잔액보다 큰 경우
		if (money < p.price) {
			System.out.println("!알림! : 잔액이 부족합니다.");
			System.out.println();
			return 0; //구매실패
		}//if

		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p); // **대신 씀
		return 1;//구매성공
		// **cart[i]=p; //p를 Product[]베열에 담음.
		// **i++;
	}

	// ▲ 다형성 이용해서 위와같이!
//	void buy(Tv t) { //b1.buy(t)
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	
//	void buy(Computer c) { //b1.buy(c)
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	}
//	
//	void buy(Audio a) { //b1.buy(a)
//		money -= a.price;
//		bonusPoint += a.bonusPoint;
//	}
//	
//	void buy(Washing w) { //b1.buy(w)
//		money -= w.price;
//		bonusPoint += w.bonusPoint;
//	}

}// CLASS
