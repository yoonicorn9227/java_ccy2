package p0921;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class J0921_07 {

	public static void main(String[] args) {
		// list - 순서 O 중복 O

		// set- 순서X 중복X / 순서가 없으면 iterator사용
		HashSet<String> set = new HashSet<String>();
		set.add("a");
		set.add("c");
		set.add("b");
		set.add("d");
		set.add("b");
		set.add("a");

		Iterator<String> it = set.iterator(); //Iterator는 1회성 ,한번만 출력 가능. //동일한 데이터 값은 출력 안나옴// 순서대로 안나옴
		while(it.hasNext()) {					
			System.out.println(it.next());
		}
		System.out.println("--------------------");

		Iterator<String> it2 = set.iterator();
		while(it2.hasNext()) { 
			System.out.println(it2.next());
		}
		
		System.out.println("완료!!");
		
		
		
//		ArrayList list = new ArrayList();
//
//		list.add(0);
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(6);
//		list.add(7);
//		list.add(8);
//		list.add(9);

		// Iterator 최신버전 - Iterator();, hasNext();, next()
//		Iterator<String> it = list.iterator(); // 컬렉션 프레임웍은 원래 이방식으로 사용
//		while (it.hasNext()) { // hasNext() 읽어 올 요소가 남아있는지 확인 있으면true 없으면 false
//			System.out.println(it.next());
//		}
//
//		Vector<Integer> v = new Vector();
//		v.add(1);
//		v.add(2);
//		v.add(3);
//		v.add(4);
//		v.add(5);

//		Iterator it = list.iterator(); //컬렉션 프레임웍은 원래 이방식으로 사용
//		while(it.hasNext()) { //hasNext() 읽어 올 요소가 남아있는지 확인 있으면true 없으면 false
//			System.out.println(it.next());
//		}

		// Iterator 구버전 - elements(), hasMoreElements(), nextElement()
//		Enumeration<Integer> e = v.elements();
//		while (e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}

		// list.remove(5);
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
//
//		for (int i = list.size()-1; i > 0; i--) {
//			list.remove(i);
//		}
//		
//		System.out.println("----------------------");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}

	}// MAIN

}// CLASS
