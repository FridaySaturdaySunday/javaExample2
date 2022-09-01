package test.main;

import test.collection.TestArrayList;
import test.collection.TestLinkedHashSet;
import test.collection.TestLinkedList;
import test.collection.TestTreeSet;
import test.map.TestHashMap;

public class Main {

	public static void main(String[] args) {

		new TestArrayList().testArrayList();
		new TestLinkedList().testLinkedList();
		new TestLinkedHashSet().testLinkedHashSet();
		new TestTreeSet().testTreeSet();
		new TestHashMap().testMap();
	}

}
