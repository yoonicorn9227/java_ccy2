package p0919;

import java.io.File;
import java.io.IOException;

public class J0919_07 {
//1.MAIN 메소드
	public static void main(String[] args) {

		File f = createFile(""); // createFile메소드 호출

	}// MAIN
static File createFile(String fileName) {
	if(fileName==null||fileName==""){
		fileName = "c:/aaa/제목없음.txt";
	}
	
	
	File f = new File(fileName);

	try {
		f.createNewFile();
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println(fileName+"파일 생성이 되었습니다.");
	return f;
}
	
}// CLASS
