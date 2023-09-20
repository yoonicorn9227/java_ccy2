package p0920;

import java.util.ArrayList;

public class J0920_02 {

	public static void main(String[] args) {

		Student s1 = new Student(1001);
		System.out.println("s1 : "+s1);
		System.out.println("s1.getStuNum() : "+s1.getStuNum());
		Student s2 = new Student(1002);
		Student s3 = new Student(1003);
		Student s4 = new Student(1004);

		ArrayList <Student> list = new ArrayList();
		list.add(s1); // 값은 object에 저장됨으로 다른 클래스에서 쓸때는 형변환!
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		System.out.println(list.size()); //list 개수
		System.out.println("list s1 : "+(Student)list.get(0)); //형변환! why? : 값이 모두 object에 저장되어있으므로!
		//형변환 생략 하려면 ▶ 제너릭 ArrayList<Student> list = new ArrayList();
		System.out.println("s1.getStuNum() : "+list.get(0));
		
	}//MAIN

}//CLASS
