package p0912;

public class StuScore3 {
//J0912_04
	StuScore3() {}
	
	StuScore3(int stuNo, String name, int kor, int eng, int math) {
		super();
		this.stuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
}// CLASS
