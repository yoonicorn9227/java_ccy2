package p0906;

public class J0906_06 {
	public static void main(String[] args) {
		char ch1 = '9'; // 아스키 코드 : 48번
		char ch = '0'; //
		System.out.println(ch1 - '0');
		System.out.println("'0' 아스키 코드 : " + (int) ch);
		System.out.println("'2' 아스키 코드 : " + (int) ch1);

		System.out.println("------------------------");
		char ch2 = 'A'; // 아스키 코드 : 65

		System.out.println((char) (ch2 + 32));

		char ch3 = 'a'; // 아스키 코드 : 97
		System.out.println((char) (ch3 - 32));

	}// main
}// class
