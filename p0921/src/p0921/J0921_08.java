package p0921;

import java.util.HashMap;
import java.util.Iterator;

public class J0921_08 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap();
		map.put("id", "aaa");
		map.put("page", "11");
		map.put("count", "105");
		
		System.out.println("id : "+map.get("id"));
		System.out.println("총 개수 : "+map.get("count"));
		System.out.println("현재 페이지수 : "+map.get("page"));
		
		
		
		
		//Iterator를 사용해서 전체출력
//		Iterator it = map.entrySet().iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
		
		
		
		
		
	}//MAIN

}//CLASS
