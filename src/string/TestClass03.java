package string;

import java.util.Scanner;

public class TestClass03 {

	public static void main(String[] args) {
		
		String str = "test";
		//System.out.print("문자열 입력: ");
		String str2 = "test   ";
				//new Scanner(System.in).nextLine();
		
		System.out.println(str);
		System.out.println(str2);
		
		System.out.println("str==str2 : "+str.equals(str2));
		
		//트림: 양쪽의 공백을 없애준다.
		System.out.println(str+".");
		System.out.println(str2+".");
		System.out.println(str2.trim()+".");
		
		System.out.println("str == str2 : "+str.equals(str2.trim()));
		//str2의 공백을 지우고 str과 비교
//========================================================================
		//스풀릿
		String addr = "05733/서울시 송파구/마천동";
		String[] s_addr = addr.split("/");//이 문자열을 어떤 기준으로 자를거냐
		//공백: 공백의 기준으로 자른다\
		for(int i=0; i<s_addr.length;i++) {
			System.out.println(s_addr[i]);
		}//공백을 기준으로 잘라서 배열에 저장
		
		//보통 슬러시'/'를 구분자로 많이 쓴다 -> 05733/서울시 송파구/마천동
		//for(String ss : s_addr) {
		//	System.out.println(ss);
		//}
		
		//========================================
		//replace 리플레이스: 원래 있던값을 새로운 값으로 바꾸기
		String result = addr.replace("마천동", "오금동");
		System.out.println(result);
		
		result = "010-4586-2667";
		System.out.println(result);
		String re = result.replace("4586", "7161");
		System.out.println(re);
		
		
	}

}
