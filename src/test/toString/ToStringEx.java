package test.toString;

public class ToStringEx {

	// toString() : 객체를 원하는 형태로 반환시키고자 할 때 사용
	// 오버로딩해서 사용하지 않으면 클래스 이름과 16진수 hasCode를 반환
	// ex) test.toString.Point@65ae6ba4

	public void testToString() {
		
		Point point = new Point(10, 20);
		System.out.println(point);
		System.out.println(point.toString());
	}
}


class Point {
	
	int posX;
	int posY;

	public Point(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}

	@Override
	public String toString() { // toString 메소드 재정의
		return "point 객체 : (" + posX + ", " + posY + ")";
	}

}
