package p0831;

public class JA0831_05 {

	public static void main(String[] args) {
		// 8. 문자와 문자열 <Any Type + 문자열> 과 < 문자열+Any Type > 은 결국 문자열
		System.out.println(7 + 7);
		System.out.println(7 + ""); // int+String = String "7" 문자열 타입
		System.out.println("" + 7 + 7); //
		System.out.println(7 + 7 + "");
		System.out.println("----------------------------------------------");
		int num = 7;
		int num2 = 8;
		String str = "";
		char ch = ' ';
		System.out.println(num + num2); // 7+8=15 int타입
		System.out.println(str + num + num2); // ""+7+8=78 문자열타입(String)
		System.out.println(num + num2 + str); // 7+8+""=15 문자열타입(String)

		System.out.println("합계 : " + (num + num2));
		
		
		int kor = 98;
		int eng = 99;
		int math = 100;
		String name = "최창윤";
		// System.out.print("합계"kor+eng+math)
		System.out.println("이름 : "+name);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 :" + math);
		System.out.println("합   계 : " + (kor + eng + math));

	}

}
