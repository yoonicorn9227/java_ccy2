package p0905;

import java.util.Scanner;

public class J0905_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		//Math.random(); // 랜덤숫자를 생성하는 메소드 : 0.0<= x , 1.0
		int random = (int)(Math.random()*10)+1; //1부터 10까지 랜덤숫자를 생성
		
		//반복문
		for(int i=0; i<3; i++) {	
			//반복
			//숫자를 입력받아 랜덤숫잘르 맞추는 프로그램을 구현하시오.
			System.out.println("숫자를 입력하세요.");
			int num = scan.nextInt();
			
			//입력한 숫자와 랜덤 숫자가 맞는지 비교
			
			if(random==num) {	
				System.out.println("정답입니다.");
				break; // 정답이면 빠져나오는 명령어 | 프로그램이 종료됨 |반복문을 중간에 종료할떄 쓰는 명령어.
			} else {
				System.out.println("오답입니다.");
			}//else// ->if문 저장하는 방법은 배열을 배우면 한다.
			
			
		}//for//
		
		//정답출력//
		System.out.println("랜덤숫자 : " + random);
		
	
	
	}//main//

}//class//
