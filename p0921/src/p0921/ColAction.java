package p0921;

import java.util.ArrayList;
import java.util.HashMap;

public class ColAction {

	Card[] card = new Card[52]; // 카드 52개 생성
	String[] shape = { "Spade", "Heart", "Diamond", "Clover" };
	ArrayList<StuScore> list = new ArrayList();
	ArrayList<Car> list2 = new ArrayList();

	HashMap<String, Object> map = new HashMap();
	
	
	// 학생3명 리턴
	HashMap<String, Object> scoreAll() {
		// 3명
		list.add(new StuScore("유관순", 100, 100, 100));
		list.add(new StuScore("이순신", 100, 100, 100));
		list.add(new StuScore("안중근", 90, 90, 91));
		
		list2.add(new Car("White", 5));
		list2.add(new Car("Red", 4));
		list2.add(new Car("Black", 5));
		
		map.put("list", list);
		map.put("list2", list2);
		
		return map;
	}// scoreAll

	void cardAll() {
		// 1-13
		// Spade, Heart, Diamond, Clover
		// 52장 카드 생성
		for (int i = 0; i < card.length; i++) {
			int number = i % 13 + 1;// 1-13
			String kind = shape[i / 13];
			card[i] = new Card(number, kind);
		} // for
	}// cardAll

	// 카드 52장 리턴

	Card[] cardInsert() { // 인스턴스 메소드
		cardAll(); // 52장 카드호출 // card 참조변수

		return card;
	}// cardInsert

	// 카드 1장 리턴
//	Card cardInsert() { // 인스턴스 메소드
//		cardAll(); //52장 카드호출 // card 참조변수
//		
//
//		Card c = new Card(); // 객체선언
//		c.setNumber(1);
//		c.setKind("Spade");
//		return c;
//	}// cardInsert

}// CLASS
