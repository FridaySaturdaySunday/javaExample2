package oop.sample;

public class Point {

	private int posX; // 필드
	private int posY;
	
	// 1. 디폴트 생성자
	public Point() {
		this(10, 20); // this() 쓰면 바로 2번 생성자로 진입 (첫 줄에 써야함)
	}
	
	// 2. 매개변수가 있는 생성자
	public Point(int posX, int posY) {
		// super(); // JVM이 실행하면서 자동 추가해줌 (첫 줄에 써야함)
		this.posX = posX;
		this.posY = posY;
		// return; // JVM이 실행하면서 자동 추가해줌
	}
		
	@Override // alt shift s -> toString() // 출력하는메소드
	public String toString() {
		return "Point [posX=" + posX + ", posY=" + posY + "]";
	}
	
	// 게터세터 메소드
	public int getPosX() {
		return posX;
	}
	
	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	public int getPosY() {
		return posY;
	}
	
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	// 메소드
	public void out() {
		System.out.println("["+posX+", "+posY+"]");
	}
}
