package string;

public class TestClass01 {

	public static void main(String[] args) {
		String str;
		String str2 = new String(); //이렇게도 사용할 수 있다(위아래 둘다 가능)
		
		String str3 ="test";
		String str4 = new String("Java Programming");
		
		String s1 = str4.toUpperCase();//문자열을 전부 대문자로 변환(알파벳 영어만)
		System.out.println(s1);
		
		String s2 = str4.toLowerCase(); //소문자로 변환
		System.out.println(s2);
		//str4->str4의 데이터는 건드리지 않는다
		
		//수강하는 과목 저장: Java, java, JAVA
		str3= "Java";
		if(str3.toLowerCase().equals("java")) {
			System.out.println(str3.toLowerCase().equals("java"));
			System.out.println("수강과목은 자바군요");
		}

	}

}
