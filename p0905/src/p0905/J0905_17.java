package p0905;

import java.util.Scanner;

public class J0905_17 {

	public static void main(String[] args) {
		// 1~1,000 랜덤숫자를 생성해서 맞히는 프로그램을 구현하시오
		// 1~1,000까지 랜덤숫자 생성
		// 2. 입력
		// 3. 비교
		// 4. 출력
		// 변수, 클래스 선언

		Scanner scan = new Scanner(System.in);
		int[] arrNum = new int[10];// 입력된 숫자 저장배열
		int number = 0; // 입력한 숫자
		int count = 0;// 도전횟수
		int random = 0; // 랜덤숫자

		random = (int) (Math.random() * 100) + 1; // 1-100개의 범위 핸덤숫자를 생성|(100-1+1) 2-100까지 숫자 99개
		System.out.println("[랜덤숫자] :" + random);
		
		while (true) {
			System.out.println((count + 1) + "번째 숫자를 입력하세요.>>>>>>>>>");
			number = scan.nextInt();
			arrNum[count] = number; // 배열에 입력한 숫자저장
			System.out.println("<도전 횟수> : " + (count + 1));
			System.out.println("[입력한 숫자] : " + number);

			// 입력한 숫자와 랜덤숫자 비교
			if(random==number) {
				System.out.println("★정 답★입니다.");
				break;
			} else if(random>number) {
			System.out.println("입력한 수보다 ●작 은 수● 입니다.");
			} else {
				System.out.println("입력한 수보다 ○큰 수○ 입니다.");
			}

			count++;
			if (count > 9) { // 입력한 횟수가 10번인 확인!
				System.out.println("▶10번 완료! / ◆프로그램을 종료합니다.◆");
				count--;
				break;

			}
		} // while

		// 배열에 저장된 입력한 숫자 출력
		System.out.print("입력한 숫자 : ");
		for(int i =0; i<10; i++) {	
			if(i==0) {
				System.out.print(arrNum[i]);
				continue;
			}
			System.out.print(", "+arrNum[i]);
		}
		System.out.println();
		
		// 도전횟수 출력
		System.out.println("[도전횟수] : " + (count + 1) + " 번");
		
		// 랜덤숫자 출력
		System.out.println("[랜덤숫자] : " + random);

	}//main

}//class
