package p0831;

public class JA0831_03 {

	public static void main(String[] args) {
		boolean power = true;
		boolean power2 = false;

		char ch = 'A';
		char ch2 = 'a';
		char ch3 = '\u0041'; // 16진수 41번
		char tab = '\t';
		byte b = 127;
		short s = 32767;
		int num = 97; // 아스키코드 사용!
		int num2 = 0100;// 8진수 - 8*8=;64 / int hex =0x100 16진수
		// System.out.print(ch2); 에서 뒤 ln은 Enter키 다음줄 입력
		System.out.print(ch);
		System.out.print(ch3);
		System.out.print(ch2);
		System.out.print(tab);
		System.out.print(b);
		System.out.println(s);
		System.out.println("-------------------------");
		System.out.println((char) num);
		System.out.println(num);
		System.out.println(num2);
		int number = 0;
		System.out.println(number); // 지역변수는 값을 입력해야 사용할 수 있음. <int number;> 식이면 입력이 안됨
	}

}
