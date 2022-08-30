package oop.test;

import oop.sample.Person;

public class TestArray {
	public static void main(String[] args) {

		Person[] list = new Person[4]; // 4명을 보관할 수 있는 객체배열 선언
		
		list[0] = new Person("김개똥", 19, '남');
		list[1] = new Person("김말똥", 20, '남');
		list[2] = new Person("김소똥", 22, '여');
		list[3] = new Person();
		
		// 각 객체의 멤버의 접근 이름출력
		for (int i=0; i<list.length; i++) {
			System.out.println(list[i].getName());
			System.out.println(list[i].toString());
			System.out.println(list[i]);
		}
		
	}

}
