package p0922;

import java.util.ArrayList;
import java.util.HashMap;

public class JAction {

	// 리턴타입 : int
//	int cal(int n1, int n2) {
//		int result = n1*n2;
//		return result;
//	}// cal

	// 리턴타입 : int배열
//	int[] cal(int n1, int n2) {
//		int[]result = new int[4];
//		 result[0] = n1+n2;
//		 result[1] = n1-n2;
//		 result[2] = n1*n2;
//		 result[3] = n1/n2;
//		return result; //리턴은 무조건 한개만 보낼수 있음
	// 여러개 결과값 보낼떄 배열을 쓴다
//	}// cal

	// 3. 리턴타입 : 객체
//	Car cal(String color, int door) {
//		Car c = new Car(color,5);
//		return c;
//	}//Car

//	ArrayList<Car> list = new ArrayList();
//	//4. 리턴타입 : list 컬력션프레임 웍
//	ArrayList<Car> cal(String[] color, int[] door) {
//	list.add(new Car(color[0],door[0])); //객체생성하자 마자 list에 담는다
//	list.add(new Car(color[1],door[1]));
//	list.add(new Car(color[2],door[2]));
//	return list; //형변환 안해주면 에러! Car -> ArrayList<Car>타입으로 변환
//}//Car

	ArrayList<Car> list = new ArrayList();
	ArrayList<StuScore> list2 = new ArrayList();
	HashMap<String, Object> map = new HashMap();

	// 5. 리턴타입 : map 컬렉션 프레임웍
	HashMap<String, Object> cal(String[] color, int[] door, String[] name, int[] kor, int[] eng, int[] math) {
		ArrayList<Car> list = new ArrayList();
		list.add(new Car(color[0], door[0])); // 객체생성하자 마자 list에 담는다
		list.add(new Car(color[1], door[1]));
		list.add(new Car(color[2], door[2]));

		ArrayList<StuScore> list2 = new ArrayList();
		list2.add(new StuScore(name[0], kor[0], eng[0], math[0]));
		list2.add(new StuScore(name[1], kor[1], eng[1], math[1]));
		list2.add(new StuScore(name[2], kor[2], eng[2], math[2]));

		map.put("list", list);
		map.put("list2", list2);
		return map; // 형변환 안해주면 에러! Car -> ArrayList<Car>타입으로 변환
	}

}// CLASS
