package exception.sample;

public class ThrowEx {

	String str = "d";
	
	public void printStr(int cnt) throws NullPointerException {
		if(str == null) {
			System.out.println("str이 null이다");
			throw new NullPointerException(); // 예외 던지기
		}
		for (int i=0; i<cnt; i++) { // cnt번만큼 반복하여 출력
			System.out.println(str);
		}
	}
}
