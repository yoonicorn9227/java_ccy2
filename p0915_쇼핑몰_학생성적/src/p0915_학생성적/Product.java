package p0915_학생성적;

public class Product {
String name;
	int price;
int bonusPoint;


public String toString()	{
	return String.format("이름 :[%s], 가격:[%,d원], 포인트:[%,dP],",name,price,bonusPoint);
}

}//Class
