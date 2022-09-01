package test.collection;

import java.util.*;

public class TestLinkedHashSet { //  LinkedHashSet : 해시 테이블에 데이터를 저장, 저장된 순서에 따라 순서가 결정된다.
	
	public void testLinkedHashSet() {
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("Java");
		set.add("Oracle");
		set.add("JDBC");
		set.add("HTML5");
		
		for(String text : set) { 	// set인스턴스에서 String타입의 text 한 개씩 순서대로 출력
			System.out.println(text); // HashSet 과 다르게 값이 들어간 순서대로 출력된다
		}
		
		
	}

}
