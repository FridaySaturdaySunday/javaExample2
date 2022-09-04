package test.equals;

public class EqualsEx {
	
	public void testEquals() {
		
		String str1 = new String("Apple");
		String str2 = new String("Apple");
		
		// 참조 타입 변수에 '==' 사용 시 참조하고 있는 대상이 같은지(주소값) 비교
		// -> 참조 타입 변수 비교시 .equals() 사용해야함
		System.out.println("str1==str2 : " + (str1 == str2)); // false
		System.out.println("str1.equals(str2) : " + str1.equals(str2)); // true
	}


}
