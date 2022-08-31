package inherit.sample;

import java.util.ArrayList;

import kh.java.common.Member;

public class Student extends Person implements StudentSample{ 	// 이런 extends, implements 쓰는 상황에
																// Student에 빨간밑줄 뜸 -> Add unimplemented methods

	private String subject;

	public Student() { // 디폴트 생성자
		super();
	}

	public Student(String subject) {
		super();
		this.subject = subject;
	}
	
	public Student(String name, String subject) {
		super(name);
		this.subject = subject;
	}
	
	@Override
	public void out() {
		System.out.println(getName()+"학생입니다");
		System.out.println(subject+"를 수강합니다");
	}

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		System.out.println("default로 정의된 bbb메소드를 재정의함");
	}
	
	@Override
	public int insert(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Member> getMembers() {
		// TODO Auto-generated method stub
		return null;
	}
}
