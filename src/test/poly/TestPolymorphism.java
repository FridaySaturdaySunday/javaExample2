package test.poly;

import poly.sample.*; // * : 전부 다

public class TestPolymorphism {

	public static void main(String[] args) {

		Child c = new Child();
		c.display();
		c.out();
		System.out.println();
		
		Parent p = new Child(); //p는 Parent만큼만 Child 객체에 접근 가능 
		p.display(); // Overriding 된 Parent 멤버이므로 접근 가능
//		p.out(); // 오류. Parent 타입으로 Child 멤버에 접근 불가
	}

}
