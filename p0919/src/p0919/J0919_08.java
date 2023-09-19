package p0919;

import java.io.File;
import java.io.IOException;

public class J0919_08 {

	public static void main(String[] args) {
	//파일을 1개생성 - File객체는 폴더, 파일을 생성할 수 있음.
		//폴도생성
		File f = new File("c:/abc");
		f.mkdir();
		System.out.println("폴더가 생성되었습니다.");
		
		File fFile = new File("c:/abc/1.txt");
		
		//////try catch문/////////////////////////// 해주거나 아니면 throws Exception을 MAIN에 붙여준다
		try { //예외처리 : 만약에 이거하다가[fFile.createNewFile();] 에러나면 에러구문이 뭔지 알려주고 계속 실행시켜줘
			fFile.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("프로그램을 끝마칩니다.");
		}
		//////////////////////////////////////
		
		
		
	}// MAIN

}// CLASS
