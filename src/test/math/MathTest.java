package test.math;

public class MathTest {

	public void printMath() {
		
		System.out.println("abs(-10) : "+Math.abs(-10)); // -10의 절대값
		System.out.println("ceil(3.7) : "+Math.ceil(3.7)); // 3.7의 올림
		System.out.println("floor(3.7) : "+Math.floor(3.7)); // 3.7의 내림
		System.out.println("exp(3.3) : "+Math.exp(3.3)); // e^3.3 
		System.out.println("pow(2.1,2) : "+Math.pow(2.1, 2)); // 2.1^2
		System.out.println("random() : "+Math.random()); // 0.0 <=  < 10.0 사이의 난수
		}
}
