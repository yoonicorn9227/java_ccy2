package p0831;

public class JA0831_13 {

	public static void main(String[] args) {
		int a = 1;
		a++; // 2
		a++; // 3
		a++; // 4
		a++; // 5
		a++; // 6
		a++; // 7
		a++; // 8
		a++; // 9
		a++; // 10
		// System.out.println(a);

		int b = 10;
		int c = 10;
		b--; // 9
		b--; // 8
		--b; // 7
		--b; // 6
		--b; // 5

		c = b--; // c:5 b:4 | b가 5인값에서 c에 넣어주면 c값은 1 그리고 난 다음 1빼주고 난 b값이 4

		b--;
		c = b;
		// System.out.println(b);
		// System.out.println(c);

		boolean power = true;
		System.out.println(power); // true 최초 true 값 출력
		power = !power; // true 반대 이므로 false
		System.out.println(!power); // false
		power = !power;
		System.out.println(power); // true
		// System.out.println(!power);

		char ch = 'A'; // 65
		char ch2 = 'a'; // 97
		System.out.println(ch + ch2); // 65+97=162
		System.out.printf("%c,%c \n",ch,ch2);
	}

}
