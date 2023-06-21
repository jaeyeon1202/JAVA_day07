package set;

import java.util.ArrayList;
import java.util.HashSet;

public class TestClass01 {

	public static void main(String[] args) {
		/*
		Set - HashSet
		- 순서를 유지하지 않는다.
		- index를 사용할 수 없다. 반복자를 사용한다.
		- 데이터에 대한 중복을 허용하지 않는다.
		- List 처리속도가 빠르다.
		*/

		HashSet<String> set = new HashSet<>();
		set.add("김밥"); set.add("라면");
		set.add("라면"); set.add("순대");
		
		System.out.println("set: "+set);
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("김밥"); arr.add("라면");
		arr.add("순대"); arr.add("라면");
		
		System.out.println("arr: "+arr);
		
	
		
		
		
	}

}
