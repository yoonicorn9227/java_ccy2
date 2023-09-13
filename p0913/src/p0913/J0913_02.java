package p0913;

import java.text.SimpleDateFormat;
//import java.util.Arrays;
//import java.util.Calendar;
//import java.util.Scanner;
import java.util.*;

public class J0913_02 {

	public static void main(String[] args) {
		// import문
		java.util.Scanner scan = new Scanner(System.in); // java.until.생략

		int[] a = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(a)); // java.until.생략

		int[] b = { 1, 2, 3, 4, 5 };
		System.out.println(java.util.Arrays.toString(b)); // java.until.생략

		java.lang.System.out.println(); // java.lang. 생략가능

		java.lang.String str = new java.lang.String("a"); // java.lang. 패키지는 생략가능

		// 날짜 객체 ①
		java.util.Date today = new java.util.Date();

		// format설정 = yyyy/MM/dd
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(today);
		System.out.println(sdf.format(today));

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(sdf2.format(today));

		// 날짜 객체 ②
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdf3.format(cal.getTime()));

	}// MAIN

}// CLASS
