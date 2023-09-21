package p0921;

import java.util.ArrayList;

public class J0921_06 {

	public static void main(String[] args) {

		
		//white 5/  red 4/ black 5/ gray 5/ blue4
		
		ArrayList list = new ArrayList();		
		
		list.add(new Car("White",5));
		list.add(new Car("Red",4));
		list.add(new Car("Black",5));
		list.add(new Car("Gray",5));
		list.add(new Car("Blue",4));
		
		for(int i = 0 ; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		
	}//MAIN

}//CLASS
