package test.exception;

import exception.sample.ThrowEx;

public class ThrowExMain {

	public static void main(String[] args) throws NullPointerException {

		ThrowEx ex = new ThrowEx();
		ex.printStr(5);
	}

}
