package inherit.test;

import inherit.sample.Person;
import inherit.sample.Professor;
import inherit.sample.Student;
import inherit.sample.StudentSample;

public class AbstractEx {

	public static void main(String[] args) {
		
		Student stu = new Student("홍길동","자바");
		Professor prof = new Professor("김춘추","컴퓨터과학");
		
		stu.out();
		prof.out();
		
		
		// 추상클래스 객체 생성
		Person p = new Person() {
			@Override
			public void out() {
				System.out.println("abstract 클래스로 생성되기도 하지요~ 이런식으로");
			}
		}; // 정의
		p.out(); // 호출
	
		
		
		StudentSample ss2 = new Student(); // 다형성
	
	}

}
