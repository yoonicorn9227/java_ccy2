package p0920;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class J0920_IOFile {

	public static void main(String[] args) {

		File f = new File("c:/ddd");
		if (!f.exists()) {
			f.mkdir();
		}

		try {
			FileInputStream fis = new FileInputStream("c:/aaa/ko1.jpg");
			FileOutputStream fos = new FileOutputStream("c:/ddd/ko2.jpg");
			while (true) {
				int read = fis.read();// byte 단위로 파일을 읽어옴
				if (read == -1) {
					break;
				}
				fos.write(read); // 파일저장
			}

			fis.close();
			fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("파일을 읽어와서 파일을 저장!");

		
	}// MAIN

}// CLASS
