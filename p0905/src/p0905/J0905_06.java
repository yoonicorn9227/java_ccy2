package p0905;

public class J0905_06 {

	public static void main(String[] args) {

		//구구단
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d \n", i,j,i*j);
			} //for-2
		}//for-1
		
		//구구단 while문으로 만들기
		int a = 2;
		while(a<=9) {	
			int b = 1;
			while(b<=9) {
				b++;//증감식
			
			}//while-2
	
			a++; //증감식
		}//while-1
		
		
		
		
		
		
		//for문	
//		for(int i = 10; i<=10; i--) {
//			System.out.println(i);
//		}
		
		//while문
//		int i =10; //초기값
//		while(i>=10) { //조건식
//			System.out.println(i);
//			i--;//증감식
//		}
		
		
		//10출력 무한루프 | (주의) 초기값은  while문 안에 넣으면 안됨.
//		int i =0;
//		while(i>=10) {
//			i=10;
//			System.out.println(i);
//			i--;
//		}
	// 10 9 8 7.....0
//		int i = 10;
//		while(i<=10 && i>=0) {
//			System.out.println(i);
//			i--;
//		}
		
		
		
		
	}

}
