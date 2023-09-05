package p0901;

public class JA0901_05 {

	public static void main(String[] args) {
		System.out.println("----소숫점 3자리 이하 절삭----");

		double pi = 3.141592;
		double shortPi = (int) (pi * 1000) / 1000.0; // 또는 double shortPi = (int) (pi * 1000) / 1000f;
		System.out.println("pi : " + pi);
		System.out.println("shortPi : " + shortPi);

		System.out.println("----소숫점 4자리 이하 절삭----");
		double d = 123.15235678;
		double d2 = (int) (d * 10000) / 10000.0;
		System.out.println("d : " + d2);
		System.out.println("d2 : " + d2);

		System.out.println("----소숫점 2자리 이하 절삭----");
		double a = 2563.12121245;
		double a3 = (int) (a * 100) / 100.0;
		System.out.println("a :"+a);
		System.out.println("a3 :" +a3);

		System.out.println("-------------------------");
		
		System.out.println("----반올림----"); 
		//소숫점 첫째 자리에서 반올림, 올림, 내림, 결정
		//Math.round() : 반올림, Math.ceil() : 올림, Math.floor() : 버림
		double n = 12.598;
		double n2 =2.321;
		System.out.println(Math.round(n)); //Math.round() : 반올림 |소숫점 첫째자리 반올림
		System.out.println(Math.ceil(n2)); // Math.ceil() : 올 림 | 소숫점 첫쨰자리 올림
		System.out.println(Math.floor(n));// Math.floor() : 버림

		
		System.out.println("----소숫점 둘째자리 반올림----"); 
		//소숫점 둘째 자리 반올림
		//double n3 = (int)(n*100)/100.0;
		double n3 = Math.round(n*10)/10.0;
		System.out.println("둘쨰자리 반올림 : " +n3);
		
		System.out.println("----소숫점 넷째자리 반올림----"); //소숫점 넷째자리 반올림
		double x = 156.7854294;
		double x2 = Math.round(x*1000)/1000.0;
		System.out.println("소숫점 넷째자리 반올림 : "+x2);
		
		
	
		
		
	}

}
