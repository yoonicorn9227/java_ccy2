package p0912;

public class J0912_04 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color="Red";
		System.out.println("c1.color : " + c1.color);
		System.out.println("c1.gearType : " + c1.gearType);
		System.out.println("c1 door : " + c1.door);

		// 주소값이 복사되어 c1과 c2가 같아짐.
//		 Car c2 = c1;
//		 c2.color = "Blue";
//		 System.out.println("다시호출c1.color : " + c1.color);

		System.out.println("==================================");
		Car c2 = new Car(c1); // c2와 c1의 주소는 다르지만 c1의 데이터값을 c2 객체로 불러온것 | 객체를 복사할때 쓰는 방법
		System.out.println("다시호출 c2.color : " + c2.color);

		c2.color = "Pink";
		System.out.println("다시호출 c2.color : " + c2.color);
	}// MAIN

}// CLASS
