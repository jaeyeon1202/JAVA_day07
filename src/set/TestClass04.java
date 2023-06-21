package set;

import java.util.HashSet;
import java.util.Iterator;

public class TestClass04 {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();
		set.add("일"); set.add("이"); set.add("삼"); //순서가 없고, 인덱스가 없다
		System.out.println("set: "+set);
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		System.out.println(set.hashCode());
		System.out.println(set.contains("일"));
		

	}

}
