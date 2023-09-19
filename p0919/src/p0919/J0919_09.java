package p0919;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class J0919_09 {

	public static void main(String[] args) {

		InputStream is;
		//1. 1byte씩 읽어서 출력
		try {
			is = new FileInputStream("c:/aaa/1.txt");
			int read = 0 ;
			while((read=is.read())!=-1){
			System.out.print((char)read);	
			}
			
			
//			while (true) {
//				int read = is.read();
//				if (read < 0) {
//					break;
//				}
//				System.out.print((char) read);
//
//			} // while
		} catch (Exception e) {
			e.printStackTrace();
		}

		//2. 전체를 다 읽어와서 출력
//		try {
//			byte[]b = new byte[1024];
//			InputStream is = new FileInputStream("c:/aaa/1.txt");
//				is.read(b);
//				System.out.print(new String(b));  //2바이트로만 불러온다/
//		} catch (Exception e) {
//			e.printStackTrace();
//		}//try-catch

	}// MAIN

}// CLASS
