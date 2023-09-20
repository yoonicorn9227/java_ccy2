package p0920;

public class Student {

	Student() {}
	
	//새로운 객체를 복사
	Student(Student s) {
		this.stuNum = s.getStuNum();
	}

	Student(int stuNum) {
		this.stuNum = stuNum;
	}

	private int stuNum;

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	@Override
	public boolean equals(Object obj) {
		Student s2 = (Student) obj;
		boolean temp = false;
		if (this.stuNum == s2.getStuNum()) {
			temp = true;
		}

		return temp;
	}

}// CLASS
