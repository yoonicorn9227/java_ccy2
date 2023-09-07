package p0907;

import java.util.Scanner;

public class J0907_05_주택복권 {

	public static void main(String[] args) {
		// 주택복권 1조 12345 / (0-9)조 00000-99999
		// 끝번호 5 - 1,000원 45-10,000 345-100,000 2345 - 1,000,000 12345-10,000,000
		// 1-12345 1억원
		Scanner scan = new Scanner(System.in);
		// 1조 | 0-9조
		// int firstNo = (int)(Math.random()*10); //0-9 -> 1-9
		int fNo = (int) (Math.random() * 9) + 1; // 0-9 -> 1-9

		int sNo = (int) (Math.random() * 100000); // 0-99999

		// ※[String.format();] -> String타입으로 변경하는데 format을 넣어서 String타입으로 변경됨. |
		// String.format(포맷,입력값)
		String strNo = String.format("%05d", sNo);// 예시)1->001, 12->012 출력되게 함.
		System.out.println(strNo);

		String winNo = fNo + "조" + strNo;
		System.out.printf("당첨번호 : %s\n", winNo); // (%d:정수) (%s 문자열) (%c문자) (%f실수)

		// ----복권입력
		System.out.println("조 단위를 입력하세요.(1-9조까지)");
		int input1 = scan.nextInt();
		System.out.println(input1 + "조 00000 5자리 입니다.");
		System.out.println("뒷 5자리를 입력하세요.(00000-99999까지)");
		String input2 = scan.next();

		// 최종입력한 번호
		String inputNo = input1 + "조" + input2;

		System.out.println("----복권확인---------");
		System.out.println("입력번호 : " + inputNo+" ");
		System.out.printf("당첨번호 : %s\n", winNo);

		/// ---
		int count = 0; // 일차 횟수
		//-------
		if (inputNo.charAt(6) == winNo.charAt(6)) {count++;
		if (inputNo.charAt(5) == winNo.charAt(5)) {count++;
		if (inputNo.charAt(4) == winNo.charAt(4)) {count++;
		if (inputNo.charAt(3) == winNo.charAt(3)) {count++;
		if (inputNo.charAt(2) == winNo.charAt(2)) {count++;
		if (inputNo.charAt(0) == winNo.charAt(0)) {count++;}}}}}}//if(복권자리 수)

		if (count == 0) {
			System.out.println("       ▶ 꽝 ◀        ");
		} else if (count == 1) {
			System.out.println("<1개>를 맞혔습니다. [당첨 : 1,000원!]");
		} else if (count == 2) {
			System.out.println("<2개>를 맞혔습니다. [당첨 : 10,000원!]");
		} else if (count == 3) {
			System.out.println("<3개>를 맞혔습니다. [당첨 : 100,000원!]");
		} else if (count == 4) {
			System.out.println("<4개>를 맞혔습니다. [당첨 : 1,000,000원!]");
		} else if (count == 5) {
			System.out.println("<5개>를 맞혔습니다. [당첨 : 10,000,000원!]");
		} else if (count ==6) {
			System.out.println("===================");
			System.out.println();
			System.out.println("[★★☆!인☆생☆역☆전!☆★★]");
		}

	}// main

}// class
