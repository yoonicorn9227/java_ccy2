package p0912;

public class Data2 {

	int value;

	Data2() {} // 기본생성자 항상 만들어주는 습관!

	Data2(int x) {// 매개변수가 있는 생성자가 있으므로 기본생성자 생성이 자동으로 안됨. | 따라서 기본생성자 만들어줄것!
		value = x;
	}

}// CLASS
