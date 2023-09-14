package p0913_02;

public class Audio extends Product {

	String speakerPower;

	Audio()	{
		this("브릿지스피커7800",200000,2000,"15W");
	}
	Audio(String pName, int price, int bonusPoint, String speakerPower){
		this.bonusPoint = bonusPoint;
		this.pName=pName;
		this.speakerPower = speakerPower;
		this.price=price;
	}
	
}//CLASS
