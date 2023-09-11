package p0911;

public class CarProduct {

	public static void main(String[] args) {

		//▼기본생성자로 만드는 경우
		Car c1 = new Car(); //객체선언 후
		c1.color = "White"; // 참조변수명.변수명
		c1.gearType="auto";
		c1.door=5;
		
		//2개 red, auto,4 / black, auto, 5
		
		Car c2 = new Car();
		c2.color="Red";
		c2.gearType="auto";
		c2.door=4;
				
		Car c3 = new Car();
		c3.color="Black";
		c3.gearType="auto";
		c3.door=5;
		
		//▼매개변수가 있는 생성자가 있을 경우
		Car c4 = new Car("Silver", "auto",5);
		Car c5 = new Car("Green", "auto", 4);
		Car c6 = new Car("Pink", "stick",5);
		
	}//MAIN

}//CLASS


