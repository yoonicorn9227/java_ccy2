package p0925;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {

	Scanner scan = new Scanner(System.in);
	ArrayList<StuScore> list = new ArrayList();

	void stuInput() {//1.학생성적 입력 메소드
		while (true) {
			System.out.println("[[학생성적 입력]]");
			System.out.println("학생 [이름]을 입력하세요.(0.이전페이지로 이동)");
			String name = scan.next();
			if (name.equals("0")) {
				System.out.println("⊙이전페이지로 이동합니다.>>");
				break;
			} // if
			System.out.println("[국어성적]을 입력하세요.");
			int kor = scan.nextInt();
			System.out.println("[영어성적]을 입력하세요.");
			int eng = scan.nextInt();
			System.out.println("[수학성적]을 입력하세요.");
			int math = scan.nextInt();
			list.add(new StuScore(name, kor, eng, math));
			System.out.println("학생성적이 <저장>되었습니다.");
			System.out.println();
		} // while(case 1)
	}// stuInput()

	void stuOutput() {//2.학생성적 출력 메소드
		System.out.println("▼▼▼▼▼▼▼▼▼▼▼▼▼▼");
		System.out.println("[[학생성적 출력]]");
		System.out.println();
		System.out.printf("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < list.size(); i++) {
			StuScore s1 = list.get(i);
			System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.2f\t %d\n", s1.getStuNum(), s1.getName(), s1.getKor(),
					s1.getEng(), s1.getMath(), s1.getTotal(), s1.getAvg(), s1.getRank());
			System.out.println();
		} // for(학생성적 출력)
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------");
	}// stuOutput()

	void stuUpdate() {//3.학생성적 수정 메소드
		while (true) {
			System.out.println("[[학생성적 수정]]");
			System.out.println("수정하고자 하는 [학생이름]을 입력하세요.(0.이전페이지로 이동)");
			String inputName = scan.next();
			if (inputName.equals("0")) {
				System.out.println("☞이전페이지로 이동합니다.>>");
				System.out.println();
				break;
			} // if
			System.out.println("입력된 이름으로 검색중...>>>");
			int i = 0;
			int count = 0;
			for (i = 0; i < list.size(); i++) {
				StuScore s2 = list.get(i);
				if (inputName.equals(s2.getName())) {
					System.out.printf("[%s]학생을 찾았습니다!\n", s2.getName());
					count = 1;
					break;
				} // if
			} // for
			if (count == 0) {
				System.out.println("학생이 검색되지 않았습니다. ▷다시 입력하세요,");
				break;
			} // if
			System.out.println("------------------------------------------------------");
			System.out.println("① 국어성적");
			System.out.println("② 영어성적");
			System.out.println("③ 수학성적");
			System.out.println("------------------------------------------------------");

			System.out.println("수정하고자 하는 과목성적을 [▷선택번호]를 입력하세요.");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("[▶국어성적 수정]");
				System.out.println("변경전 현재 국어점수 : " + list.get(i).getKor());
				System.out.println("변경할 [국어점수]를 입력하세요.");
				list.get(i).setKor(scan.nextInt());
				list.get(i).setTotal(list.get(i).getKor() + list.get(i).getEng() + list.get(i).getMath());
				list.get(i).setAvg(list.get(i).getTotal() / 3.0);
				System.out.println("------------------------------------------------------");
				System.out.printf("[%d]점으로 국어성적이 수정되었습니다.", list.get(i).getKor());
				System.out.println();
				break;
			case 2:
				System.out.println("[▶영어성적 수정]");
				System.out.println("변경전 현재 영어점수 : " + list.get(i).getEng());
				System.out.println("변경할 [영어점수]를 입력하세요.");
				list.get(i).setEng(scan.nextInt());
				list.get(i).setTotal(list.get(i).getKor() + list.get(i).getEng() + list.get(i).getMath());
				list.get(i).setAvg(list.get(i).getTotal() / 3.0);
				System.out.println("------------------------------------------------------");
				System.out.printf("[%d]점으로 영어성적이 수정되었습니다.", list.get(i).getEng());
				System.out.println();
				break;
			case 3:
				System.out.println("[▶수학성적 수정]");
				System.out.println("변경전 현재 수학점수 : " + list.get(i).getMath());
				System.out.println("변경할 [수학점수]를 입력하세요.");
				list.get(i).setMath(scan.nextInt());
				list.get(i).setTotal(list.get(i).getKor() + list.get(i).getEng() + list.get(i).getMath());
				list.get(i).setAvg(list.get(i).getTotal() / 3.0);
				System.out.println("------------------------------------------------------");
				System.out.printf("[%d]점으로 수학성적이 수정되었습니다.", list.get(i).getMath());
				System.out.println();
				break;
			}// switch(성적수정)
		} // while(학생성적 수정)
	}// stuUpdate()

	void stuDelete() {//4.학생성적 삭제 메소드
		while (true) {
			System.out.println("[[학생성적 삭제]]");
			System.out.println("삭제하고자 하는 [▷학생이름]을 입력하세요.(0.이전페이지로 이동)");
			String inputName = scan.next();
			if (inputName.equals("0")) {
				System.out.println("☞이전페이지로 이동합니다.>>");
				System.out.println();
				break;
			} // if
			System.out.println("입력된 이름으로 검색중...>>>");
			int i = 0;
			int count = 0;
			for (i = 0; i < list.size(); i++) {
				StuScore s2 = list.get(i);
				if (inputName.equals(s2.getName())) {
					System.out.printf("[%s]학생을 찾았습니다!\n", s2.getName());
					count = 1;
					break;
				} // if
			} // for
			if (count == 0) {
				System.out.println("학생이 검색되지 않았습니다. ▷다시 입력하세요,");
				continue;
			} // if
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생성적 삭제");
			System.out.println("2.성적삭제 취소");
			System.out.println("------------------------------------------------------");

			System.out.println("학생을 성적을 <※삭제>하시겠습니까? (1.학생성적 삭제 2.성적삭제 취소)");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("[학생성적 삭제]");
				System.out.printf("[%s]학생성적이 <삭제> 되었습니다.", list.get(i).getName());
				list.remove(i);
				System.out.println();
				break;
			case 2:
				System.out.println("[성적삭제 취소]");
				System.out.printf("[%s]학생성적 삭제가 <<취소>>되었습니다.", list.get(i).getName());
				System.out.println();
				break;
			}// switch(성적수정)
		} // while(학생성적 수정)
	}// stuDelete()

	void stuRank() {//5..학생성적 등수처리 메소드
		System.out.println("[[학생성적 등수처리]]");
		list.size();
		for (int i = 0; i < list.size(); i++) {
			int count = 1;
			StuScore st1 = list.get(i);
			for (int j = 0; j < list.size(); j++) {
				StuScore st2 = list.get(j);
				if (st1.getTotal() < st2.getTotal()) {
					count++;
				} // if(성적등수)
			} // for2
			st1.setRank(count);
			System.out.println("※1명 학생 등수처리중");
			count = 1;
		} // for1
		System.out.println("전체학생 등수처리를 <<완료>>했습니다!");
		System.out.println();
	}// stuRank()

	void stuSearch() {//1.학생성적 검색 메소드
		while (true) {
			System.out.println("[[학생성적 검색]]");
			System.out.println("찾고자 하는 [학생이름]을 입력하세요.(0.이전페이지로 이동)");
			String inputName = scan.next();
			if (inputName.equals("0")) {
				System.out.println("☞이전페이지로 이동합니다.>>");
				System.out.println();
				break;
			} // if
			System.out.println("입력된 이름으로 검색중...>>>");
			int i = 0;
			int count = 0;
			for (i = 0; i < list.size(); i++) {
				StuScore s2 = list.get(i);
				if (inputName.equals(s2.getName())) {
					System.out.printf("[%s]학생을 찾았습니다!\n", s2.getName());
					System.out.printf("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
					System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.2f\t %d\n", s2.getStuNum(), s2.getName(),
							s2.getKor(), s2.getEng(), s2.getMath(), s2.getTotal(), s2.getAvg(), s2.getRank());
					System.out.println();
					count = 1;
					break;
				} // if
			} // for
			if (count == 0) {
				System.out.println("학생이 검색되지 않았습니다. ▷다시 입력하세요,");
				continue;
			} // if
		} // while(학생성적 검색)
	}// stuSearch()

	void stuExit() {//0. 프로그램 종료 메소드
		System.out.println("[<<♠♠♠♠♠프로그램을 종료♠♠♠♠♠>>]");
		System.out.println();
	}// stuExit()

}// CLASS
