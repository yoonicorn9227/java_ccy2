package p0905;

public class J0905_04 {

	public static void main(String[] args) {
		//n중 포문
//		int i=0;
//		int j =0;
//		for(i=2; i<=9; i++) {
//			System.out.printf("[  %d 단  ]\n",i);
//			for(j=1; j<=9; j++) {
		//System.out.println(i+" * "+j+" = "+(i*j));
		//System.out.print(" %d * %d = %d \n",);
		//	}//for-2
			//System.out.println("------------------------------");
		
		//}//for-1
		
//		int i = 0;
//		int j = 0;
//		for(i=2; i<9; i++) {
//			for(j=1; j<=9; j+=2) {
//				System.out.println(i+ " * " + (j+=2) + " = " + (i*j));				
//			}//for-2
//		}//for-1
		
		//3개
		
		for(int i =1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				for(int k=0; k<=9; k++) {
					System.out.println(""+i+j+k);
				}
			}
		}
		
		
		
	}//main

}//class
