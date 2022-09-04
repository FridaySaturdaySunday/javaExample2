package test.controller;

import java.util.Comparator;

import test.vo.Student;

public class StuComparator implements Comparator<Student> {
	
	// Objects 클래스 : (Object 아님) 객체 비교, 해시코드 생성, null 여부, 객체 문자열 리턴 등의 연산
	
	// Comparator를 이용하여 Student 객체의 총점을 비교하는 예제
	// int compare(T a, T b, Comparator<T> c) : 두 객체 a와 b를 Comparator를 사용해 비교
	
	@Override // Comparator 인터페이스의 compare() 메소드를 재정의
	public int compare(Student o1, Student o2) {
		if (o1.getSum() > o2.getSum())
			return 1;
		else if (o1.getSum() < o2.getSum())
			return -1;
		else
			return 0;
	}

}
