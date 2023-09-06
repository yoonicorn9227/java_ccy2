package p0905;

import java.util.Scanner;

public class J0905_15 {

	public static void main(String[] args) {
		// 1~100까지 랜덤숫자를 생성해서 맞추는 프로그램을 구현하시오.
		Scanner scan = new Scanner(System.in);
		int[] save = new int[10];
		int random = (int)(Math.random()*100)+1;
		
		int a = 0; //while 초기값 설정
		
		
		while(a<10) {
			System.out.println("임의숫자를 입력하세요.>>>>>>>>>>>>");
			int input = scan.nextInt();
			
			save[a]=input;
			
			if(random==input) {
				System.out.println("|정답|입니다.");
				break;
			}else if(random>input) {
					System.out.println("입력한 수보다 <큰 수> 입니다.");
				} else if(random<input) {
					System.out.println("입력한 수보다 [작 은 수] 입니다.");
					
					if(a==9) {
						break;
					}
					
				}//if
			a++;//while 증감식
		
		}//while
			
		//출력
		System.out.println("입력한 숫자 :  ");
		for(int b=0; b<=a; b++) {
			System.out.printf("%d", save[b]);
		}
		System.out.println("랜덤 숫자 : " + random);
		
		
		

	}

}
