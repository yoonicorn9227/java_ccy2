package p0831;

public class JA0831_06 {

	public static void main(String[] args) {
		//9. 정수의 오버플로우 (Over Flow)
		int x =2147483647;
		int total=0;
		total = x+5; 
		
		System.out.println(total);//정수의 오버플로우
		int a =1000000;
		int b =1000000;
		long a1 =1000000L;
		long b1 =1000000L;
		System.out.println(a+b);
		System.out.println(a*b); //a*b가 21억이 넘어서 정수의 오버플로우 발생해서 -값으로 떨어진다. ->long타입으로 바꿔줘야한다.
		
		
		
	}

}
