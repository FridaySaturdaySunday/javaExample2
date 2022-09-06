package test.exception;

import java.io.IOException;

public class TestThrows {

	public static void main(String[] args) {

		IOSample test = new IOSample();
		
		try {
			test.input();
			test.output();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) { // 얜 어디서 날수있는 오류?
			e.printStackTrace();
		}
	}

}
