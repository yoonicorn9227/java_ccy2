package p0919;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class J0919_15 {

	public static void main(String[] args) throws Exception {
		// lee1, lee2 -> bbb폴더로 복사

		File f = new File("c:/bbb");
		if (!f.exists()) {
			f.mkdir();
		}

		FileInputStream fis = new FileInputStream("c:/aaa/lee1.jpg");
		FileInputStream fis2 = new FileInputStream("c:/aaa/lee2.jpg");
		FileOutputStream fos = new FileOutputStream("c:/bbb/lee1.jpg");
		FileOutputStream fos2 = new FileOutputStream("c:/bbb/lee2.jpg");

		while (true) {
			int read = fis.read();
			if (read == -1)
				break;
			fos.write(read);
			fos2.write(read);
		}
		System.out.println("파일이 복사 되었습니다.");
		fis.close();
		fos.close();
		fis2.close();
		fos2.close();

	}// MAIN

}// CLASS
