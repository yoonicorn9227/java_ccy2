package p0918_01;

public class J0918_03 {

	public static void main(String[] args) {
Tank t = new Tank(); //탱크1
System.out.println("탱크가 폭탄을 맞음.");
t.hitPoint -= 10;
System.out.println("탱크가 폭탄 맞음");
		t.hitPoint -=10;
		System.out.println("총알을 맞음");
		t.hitPoint-=2;
		System.out.println("탱클의 체력 : "+t.hitPoint);
		SCV s = new SCV(); //SCV 1개
		Marine m = new Marine(); //Marine 1
		DropShip d = new DropShip();
		s.repair(t); //탱크수리
		System.out.println("텡크의 체력 : "+t.hitPoint);
		
		System.out.println("DropShip 총알 맞음");
		d.hitPoint-=20;
		System.out.println("DropShip 체력 : "+d.hitPoint);
		s.repair(d); //수송선 수리
		
		System.out.println("Marine 총알 맞음");
		m.hitPoint-= 30;
		System.out.println("Marine 체력 : "+m.hitPoint);
		//s.repair(m); //마린수리
		System.out.println("Marine 체력 : "+m.hitPoint);
	
	}// MAIN

}// CLASS
