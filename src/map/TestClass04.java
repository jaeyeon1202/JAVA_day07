package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestClass04 {

	public static void main(String[] args) {
		
		//순서를 유지하기 싶다면??? -> LinkedHashMap
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		
		//HashMap<String, Integer> map = new HashMap<>(); //순서를 유지하지 않는다.
		//HashSet<String> set = new HashSet<>();
		
		//map.put() -> 데이터를 저장
		map.put("선풍기", 100);
		map.put("자동차", 200);
		map.put("에어컨", 300);
		
		System.out.println(map);
		
		//Set<String> set = map.keySet();
		//Iterator<String> it = set.iterator();
		//위의 것을 한줄에 표현하면
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
	}

}
