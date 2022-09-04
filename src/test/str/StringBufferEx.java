package test.str;

public class StringBufferEx {
	
	public void testStringBuffer() {
		
		// String : 문자열을 변경할 때마다 새로운 객체를 생성
		// StringBuffer : 문자열 변경 시 새로운 객체를 생성하지 않고, 버퍼에 담겨있는 문자열을 바로 수정
		
		
		StringBuffer str1 = new StringBuffer();
		StringBuffer str2 = new StringBuffer(30);
		StringBuffer str3 = new StringBuffer("Java");
		
		str1.append("HI");
		str2.append("Hello");
		str3.insert(0, str2 + " ");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
