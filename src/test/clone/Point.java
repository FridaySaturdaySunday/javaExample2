package test.clone;

public class Point implements Cloneable {

	private int posX;
	private int posY;
	
	public Point(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	@Override // clone 메소드 재정의
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

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
	
	
}
