package oop.sample;

public class Person { // VO(value object) 형태의 클래스 (MVC 중 Model)

	private String name; // 필드
	private int age;
	private char gender;

	public Person () {}; // 생성자

	public Person (String name, int age, char gender) { // 생성자
			this.name = name;
			this.age = age;
			this.gender = gender;
		}

	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	// 게터세터 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
