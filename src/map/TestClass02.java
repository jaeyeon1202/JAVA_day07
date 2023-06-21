package map;

import java.util.HashMap;
import java.util.Iterator;

public class TestClass02 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		//<>이 안에 들어가는건 클래스 자료형만 가능
		//아직은 클래스자료형은 안배움
		//대문자라고 보자 일단
		
		map.put("num", 100);
		map.put("age", 25);
		
		System.out.println(map.get("age"));
		
		int num=map.get("age");
		System.out.println("num: "+num);
		System.out.println("map.get(num): "+ map.get("num"));
		
		System.out.println(map.containsKey("age"));
		System.out.println(map.containsValue(35));
		
		map.put("age", 10); //key중복 안됨
		System.out.println("map: "+map);
		
		map.remove("age");
		System.out.println("remove: "+map);
	}

}
