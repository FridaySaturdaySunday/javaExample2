package inherit.sample;

public class Child extends Parent{

	public Child () {
		super();
	}
	
	public void out() {
		System.out.println("자식 클래스 메소드");
	}
	
	public void display() {
		System.out.println("상속받아 정의한 메소드");
	}
}
