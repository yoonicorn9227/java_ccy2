package p0908;

public class J0908_04 {

	public static void main(String[] args) {
		Tv t = new Tv();
		t.channel = 7; // t는 참조변수
		t.channel = 9;
		t.channelUp(); // 10
		t.channelUp(); // 11

		System.out.println(t.channel);

		t.color = "white";
		t.color = "black";
		System.out.println(t.color);

		System.out.println(t.power);
		t.power();
		System.out.println(t.power);
	}// main

}// class
