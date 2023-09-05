package p0904;

import java.util.Scanner;

public class JA0904_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("---[Math.random();] | 난수값 명령어---");
		//Math.random(); 난수 만들기 |무작위 번호 생성 | (0.0<=Math.random();<1.0
		//										|0.0<=Math.random();<0.9999999999
		
		double temp = Math.random(); //round()-반올림, ceil()-올림, floor()-버림.
		//1부터 10까지 숫자를 무작위로 뽑고 싶을때 | int사용
		int num = (int)(Math.random()*10)+1;
		//1부터 100까지의 랜덤 정수값 구하기
		int num2 = (int)(Math.random()*100)+1;
		//0부터 9까지 랜덤 정수값
		int num3 = (int)(Math.random()*10);
		//1부터 50까지 랜덤 정수값
		int num4 = (int)(Math.random()*50)+1;
		//1부터 45까지 랜덤 정수값
		int num5 = (int)(Math.random()*45)+1;
		// 0부터 9999까지 랜덤 정수값
		int num6 = (int)(Math.random()*10000);
		//1부터 20까지
		int num7=(int)(Math.random()*20)+1;
		
		
		System.out.println("난수값 : " + temp);
		System.out.println("랜덤 정수값 : "+ num);
		
		
		
		
		
		
	}// main

}// class
