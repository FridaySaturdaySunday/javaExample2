package test.collection;

import java.util.*;

public class TestArrayList {

	private List<String> l = new ArrayList<String>();
	
	public void testArrayList() {
		l.add("Red");		// [Red]
		l.add("Orange");	// [Red,Orange]
		l.add(1, "Yellow");	// [Red,Yellow,Orange]
		printList();
		
		l.remove(2);		// [Red,Yellow]
		printList();
		
		l.clear();
		System.out.println("List가 비었나요?"+l.isEmpty()); //true
		
	}
	
	
	public void printList() {
		System.out.println(l);
	}
	
}
