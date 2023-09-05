package p0905;

public class J0905_09 {

	public static void main(String[] args) {
		int i = -0;
		int sum = 0;
//////////////////////////////////////////////////////////////////////////		
//		while(true) { //무한반복 [while(true)]
//			if(sum>200) {
//				break;
//			}
//			i++;
//			sum = sum + 1;
//		} //while
//		System.out.println("i : " +i);
//		System.out.println("sum : " + sum);
		
//////////////////////////////////////////////////////////////////////////		
		sum=0;
		for(i=1; i<=100;i++) {
			sum = sum +1;
			if(sum>100) {
				break;
			}//if
			
		}//for
		System.out.println("i2 : " +i);
		System.out.println("sum : " + sum);
		
		
//////////////////////////////////////////////////////////////////////////////		
		
		
//		do { // 한번은 실행된다. while의 조건이 안맞아도
//			System.out.println(i);
//		} while(i>0);

/////////////////////////////////////////////////////////////////////		
//		while(i>0 ) {
//			System.out.println(i);
//			i--;
//		
//		}//while
///////////////////////////////////////////////////////////////////////	
	
	}//main

}//class
