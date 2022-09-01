package test.collection;

import java.util.LinkedList;

public class TestLinkedList {

	public TestLinkedList() {} // 생성자
	
	public void testLinkedList() {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add("키위");		
		printList(list);	// [포도, 딸기, 복숭아, 키위]
		
		list.set(0, "오렌지");
		printList(list);	// [오렌지, 딸기, 복숭아, 키위]
		
		list.remove(1);		// [오렌지, 복숭아, 키위]
		list.remove("키위");	// [오렌지, 복숭아]
		printList(list);

	}
	
	
	public void printList(LinkedList<String> list) {
		// for문을 이용하여 출력
		int num = list.size();
		for(int i=0; i<num; i++) {
			String str = "["+list.get(i)+"]";
			System.out.println(str);
		}
		System.out.println();
	}
}
