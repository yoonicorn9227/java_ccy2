package p0922_02;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {
	Scanner scan = new Scanner(System.in);
	ArrayList<StuScore> list = new ArrayList();

	void stuInput() {// 학생성적 입력 메소드
		while (true) {
			int count = list.size() + 1;
			System.out.println("[[학생성적 입력]]");
			System.out.println(count + "번째 학생 이름을 입력하세요.(0.이전 페이지로 이동)");
			String name = scan.next();
			if (name.equals("0")) {// 0번 누르면 이전페이지로 이동
				System.out.println("이전페이지로 이동합니다.");
				break;
			} // if
			System.out.println("[국어성적]을 입력하세요");
			int kor = scan.nextInt();
			System.out.println("[영어성적]을 입력하세요");
			int eng = scan.nextInt();
			System.out.println("[수학성적]을 입력하세요");
			int math = scan.nextInt();
			list.add(new StuScore(name, kor, eng, math));
			System.out.println("학생성적이 <<저장>>되었습니다.");
			System.out.println();
		} // case 1 - while
	}// stuInput()

	void stuOutput() {// 2. 학생성적 출력 메소드
		System.out.println("[[학생성적 출력]]");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------");
		System.out.printf("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < list.size(); i++) {
			StuScore s1 = list.get(i);
			System.out.printf("%d\t%s\t %d\t %d\t %d\t %d\t %.2f\t %d\n",s1.getStuNum(), s1.getName(), s1.getKor(),
					s1.getEng(), s1.getMath(), s1.getTotal(),s1.getAvg(), s1.getRank());
		} // for 학생성적 출력
		System.out.println();
	}// stuOutput

}// CLASS
