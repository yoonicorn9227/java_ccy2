package p0912;

public class StuScore {
	StuScore() {}

	StuScore(int stuNo, String name, int kor, int eng, int math) {
		this.stuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total / 3.0;
	}//class (StuScore)

	int stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

}// CLASS
