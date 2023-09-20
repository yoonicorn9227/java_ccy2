package p0919;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class pratice0919_01 {  
public static void main(String[] args)throws Exception { 

		
		
		File f = new File("c:/ccc");
		if(!f.exists()) {
			f.mkdir();
		}
		
		FileInputStream fis = new FileInputStream("c:/aaa/nis1.jpg");
		FileOutputStream fos = new FileOutputStream("c:/ccc/nis1.jpg");
		FileInputStream fis2 = new FileInputStream("c:/aaa/cia2.jpg");
		FileOutputStream fos2 = new FileOutputStream("c:/ccc/cia2.jpg");
		
		while(true) {
			int read = fis.read();
			if(read==-1)break;
			fos.write(read);
			int read2 = fis2.read();
			if(read2==-1)break;
			fos2.write(read2);
		}//while

		System.out.println("파일일 복사 되었습니다!");
		fis.close();
		fos.close();
		
		
	}//MAIN

}//CLASS
