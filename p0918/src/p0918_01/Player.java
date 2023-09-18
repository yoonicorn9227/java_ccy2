package p0918_01;

abstract public class Player { // abstract메소드가 있으면 무조건 클래스에 붙일것

	int currentPos; // 현재 위치저장변수

	Player() {
		currentPos = 0;
	}

	abstract void play(int pos);

	abstract void stop();

	void play() {
		play(currentPos); //play(int pos)추상메소드 호출
	}

}// CLASS
