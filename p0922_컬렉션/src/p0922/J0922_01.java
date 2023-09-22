package p0922;

import java.util.ArrayList;

public class J0922_01 {

	public static void main(String[] args) {
		String[] title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

		ArrayList<StuScore> list = new ArrayList();// ArrayList<[형타입 입력]>지네릭스 : 내가원하는 클래스만 집어 넣고 싶을때
		list.add(new StuScore("홍길동", 100, 100, 99));
		list.add(new StuScore("유관순", 90, 70, 99));
		list.add(new StuScore("이순신", 80, 100, 99));
		// list.add(new Car("white",5));
		list.add(new StuScore("강감찬", 98, 93, 80));
		list.add(new StuScore("이완용", 100, 83, 100));

		System.out.println("[성적처리 프로그램]");
		System.out.println("-------------------------------------------------------------");
		System.out.printf("%s\t %s\t %s\t %s\t %s\t %s\t %s\t %s\t\n", title[0], title[1], title[2], title[3], title[4],
				title[5], title[6], title[7]);
		System.out.println("-------------------------------------------------------------");

		// 출력 - 번호
		for (int i = 0; i < list.size(); i++) {
			StuScore s = (StuScore) list.get(i); // (StuScore)형변환 생략 가능 : 지네릭사용시
			System.out.printf("[%d\t%s\t %d\t%d\t %d\t %d\t%.2f  \t%d]\n", s.getStuNum(), s.getName(), s.getKor(),
					s.getEng(), s.getMath(), s.getTotal(), s.getAvg(), s.getRank());

		} // for

	}// MAIN

}// CLASS
