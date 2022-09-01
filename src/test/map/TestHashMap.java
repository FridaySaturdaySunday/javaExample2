package test.map;

import java.util.HashMap;
import java.util.Iterator;

public class TestHashMap { // HashMap : 키는 중복 저장을 허용하지 않으며, 값은 중복을 허용

	public void testMap() {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Apple");
		map.put(4, "Dandelion");
		map.put(3, "Corn");
		map.put(2, "BlackBerry");
		
		Iterator<Integer> iterKey = map.keySet().iterator(); // Map->Set 변환 후 iterator 획득
		
		while(iterKey.hasNext()) {
			int key = iterKey.next();
			System.out.println("key"+key+": "+map.get(key));
		}
	}
	
}
