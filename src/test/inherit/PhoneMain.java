package test.inherit;

import inherit.sample.GPhone;
import inherit.sample.IPhone;

public class PhoneMain {

	public static void main(String[] args) {

		IPhone iphone = new IPhone("7","010-xxxx-xxxx",32);
		GPhone gphone = new GPhone("Vega","010-yyyy-yyyy");
		
		System.out.println(iphone.getModel()+", "+iphone.getNumber()+", "+iphone.getMemorySize());
		System.out.println(gphone.getModel()+", "+gphone.getNumber()+", "+gphone.getOs());
		System.out.println(gphone);
	}

}
