package p0831;

public class JA0831_14 {

	public static void main(String[] args) {

		int a = 1000000;
		int b = 2000000;
		long c = a * b; // int*int = int 이므로 오버플로우 되어서 -1454759936 나온다.
		System.out.println(c);

		System.out.println("--------------------------");

		int x = 1000000;
		int y = 2000000;
		long z = (long) x * y; // long * int = long, long * long = long
		System.out.println(z);

		System.out.println("--------------------------");

		long num = a * x / y;
		System.out.println(num);

		long num1 = (long) a * x / y;
		System.out.println(num1);

		System.out.println("--------------------------");

		long num2 = (long) a / x * y;
		System.out.println(num2);

		int i = 1;
		int j = 1;
		i = i + j; //i = 2
		// i+=j; 는 <i=i+j>의 축약표현
	}

}
