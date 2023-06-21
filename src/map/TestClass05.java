package map;

public class TestClass05 {

	public static void main(String[] args) {
		
		float f1 = (float)1.11;
		int num = 100;
		
		//숫자를 문자열로 변경하고 싶으면 +"" 을 해준다!
		//String sNum= num; 
		String sNum= num+"";
		System.out.println(sNum+100); //이어써지기
		System.out.println(num+100); //숫자연산
		
		//문자열을 숫자로 변화하는법 
		//int n = sNum; //숫자 형식의 문자열만 가능하다 ->ex) "100"가능, "안녕"불가능
		int n= Integer.parseInt(sNum); //integer.parseInt()를 사용하면 문자열을 숫자로 바꿀 수 있다.
		System.out.println(n+123); //100+123=223
		

	}

}
