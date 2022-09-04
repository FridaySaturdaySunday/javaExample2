package test.vo;

public class Student {

	// Comparator를 이용하여 Student 객체의 총점을 비교하는 예제
	
	private String name;
	private int kor;
	private int eng;

	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public int getSum() {
		return kor + eng;
	}

	public String getName() { 
		return name; 
	}
	
}
