package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestClass03 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("나이", "20");
		map.put("주소", "산골짜기");
		System.out.println("map: "+map);
		
		System.out.println(map.keySet()); //해당 키들만 꺼내오기:[이름,주소,나이]
		System.out.println(map.values()); //해당 값들만 꺼내오기: [홍길동, 산골짜기, 20]
		
		Set<String> set = map.keySet();//셋은 인덱스를 사용할수 없으니까
		System.out.println("set: "+set); //set: [이름, 주소,나이]
		
		Iterator<String> it = set.iterator();//반복자를 사용해서 꺼내온다
		
		//System.out.println(it.next());
		//System.out.println(it.next());
		//System.out.println(it.next());

		while(it.hasNext()) {
			String key = it.next(); //키 꺼내오기
			System.out.println(key+":"+map.get(key)); //map.get(key): 키를 사용해서 값 꺼내오기
		}
		
	}

}
