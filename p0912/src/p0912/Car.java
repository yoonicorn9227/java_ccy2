package p0912;

public class Car {
	String color;// 인스턴스 변수
	String gearType;
	int door;

	Car() {
		this("White", "Auto", 5); // 다른 생성자 호출시 [this()]
		// [this()] 문장 class 첫번째줄에 온다

	}

	//J0912_04
	Car(Car c){
		this(c.color, c.gearType, c.door);// this() : 다른 생성자 호출!
	}
	
	
	Car(String color, String gearType, int door) {
		this.color = color; // this.변수명 -> 인스턴스 변수 가르킨다!
		//[this.변수명] ▶인스턴스 변수 호출
		this.gearType = gearType;
		this.door = door;
	}

}// CLASS
