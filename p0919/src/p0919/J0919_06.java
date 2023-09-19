package p0919;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class J0919_06 {

	public static void main(String[] args) throws Exception {//예외처리를 넘긴다(throws).

		File f = new File("C:/download/aaa.txt");
		if (!f.exists()) {
				f.createNewFile(); // 하드디스크에 저장
		
		} // if

		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter writer = new BufferedWriter(fw); // bufferedWriter 1줄씩 떼어오는것
			writer.write("안녕하세요 반갑습니다. 다음에 뵙겠습니다.\r\n두번째 줄입니다.\r\n");
			writer.close();
		} catch (IOException e) { //에러가 발생하면 실행됨
			e.printStackTrace();
		}

		System.out.println("파일이 생성되었습니다.");
	}// MAIN

}// CLASS
