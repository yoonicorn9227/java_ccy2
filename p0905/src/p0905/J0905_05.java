package p0905;

public class J0905_05 {

	public static void main(String[] args) {
		//구구단 출력
		int i = 0;
		int j =0;
		
		//[제목]
		for(i=2; i<=9;i++) {
			System.out.printf("[ %d 단 ] \t",i);
		}//for-1 <제목>
		System.out.println();
		
		
		for( i=1; i<=9; i++) {
			//System.out.printf("[%d 단]\n", i);
			for(j=2; j<=9; j++) {
				//System.out.print(i+ " * " +j+ " = "+(i*j)+"  ");
				System.out.printf("%d * %d = %d \t", j, i, (i*j));
			} //for -2
			System.out.println();
		}//for-1

		
		
		
	}//main

}//class
