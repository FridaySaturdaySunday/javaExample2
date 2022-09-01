package test.collection;

import java.util.TreeSet;

public class TestTreeSet { // TreeSet : 정렬기능이 추가되었고, 동일한 객체는 중복 저장하지 않음

	public void testTreeSet () {
		
		TreeSet<String> tset = new TreeSet<String>();
		
		tset.add("3.MyBatis");
		tset.add("1.Java");
		tset.add("5.HTML5");
		tset.add("4.Oracle");
		tset.add("2.JDBC");
		
		for(String text : tset) {  // tset인스턴스에서 String타입의 text 한 개씩 순서대로 출력
			System.out.println(text); // 번호 순서대로 자동 정렬되어 출력됨!
		}
		
	}
}
