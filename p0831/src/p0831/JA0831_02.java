package p0831;

public class JA0831_02 {

	public static void main(String[] args) {
		
		char ch01 = 'a';  // [==] (같다) [=] (뒤에 있는 값을 앞에다 넣어라/대입연산자)
		char ch02 = 'b';
		char ch03 = 'c'; //char는 ''를 넣어야 하고 String은 ""를 넣어야한다
		System.out.println(ch01);
		System.out.println(ch02);
		System.out.println(ch03);
		// char ch04='가나' 2글자는 불가능함
		char ch04='가';
		String str= new String("abc"); //String은 사적부터 대문자 class개념
		//Date d = new Date();
		String str2 ="가나다라"; //String str= new String("가나다라"); 차이가 있음 
		System.out.println(str);
	}

}
