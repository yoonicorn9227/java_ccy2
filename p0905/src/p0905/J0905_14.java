package p0905;

import java.util.Arrays;
import java.util.Scanner;

public class J0905_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10]; // 배열 10개 생성
		
		//<활용예제>
		// 1-100까지의 랜덤숫자를 생성해서 맞히는 프로그램을 구현하시오
		// 1.랜덤숫자 생성
		// 2. 무한반복 while(true)
		// 3. 숫자입력
		// 4. if를 사용해서 랜덤숫자와 입력숫자 맞는 비교

		// 1.랜덤숫자 생성
		int random = (int) (Math.random() * 100) + 1;
		int i = 0; //초기식
		System.out.println(random);
		
		
		// 2. 무한반복 while(true)
		while (i<10) {
		
			// 3. 숫자입력
			System.out.println("[1~100] 사이의 숫자를 입력하세요.>>>>>");
			int input = scan.nextInt();
			
			
			////
			num[i]=input; //입력한 숫자를 배열에 저장 num[0]=처음 입력한 값 , num[1] = 두번째 입력한 값
		
			// 4.if로 랜덤숫자와 맞는지 비교
			if (random == input) {
				System.out.println("정답 입니다.");
				break;
			} else if (random > input) {//
				System.out.println("입력한 수보다 [큰   수] 입니다.");
			} else if (random < input) {
				System.out.println("입력한 수보다 [작 은 수] 입니다.");
				
				if(i==9) {
					break;
				}
			} // if
				i++; //증감식
		} // while
		
		//최종출력
		System.out.println("입력한 숫자 : ");
		for(int j=0; j<=i; j++) {
			System.out.printf("%d",num[j]);
		}
		System.out.println();
		
		System.out.println("랜덤 숫자 : " + random);

//---------------------------------------------------------------------------------		
		// for(int i = 0 ; i<10; i++) {
		// System.out.println(num); // num만 찎으면 주소값만 나옴
		// System.out.println(Arrays.toString(num)); //배열의 모든 값을 출력
		// System.out.println(num[i]);

		// }//배열 for문
	}//main

}//class
