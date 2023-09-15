package p0915_test;

public class JMethod {

	JMethod() {
	}// new 사용할때만 사용

	// 인스턴스 메소드 ->참조변수명.변수명으로 사용
	int cal(int n1, int n2) { //void는 리턴이 없음 따라서 int 로변경
		// 입력받은 2개의 숫자를 4칙연산
		// 데이터를 매개변수로 넣고(J01)에서
		int result = n1 + n2;
		int result2 = n1 - n2;
		int result3 = n1 * n2;
		int result4 = n1 / n2;
		return result+result2+result3+result4; // -> J01에서 받을때는 return으로 보내야 한다.
		//그런데 1개밖에 보낼수 없음 / 해결방법 : 콜렉션!
	}//calculate

	int cal2(int a,int b, int c, int d) {
		int result = a+b+c+d;
		int result2 = a-b-c-d;
		int result3 = a*b*c*d;
		int result4 = a/b/c/d;
		//값을 돌려줘야 하기때문에 return을 사용해야 하지만 void는 return을 쓸 수 없으므로
		//void -> int로 변경
		return result+result2+result3+result4;
	}//calculate2
	
	int cal2(int[]n) {
		int result = n[0]+n[1]+n[2]+n[3];
		int result2 = n[0]*n[1]*n[2]*n[3];
	
		
		//값을 돌려줘야 하기때문에 return을 사용해야 하지만 void는 return을 쓸 수 없으므로
		//void -> int로 변경
		return result+result2;
	}//calculate2
	
	
	
	
}// CLASS
