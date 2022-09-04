package test.random;

import java.util.Random;

public class RandomEx {

//	자바에서 난수를 발생시키는 방법
//	방법 1. Math.random() 메소드 : 객체를 생성하지 않고 쉽게 사용할 수 있지만, double형의 난수만 발생 가능
//	방법 2. Random 클래스 : 객체를 생성해야하는 불편함 있지만, int, long, float, double, boolean형의 난수 발생 가능

	public void testRandom() {
		
		Random r = new Random();
		
		System.out.println("nextInt() : " + r.nextInt()); // -2^31 ~ 2^31-1 사이의 난수
		System.out.println("nextInt(100) : " + r.nextInt(100)); // 0~100 사이의 난수
		System.out.println("nextBoolean() : " + r.nextBoolean()); // true 또는 false
		System.out.println("nextDouble() : " + r.nextDouble()); // double형 표현범위의 난수
		System.out.println("nextFloat() : " + r.nextFloat()); // float형 표현범위의 난수
	}
}
