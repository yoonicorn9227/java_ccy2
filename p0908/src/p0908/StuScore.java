package p0908;

public class StuScore {

	
	//구조체
	int StuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	
	void total() { //합계 계산 메소드 | 클래스에서는 구조체, 구조체 + 함수까지 포함한다.
		total= kor+eng+math;
	}
	
	void avg() {//평균 계산 메소드
		avg=total/3.0;
	}
	
	
}//class
