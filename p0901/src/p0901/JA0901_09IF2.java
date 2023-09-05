package p0901;

import java.util.Scanner;

public class JA0901_09IF2 {

	public static void main(String[] args) {
		//if-else if-else문 사용
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		int number = scan.nextInt();
		if(number>=90) {
			System.out.println("A학점 입니다.");
		}else if(number>=80){ //(number<=89 생략해줘도 된다
			System.out.println("B학점 입니다.");
		}else if(number<=79 && number>=70) {
			System.out.println("C학점 입니다.");
		}else if(number<=69 && number>=60) {
			System.out.println("D학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
		}
		
		
		
		
	}
}
