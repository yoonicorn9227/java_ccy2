package p0914;

import java.util.ArrayList;

public class J0914_04 {

	public static void main(String[] args) {
		

		Buyer b1 = new Buyer("aaa", "홍길동");
		System.out.printf("%s 잔액 : %d \n", b1.name, b1.money);

		b1.buy(new Tv()); // Tv t //t가 형변환되어 저장
		b1.buy(new Tv());
		b1.buy(new Tv());

		b1.buy(new Computer());
		b1.buy(new Audio());
		b1.buy(new Washing());

		System.out.printf("%s 잔액 : %d \n", b1.name, b1.money);
		
		//▼ArrayList list관련 b1.list.size()
		System.out.println("상품구매 저장크기 : " + b1.list.size());
		System.out.println("[▼상품구매 목록▼] ");
//		Product p = (Product)b1.list.get(0); //형변환 해줘야한다.
//		System.out.println(p.name);
			
		if(b1.list.isEmpty()) {
			System.out.println("구매물품이 없습니다!");
		}//if
		
		int sum = 0;
		for(int i = 0; i<b1.list.size();i++) {
				Product p = (Product)b1.list.get(i); //형변환 해줘야한다.
				sum+=p.price;
				System.out.println(p);
	}//for
		
		System.out.printf("총 구매금액 : ￦%,d원\n " ,sum);
		
		
		
		
//      ▼** Product[] cart = new Product[10];	
//		System.out.println("상품구매 저장크기 : " + b1.cart.length);
//		System.out.println("[▼상품구매 목록▼] ");
//		for(int i = 0; i<b1.i;i++) {
//			System.out.println(b1.cart[i].name);
//		}

		
		
		//		Tv t = new Tv(); ▶ b1.buy(new Tv());

//		[b1.buy(t);] == [b1.buy(new Tv());]

//		[b1.buy(t);]
//		void buy(Tv t) { //b1.buy(t)
//		money -= t.price;
//		bonusPoint += t.bonusPoint;}

		// ▽▼[b1.buy(t);]는 아래와 같다.
//		System.out.println(t.price);
//		b1.money -= t.price;// b1.money = b1.money - t.price;
//		b1.bonusPoint += t.bonusPoint;

		// Tv t2 = new Tv();
//		b1.buy(t2); //▼ 아래와 같음 Buyer 클래스에 buy메소드 호출
//		System.out.println(t.price);
//		b1.money -= t2.price;// b1.money = b1.money - t.price;
//		b1.bonusPoint += t2.bonusPoint;

		// Tv t3 = new Tv();
		// b1.buy(t3);
//		System.out.println(t.price);
//		b1.money -= t3.price;// b1.money = b1.money - t.price;
//		b1.bonusPoint += t3.bonusPoint;

	}// MAIN

}// CLASS
