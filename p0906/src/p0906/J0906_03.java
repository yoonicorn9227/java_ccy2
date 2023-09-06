package p0906;

import java.util.Scanner;

public class J0906_03 {

	public static void main(String[] args) {
		// arrKor | 5개짜리 배열생성, 점수를 직접 입력해서 출력

		Scanner scan = new Scanner(System.in);

		String[]name=new String[3];
		int[] arrKor = new int[3];
		int[] arrEng = new int[3];
		
		for (int i = 0; i < arrKor.length; i++) {
			System.out.println("-----------------------------------");
			//이름입력
			System.out.println((i+1)+"번째 이름을 입력하세요.");
			name[i]=scan.next();
			System.out.println((i + 1) + "번째 국어점수를 입력하세요.>>>");
			arrKor[i] = scan.nextInt();
			System.out.println((i + 1) + "번째 영어점수를 입력하세요.>>>");
			arrEng[i] = scan.nextInt();
		} // for문(입력)
		
		System.out.println("=============================================");
		System.out.print("[입력한 국어점수] : ");

		
		for (int i = 0; i < name.length; i++) {

			if (i == 0) { // 첫번째 국어점수 쉼표없이
				System.out.print(name[i]);
				continue;
			}
			System.out.print(", " + name[i]);
		} // for(이름출력)
		
		System.out.println();
		
		
		
		for (int i = 0; i < arrKor.length; i++) {

			if (i == 0) { // 첫번째 국어점수 쉼표없이
				System.out.print(arrKor[i]);
				continue;
			}
			System.out.print(", " + arrKor[i]);
		} // for(국어출력)
		
		System.out.println();
/////////////////////////////////////////////////////////////////
		System.out.print("[입력한 영어점수] : ");
		for(int i =0; i<arrEng.length; i++) {
			if(i==0) {
				System.out.print(arrEng[i]);
				continue;
			}
			System.out.print(", "+arrEng[i]);
		}// for(영어출력)
		
		
		
		
	}// main

}// class
