package p0913;

public class J0913_04 {

	public static void main(String[] args) {

		Time t = new Time();
//		t.hour = 13;
//		t.min=13;
//		t.sec=13;
		t.setHour(13);
		t.setMinute(13);
		t.setSecond(13);

		System.out.printf("%d분 %d분 %d초 \n", t.getHour(), t.getMinute(), t.getSecond());

		Time t2 = new Time();
//		t.hour = 50;
//		t.min=55;
//		t.sec=198;

		t2.setHour(50);
		t2.setMinute(55);
		t2.setSecond(198);

		System.out.printf("%d분 %d분 %d초 \n", t2.getHour(), t2.getMinute(), t2.getSecond());

	}// MAIN

}// CLASS
