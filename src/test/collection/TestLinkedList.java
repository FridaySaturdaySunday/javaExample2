package test.collection;

import java.util.LinkedList;

public class TestLinkedList { // LinkedList : 양방향 포인터 구조로 데이터의 삽입, 삭제가 빈번할 경우 빠른 성능

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
