package oop.method.sample;

public class OverloadingSample {
	
	public void out() {
		System.out.println("out () 메소드 실행!");
	}
	
	public void out (int num) { // 메소드 이름 같고 매개변수 개수 다름 -> 오버로딩 성립
		System.out.println("out ("+num+") 메소드 실행!");
	}

}
