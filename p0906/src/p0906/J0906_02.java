package p0906;

public class J0906_02 {

	public static void main(String[] args) {

		// 배열 1~100까지 생성하고, 1~100까지 숫자를 입력해서 출력하시오.
		// arrNum

		int[] arrNum = new int[100];

		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = i + 1;
		}
		
		for (int i = 0; i < arrNum.length; i++) {
		//	if(i==0)
			System.out.println(arrNum[i]);
			System.out.println(", "+arrNum[i]);
		}
		System.out.println("입력된 숫자: ");
		
		
	}// main
}// class
