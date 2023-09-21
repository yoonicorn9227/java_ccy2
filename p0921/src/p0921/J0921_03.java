package p0921;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.Format;
import java.util.ArrayList;
import java.util.Scanner;

public class J0921_03 {

	public static void main(String[] args) throws Exception {

		//이름 ,국어, 영어 수학 점수를 StuScore 객체에 담아, ArrayList 입력한 데이터를 저장하시오. 
		//파일 stu2.txt
		
		ArrayList<StuScore>list = new ArrayList();
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("이름을 입력하시오.");
			String name = scan.next();
			System.out.println("국어점수를 입력하세요.");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			int math = scan.nextInt();
			int total =kor+eng+math;
			double avg = total/3.0;
			int rank=0;
			
			//객체에 담기
			list.add(new StuScore(name,kor,eng,math));
			
			
			//포맷
			String data= String.format("%s, %d, %d, %d %d,%.2f, %d",name,kor,eng,math,total,avg,rank);
			
			
			//파일데이터 저장
			FileWriter fw = new FileWriter("c:/aaa/stu2.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(data);
			bw.close();
			System.out.println("입력한 데이터를 저장했습니다.");
			System.out.println();
		}//while
		
	}//MAIN

}//CLASS
