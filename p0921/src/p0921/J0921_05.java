package p0921;

import java.util.ArrayList;
import java.util.Vector;

public class J0921_05 {

	public static void main(String[] args) {

		ArrayList<Card> list = new ArrayList(); // 형변환 안해주려면 제너릭 사용
		list.add(new Card(1, "Spade")); // list.add(Object o);
		list.add(new Card(2, "Spade"));
		list.add(new Card(3, "Spade"));
		list.add(new Card(4, "Spade"));
		list.add(new Card(1, "Spade"));
		// list.add(new StuScore()); //입력불가

		// list 출력하시오.
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getKind());
			System.out.println(list.get(i).getNumber());
		}

//		for (int i = 0; i < list.size(); i++) {
//			Card c = (Card) list.get(i);
//			System.out.println(c.getNumber() + "" + c.getKind());
//			System.out.println(list.get(i).getNumber() + "" + list.get(i).getKind());
//			System.out.println(list.get(i));
//		}//for

		// ArrayList list = new ArrayList(); //싱글쓰레드 지원
		// Vector list2 = new Vector(); //멀티쓰레드 지원
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(1);
//		list.add(2);
//		list.add(5);
//		
//		for(int i =0 ; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}

	}// MAIN

}// CLASS
