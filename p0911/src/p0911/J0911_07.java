package p0911;

import java.util.Scanner;

public class J0911_07 {

	static Scanner scan = new Scanner(System.in); // 객체선언 - scan(인스턴스 변수)

	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in); | static Scanner scan = new
		// Scanner(System.in); 공통으로 사용하면 하나하나 안쳐줘도 된다.
		System.out.println("학번을 입력하세요.");
		int stuNum = scan.nextInt();
		String name = nameInput();

		// int kor //인스턴스 변수
		J0911_07 a = new J0911_07(); // 인스턴스 변수 | 객체선언 - > [클래스명[J0911_07].참조변수[a]=new 클래스명[J0911_07();]
		a.korInput(); //참조변수명[a].변수명[korInput();]

		//int eng //클래스 변수
		int eng =engInput();
		
		System.out.println("[학  번] : " + stuNum);
		System.out.println("[이  름] : " + name);

		// 국어점수 출력 100점 //인스턴스 변수
		System.out.println("<국어점수> : " + a.korInput());
		
		//영어점수 출력 90점 //클래스변수
		System.out.println("<영어점수> : " + eng);
		
		
	}// MAIN

	// Scanner scan = new Scanner(System.in);
	// 인스턴스 메소드 - <객체선언 후 [참조변수명.메소드명]>
	// 클래스(static) 매소드 - 객체선언 없이 클래스명.메소드명
	static String nameInput() {
		String name = ""; // 지역변수
		System.out.println("[이름]을 입력하세요.");
		name = scan.next();
		return name;
	}

	// korInput()
	int korInput() { //인스턴스 변수
		int kor = 0;
		System.out.println("[국어점수]를 입력하세요.");
		kor = scan.nextInt();
		return kor;
	}
	
	static int engInput() { //클래스 변수 | [객체선언X]
		int eng = 0;
		System.out.println("[영어점수]를 입력하세요.");
		eng = scan.nextInt();
		return eng;
	}
	

}// CLASS
