package test.generic;

import java.util.*;

import inherit.sample.Child;

public class TestGeneric {

	public static void main(String[] args) {

		GenericEx<Integer, Child, String> ex1 = new GenericEx<Integer, Child, String>();
		
		ex1.setObj(24);
		
		int a1 = ex1.getObj(); // get : 값을 가져오기만 함(출력X)
		
		ex1.aaa(new Child());
		
		// 방법1
		ex1.out('2','c','한'); // 범용자료형 M이 Character형으로 바뀜
		
		// 방법2
		Character[] arr = ex1.out('한','c','2'); // 출력O (sysout 있으니까)
		
		// 방법3
		System.out.println("=== out으로부터 전달받은 자료 ===");
		for(Character c : arr) {
			System.out.println(c); // 정렬된게 출력됨
		}
		
		
		
		List<String> list1 = new ArrayList<String>();
		list1.add("abc");
		
		String str = list1.get(0); // get : 값을 가져오기만 함(출력X)
		
		// enhanced for
		for(String i : list1) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
