package p0919;

import java.io.File;
import java.io.IOException;

public class J0919_05 {
	public static void main(String[] args) {

		File f = new File("c:/aaa/a.txt");

		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("입출력 에러입니다");
			} catch (ArithmeticException e2) {
				e2.printStackTrace();
				System.out.println("숫자 부분에 에러가 난듯 합니다.");
			} catch (ArrayIndexOutOfBoundsException e3) {
				e3.printStackTrace();
			} catch (Exception e4) { //예외의 최고조상 어떤 예외가 되어도 여길 거친다.
				e4.printStackTrace();
			} finally {
				System.out.println("finally :예외가 발생이 되어도, 예외가 발생이 되지 않아도 무조건 실행됨");
			}
			
		}
	}// MAIN

}// CLASS
