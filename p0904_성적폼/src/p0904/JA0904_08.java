package p0904;

public class JA0904_08 {

	public static void main(String[] args) {
		System.out.println("<[switch] 명령어>");
		int num = 6;
		switch (num) {
		case 1:	case 7 :
			System.out.println("SK");
			break;
		case 6 : 
		case 8 :
			System.out.println("KTF");
		case 9 : 
			System.out.println("LG");
			break;
		default:
			System.out.println("해당사항 없음");
			break;
		} //switch문
		
		
		//if 조건문과 switch문으로 비교
		if(num==1 || num==7) {
			System.out.println("SK");
		}else if(num==6||num==8){
			System.out.println("KTF");
		}else if(num==9) {
			System.out.println("LG");
		}else {
		System.out.println("해당사항 없음");
		}
		
	
		
		
		
		
		
		
	}//Main
	
}// Class
