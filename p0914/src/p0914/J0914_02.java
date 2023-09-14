package p0914;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class J0914_02 {

	public static void main(String[] args) {

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yy- MM- dd hh시 mm분 ss초");
		System.out.println(d);
		System.out.println(sdf.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));

		
		Calendar cal = Calendar.getInstance();//싱글콘 패턴
		//Calendar c = new Calendar(); //객체선언 -> 에러
		System.out.println(cal.getTime());
		System.out.println(sdf.format(cal.getTime()));
		
		
		
	}// MAIN

}// CLASS
