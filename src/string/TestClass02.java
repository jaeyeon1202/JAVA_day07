package string;

public class TestClass02 {

	public static void main(String[] args) {
		String str = "test";
		System.out.println(str);
		System.out.println(str.charAt(1)); // e반환
		//.charAt():괄호안에 숫자를 넣어주면 그 숫자 번째의 문자를 반환
		System.out.println(str.charAt(3)); //s
		
		char ch = str.charAt(1); //test의 1번째 문자를 ch에 저장 후
		System.out.println(ch); //ch 출력
		
		System.out.println(ch == 'r'); //false
		//문자 하나는 이퀄스 안쓰고 == + ''으로 비교
		
		
	}

}
