package p0908;

import java.util.Scanner;

public class J0908_06 {

	public static void main(String[] args) {
		// 객체의 배열
		Scanner scan = new Scanner(System.in);
		
		StuScore[] s = new StuScore[2]; //배열선언
		
		for(int i = 0; i<2; i++) {
			//☞객체선언을 또한번 선언해줘야한다.
			s[i]=new StuScore(); // 객체선언
			s[i].StuNo = i+1;
			
			
			System.out.println("이름을 입력하세요");
			s[i].name= scan.next();
			System.out.println("국어점수를 입력하세요.");
			s[i].kor=scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			s[i].eng=scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			s[i].math=scan.nextInt();
			s[i].total();
			s[i].avg();
		}//for
		
		//출력부분
		for(int i = 0; i<s.length; i++) {
			System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.2f%n", 
					s[i].StuNo, s[i].name, s[i].kor, s[i].eng, s[i].math, s[i].total,
					s[i].avg);
		}//for(출력부분)
		
		
		
	}// MAIN

}//class
