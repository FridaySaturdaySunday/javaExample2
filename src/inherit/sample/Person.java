package inherit.sample;

public abstract class Person { // 추상클래스

	private String name;
	
	public Person() {} // 기본 생성자
	
	public Person(String name) { // 오버로딩된 생성자
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void out(); // 추상메소드 -> {} 없고 ;로 끝남
}
