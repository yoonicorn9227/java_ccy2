package p0914;

public class J0914_03 {

	public static void main(String[] args) {

		Car c;
		FireEngine f1 = new FireEngine();
		System.out.println("[f1 기능]");
		f1.go();
		f1.stop();
		f1.water();
//------------------------------------------------------------------------------------
		c = f1; // FireEngine Car형 변환 생략가능 c=(Car)f1
//		Ambulance a1 = new Ambulance();
//		c=a1; //Ambulance Car형변환
		
		System.out.println("[c기능]");
		c.go();
		c.stop();
		// ▼ 에러발생 | c에는 water라는 공간은 있지만, c참조변수는 water() 사용할수 있음
		//c.water(); 
//------------------------------------------------------------------------------------
		System.out.println("[f2 기능]");
		FireEngine f2; // 주소값만 가진다. (공간은 없음)
		
//		Ambulance a2;
//		if( c instanceof FireEngine) {
//			f2 = (FireEngine)c;
//			f2.go();
//			f2.stop();
//			f2.water();
//		}
//		if( c instanceof Ambulance) {
//			System.out.println("[a2 기능]");
//			a2 = (Ambulance)c;
//			a2.go();
//			a2.stop();
//			a2.siren();
//		}
//		a2=(Ambulance)c;
		
		f2 = (FireEngine) c; // FireEngine \형변환 생략불가!!!
		f2.go();
		f2.stop();
		f2.water();

	}// MAIN

}// CLASS
