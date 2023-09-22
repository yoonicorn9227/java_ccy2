package p0922;

import java.util.ArrayList;
import java.util.HashMap;

public class J0922_03 {

	public static void main(String[] args) {

		int n1 = 1000;
		int n2 = 125;
		int a = 1;

		// n1, n2를 JAction cal()롭 보내서
		// 곱한 결과값을 리턴해서 출력

		JAction j = new JAction();// 객체선언
		// 1.매개변수 2개 -> 리턴 int타입 받음
//		int result = j.cal(n1, n2); // 매개변수로 값을 넘겨줄수 있음.
//		System.out.println("결과값 : " + result);

		System.out.println("--------------------------------");
		// 2.매개변수 2개 -> 리턴 배열타입으로 받기
//		int[]result = j.cal(n1, n2);
//		for(int i =0; i<result.length;i++) {
//			System.out.println(result[i]);
//		}//for
		System.out.println("--------------------------------");

		// 3.객체 /보낼때는 변수 받을떄는 객체
//		String color = "White";
//		int door= 5;
//		Car c = j.cal(color, door);//매개변수를 보냄
//		System.out.printf("[%s, %d]\n",c.getColor(),c.getDoor());

		System.out.println("--------------------------------");

		//4. 매개변수 2개(총 6개 데이터값) ->리턴 list 타입받음
//		String[] color = { "White", "Red", "Blue" };
//		int[] door = { 5, 4, 5 };
//		ArrayList<Car> list = j.cal(color, door);
//		for (int i = 0; i < list.size(); i++) {
//			Car c1 = list.get(i);
//			System.out.printf("[%s, %d]\n", c1.getColor(), c1.getDoor());
//		}//for

		//5. 매개변수 6개 -> 리턴은 map타입
		//**Car 데이터
		String[] color = { "White", "Red", "Blue" };
		int[] door = { 5, 4, 5 };

		//**StuScore 데이터
		String[] name = { "홍길동", "이순신", "유관순" };
		int[] kor = { 100, 90, 80 };
		int[] eng = { 90, 80, 70 };
		int[] math = { 80, 70, 60 };
		j.cal(color, door, name, kor, eng, math);

		//★HashMap사용
		HashMap<String, Object> map = j.cal(color, door, name, kor, eng, math);

		ArrayList<Car> list = (ArrayList<Car>) map.get("list");
		for (int i = 0; i < list.size(); i++) {
			Car c1 = list.get(i);
			System.out.printf("[%s, %d]\n", c1.getColor(), c1.getDoor());
		}//for (Car)

		ArrayList<StuScore> list2 = (ArrayList<StuScore>) map.get("list2");
		for (int i = 0; i < list2.size(); i++) {
			StuScore s1 = list2.get(i);
			System.out.printf("[%d, %s, %d, %d, %d, %d, %.2f, %d]\n", 
					s1.getStuNum(), s1.getName(), s1.getKor(),s1.getEng(), s1.getMath(), s1.getTotal(), s1.getAvg(), s1.getRank());
		}//for(StuScore)

	
		
		
	}// MAIN
}// CLASS
