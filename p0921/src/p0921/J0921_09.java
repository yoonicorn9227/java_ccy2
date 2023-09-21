package p0921;

import java.util.ArrayList;
import java.util.HashMap;

public class J0921_09 {

	public static void main(String[] args) {

		ColAction col = new ColAction(); //객체선언

		//list출력, list2출력
		
		//list 출력
		HashMap<String, Object> map = col.scoreAll();
		
		ArrayList<StuScore> list = (ArrayList<StuScore>) map.get("list");
		for(int i =0; i<list.size();i++) {
			StuScore s = list.get(i);
			System.out.printf("[%s,%d,%d,%d]\n", s.getName(),s.getKor(),
					s.getEng(), s.getMath());
		}//ArrayList<StuScore> list
		
		//list2 출력
		ArrayList<Car> list2 = (ArrayList<Car>) map.get("list2");
		for(int i =0; i<list.size();i++) {
		Car c1 = list2.get(i);
		System.out.printf("[%s, %d]\n",c1.getColor(),c1.getDoor());
	}// ArrayList<Car> list2
		
//		ArrayList<Car> list2 = col.scoreAll();
//		for(int i =0 ; i<list2.size();i++) {
//			Car c1 = list2.get(i);
//			System.out.printf("[%s, %d]\n",c1.getColor(),c1.getDoor());
//		}
//		
		
		// list를 전달받아, 출력하시오.
//		ArrayList<StuScore> list = col.scoreAll();
//		for (int i = 0; i < list.size(); i++) {
//			StuScore s = list.get(i);
//			System.out.printf("[%s,%d,%d,%d]\n", s.getName(),s.getKor(),
//					s.getEng(), s.getMath());
//		} // for

		// 카드 52장 출력
//		Card[] card = col.cardInsert();
//		for (int i = 0; i < card.length; i++) {
//			System.out.printf("[%s, %d]\n", card[i].getKind(), card[i].getNumber());
//		}//for

		// 카드 1장 출력
//		Card c = col.cardInsert();
//		String result = c.getKind()+c.getNumber();
//		System.out.println(result);

	}// MAIN

}// CLASS
