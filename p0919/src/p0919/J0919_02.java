package p0919;

public class J0919_02 {

	public static void main(String[] args) {

		KorPerson k1 = new KorPerson("920207-1023658", "홍길동");
		KorPerson k2 = new KorPerson("920207-1023658", "홍길동");
		KorPerson k3 = new KorPerson("940207-1023758", "김길동");

		if (k1.equals(k2)) {//주소값으로만 비교 그런데/ KorPerson클래스에서 equals쓰면 
			System.out.println("k1, k2는 같은 사람입니다.");
		} else {
			System.out.println("k1,k2는 다른 사람입니다.");
		}
		System.out.println(k1);
		System.out.println(k2);
		System.out.println("-----------------------------------");
		if (k1.equals(k3)) {
			System.out.println("k1, k3는 같은 사람입니다.");
		} else {
			System.out.println("k1,k3는 다른 사람입니다.");
		}
		System.out.println(k1);
		System.out.println(k3);
		System.out.println("-----------------------------------");
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = "김길동";

		if (str1.equals(str2)) {
			System.out.println("k1, k3는 같은 사람입니다.");
		} else {
			System.out.println("k1,k3는 다른 사람입니다.");
		}
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("-----------------------------------");
		if (str1.equals(str3)) {
			System.out.println("str1, str2는 같은 사람입니다.");
		} else {
			System.out.println("str1,str3는 다른 사람입니다.");
		}
		System.out.println(str1);
		System.out.println(str3);

	}// MAIN

}// CLASS
