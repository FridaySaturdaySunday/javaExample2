package oop.sample.vo;

public class Person {
	
	private String name; // 필드
	private int age;
	private char gender;
	
	public Person () {}; // 생성자
	 
	public Person (String name, int age, char gender) { // 생성자
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void display () { // 메소드
		System.out.println(name+", "+""+age+"세, "+gender+"자");
	}

}
