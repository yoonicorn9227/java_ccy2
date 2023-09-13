package p0913;

public class J0913_05 {

	public static void main(String[] args) {
		// 싱글톤 패턴
		// Singleton s = new Singleton();
		Singleton s = Singleton.getInstance();
		s.setHour(10);
		s.setMinute(5);
		s.setSecond(40);

		System.out.printf("%d시 %d분 %d초 \n", s.getHour(), s.getMinute(), s.getSecond());

		Singleton s2 = Singleton.getInstance();
		s2.setHour(7);
		s2.setMinute(7);
		s2.setSecond(7);
		System.out.printf("%d시 %d분 %d초 \n", s.getHour(), s.getMinute(), s.getSecond());
		//▶ static으로 인해서 맨마지막 변수값으로 고정
		System.out.printf("%d시 %d분 %d초\n", s2.getHour(), s2.getMinute(), s2.getSecond());

	}// MAIN

}// CLASS
