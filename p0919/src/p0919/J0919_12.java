package p0919;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class J0919_12 {

	public static void main(String[] args) {
//outputStream 저장
		try {
			OutputStream os = new FileOutputStream("c:/aaa/4.txt");
			String str = "Hello, World!!! 으아아아앙 너무어려워! 집에가고싶어 123454";
			byte[] bytes = str.getBytes(); // getBytes() : 문자열을 byte단위로 분리
			for (byte b : bytes) {
				os.write(b);// 저장
			} // for

			os.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("파일을 저장합니다!");

	}// MAIN

}// CLASS
