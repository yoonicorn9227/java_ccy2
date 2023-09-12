package p0912;

public class Product {

	static int count=1000; // 클래스 변수 - 객체선언 없이 클래스명.변수명
	int serialNo; //인스턴스 변수
	String pName;
	int price;

	 {
		count++;
		serialNo = count;
	} //기본생성자 전에 먼저 생성된다. |<인스턴스 초기화 블럭> -> 객체생성후 사용
	
	
	Product(){//기본생성자
	}
	
	Product(String pName){
		this.pName = pName;
	}
	
	
	Product(String pName, int price){
		this.pName = pName;
		this.price = price;
	}
	
	
}//CLASS
