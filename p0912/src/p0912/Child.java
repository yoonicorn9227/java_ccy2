package p0912;

public class Child extends Parent {
	int x = 20; //인스턴스 변수

	void method() {//인스턴스 메소드
		int x = 100;
		System.out.println("x : " + x); //지역변수가 있으면 지역변수 값 없으면 인스턴스 변수//Child의 인스턴스가 없으면 Parent 인스턴스 변수 가져온다.
		System.out.println("this.x : " + this.x);
		System.out.println("super.x : " + super.x);
	}
}//CLASS
