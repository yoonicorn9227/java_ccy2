package p0913;

public class J0913_06 {

	public static void main(String[] args) {
		// ★다형성_형변환
		FireEngine f1 = new FireEngine();
		f1.water(); // FireEngine 메소드
		f1.go(); // Car 메소드
		f1.stop(); // Car 메소드

		Ambulance a1 = new Ambulance();
		a1.siren();// Car 메소드
		a1.stop();// Car 메소드
		a1.siren();// Ambulance 메소드

		// 다형성
		Car c1 = new FireEngine(); //
		c1.go();
		c1.stop();
		// c1.water(); // 공간은 있으나, 사용은 불가능.

		// 다형성
		Car c2 = new Ambulance();
		c2.go();
		c2.stop();
		// c2.siren(); //자손의 메소드

		Car c3; // 주소값만있고 저장공간은 없음

		c3 = f1; // 조상 참조변수 = 자손 참조변수 (담을수 있음)
		// a1 =f1; 클래스 자체가 달라서 담을 수 없음.
		// c3.water(); //공간이 있어도 조상의 참조변수로는 사용할수 없음.

		FireEngine f2;
		f2 = (FireEngine) c3; // 형변환 ▶
		System.out.print("f2 : ");
		f2.water();

		// instanceof 연산자
		Ambulance a2;
		FireEngine f3;
		if (c3 instanceof FireEngine) {
			System.out.println("c3는 FireEngine으로 형변환 가능합니다.");
			f3 = (FireEngine) c3;
			f3.water();
		}

		if (c3 instanceof Ambulance) {
			System.out.println("c3는 Ambulance으로 형변환이 가능합니다.");
			a2 = (Ambulance) c3;
			a2.siren();
		}

		Object o1; //넘겨받아서 보관만 가능
		o1 = f1;
		o1 = a1;
		
		
		// a2 = (Ambulance)c3; //c3에는 FireEngine객체가 담겨져 있음.
		// a2.siren(); //타입이 다르기에, 컴파일시 에러발생

	}// MAIN

}// CLASS
