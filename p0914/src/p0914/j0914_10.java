package p0914;

import java.util.ArrayList;

public class j0914_10 {

	public static void main(String[] args) {

		Member[] m1 = new Member[5];
		m1[0] = new Member("aaa", "1111", "홍길동", "서울", "010-1111-1111");
		m1[1] = new Member("bbb", "2222", "유관순", "부산", "010-2222-2222");
		m1[2] = new Member("ccc", "3333", "이순신", "대구", "010-3333-3333");
		m1[3] = new Member("ddd", "4444", "강감찬", "인천", "010-4444-4444");
		m1[4] = new Member("eee", "5555", "안중근", "광주", "010-5555-6666");

		for (int i = 0; i < m1.length; i++) {
			System.out.printf("[%s, %s, %s, %s]\n", m1[i].getId(), m1[i].getPw(), m1[i].getName(), m1[i].getAddress(),
					m1[i].getPhone());
		} // for
System.out.println("-----------------------------------------------------------------------");
		ArrayList list = new ArrayList();
		list.add(new Member("aaa", "1111", "홍길동", "서울", "010-1111-1111"));
		list.add(new Member("bbb", "2222", "유관순", "부산", "010-2222-2222"));
		list.add(new Member("ccc", "3334", "이순신", "대구", "010-3333-3333"));
		list.add(new Member("ddd", "4444", "강감찬", "인천", "010-4444-4444"));
		list.add(new Member("eee", "5555", "안중근", "광주", "010-5555-5555"));

		for (int i = 0; i < list.size(); i++) {
			Member m2 = (Member) list.get(i);
			System.out.printf("[%s, %s, %s, %s]\n", m2.getId(), m2.getPw(), m2.getName(), m2.getAddress(),
					m2.getPhone());
		} // for

	}// MAIN

}// CLASS
