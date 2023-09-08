package p0908;

public class J0908_03 {

	public static void main(String[] args) {

		int a = 0; // 기본형 변수

		// 배열선언 - 저장항 공간이 생김
		int[] num = new int[3]; // 참조형 변수
		int[] hour = new int[3];
		int[] minute = new int[3];
		double[] second = new double[3];

		// 배열데이터 입력
		hour[0] = 12;
		minute[0] = 12;
		second[0] = 12.25;

		// 객체선언 - 저장할 공간이 생김
		Time t = new Time(); // <-객체선언 | 붕어빵
		t.hour = 12;
		t.minute = 12;
		t.second = 12.25;

		Time t2 = new Time(); // 선언해야지만 사용가능
		Time t3 = new Time();

		System.out.println(num);// 주소값
		System.out.println(num[0]);// 데이터값
		System.out.println(t);// 주소값
		System.out.println(t.hour);// 데이터값
		System.out.println(hour); // 주소값
		System.out.println(hour[0]);// 데이터값
		// 변수에 데이터 넣기
		int i = 10;
		// 배열 선언후 데이터 넣기
		int[] arr = new int[3];
		arr[0] = 10;

		// 객체선언후 데이터 넣기
		Time time = new Time();
		time.hour = 10;

	}// main
}// class
