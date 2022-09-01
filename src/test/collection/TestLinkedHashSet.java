package test.collection;

import java.util.*;

public class TestLinkedHashSet {
	
	public void testLinkedHashSet() {
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("Java");
		set.add("Oracle");
		set.add("JDBC");
		set.add("HTML5");
		
		for(String text : set) { // set인스턴스에서 String타입의 text 한 개씩 순서대로 출력
			System.out.println(text);
		}
		
		
	}

}
