package p0907;

public class J0907_08 {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5 };

		String str = "123";
		String str2 = "100";

		int no = Integer.parseInt(str);
		int no2 = Integer.parseInt(str2);

		System.out.println("문자열 더하기 : " + (str + str2));
		System.out.println("정수 더하기 : " + (no + no2));
		
		String s = no+"";
		
		int k = 1;
		k = k+1; //정수형 n 에 1을 더해서 n방에 2를 입력 | 100번 반복해도 1개의 방만 만들어짐

		s=s+"안녕"; //100번 반복하면 100개의 방이 만들어짐.
		
		
		// 기본 for문 for(초기식; 조건식 증감식)
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + "번째 방 : " + num[i]);
		}

		// 단순 for문 (배열일때만 해당)
		int n = 0;
		for (int i : num) {
			System.out.println(n + " 번째 방 : " + i);
			n++;
		} // for(단순 for문)

	}// main

}// class
