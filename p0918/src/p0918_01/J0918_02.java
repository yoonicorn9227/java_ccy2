package p0918_01;

public class J0918_02 {

	public static void main(String[] args) {
	
		Unit[] group = new Unit[5]; //부모 클래스 객체선언.
		group[0] = new Marine(); // 다형성
		group[1] = new Tank(); 
		group[2] = new Marine(); 
		group[3] = new DropShip(); 
		group[4] = new Tank();
		
		
		for (int i=0; i<group.length; i++ ) {
			group[i].move(100, 200);
		}
		
	
		
		
	
	}// MAIN

}// CLASS
