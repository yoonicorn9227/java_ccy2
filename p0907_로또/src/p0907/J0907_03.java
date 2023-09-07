package p0907;

import java.util.Arrays;

public class J0907_03 {

	public static void main(String[] args) {// TODO Auto-generated method stub	
		int[] num = {1,2,3,4,5};  //1,2,3,4,5
		int[] score = new int[5]; //0,0,0,0,0
		
		//score = num; //얕은복사, 주소복사 //num의 주소값을 score에 입력 (이렇게 복사하면 안됨)
		
		//1.배열복사 방법 - for문사용, 데이터값 전체를 따른 장소에 복사
		for(int i =0; i<num.length; i++) {
			score[i]=num[i];
		}
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		
		//2.배열복사 방법 - arraycopy메소드사용, 데이터값 전체를 다른 장소에 복사 <<<잘안쓴다>>
		// 1)원본배열 2)위치 3)복사대상배열 4)위치 5)복사갯수
		//System.arraycopy(num, 1, score, 0, 3);
	
		
		
		System.out.println(num);
		System.out.println(score);
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(score));
		
		
		
		
		
	}//main

}//class
