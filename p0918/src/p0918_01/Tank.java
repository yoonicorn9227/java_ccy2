package p0918_01;

public class Tank extends GroundUnit implements Repairable{

	Tank() {
		super(150);//Tank의 객체선언시 체력은 150으로 만들어 줌.
		hitPoint = MAX_HP; //
		name = "Tank";
		
	}


	
	
	void move(int x, int y) {
		System.out.printf("%s :[x: %d, y: %d] 좌표로 이동! \n",name, x, y);

	}

}// CLASS
