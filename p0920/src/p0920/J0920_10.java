package p0920;

public class J0920_10 {

	public static void main(String[] args) {
		String str = "swim,golf,book,run,game";
		// 배열에 담아 출력

		String[] hobby = str.split(",");
		System.out.println(hobby[1]);
		System.out.println(hobby[2]);
		System.out.println(hobby[3]);
		System.out.println(hobby[4]);
		System.out.println("1-------------------------------");
		
		String str2 = "수영,골프,독서,조깅,게임";
		String[] hobby2 = str2.split("/");
		for (String h2 : hobby2) {
			System.out.println(h2);
		}

		System.out.println("2-------------------------------");

		String str3 = "수영 골프 독서 조깅 게임";
		String[] hobby3 = str3.split(" ");
		for (String h3 : hobby3) {
			System.out.println(h3);
		}

		System.out.println("3-------------------------------");

		String str4 = "자바-파이썬-C-자바스크립트-리엑트";
		String[] subject = str4.split("-");
		for (String h4 : subject) {
			System.out.println(h4);
		}


	}// MAIN

}// CLASS
