package p0915_학생성적;

import java.util.ArrayList;

public class Buyer {

	String id;
	String name;
	int money;
	int bonusPoint = 0;

	Buyer() {

	}

	Buyer(String id, String name) {
		this.id = id;
		this.name = name;
	}

	ArrayList list = new ArrayList();

	int buy(Product p) {
		if (money < p.price) {
			System.out.println();
			return 0;
		} // if
		System.out.println("!알림! 잔액이 없습니다.");
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p);
		return 1;
	}

}// CLASS
