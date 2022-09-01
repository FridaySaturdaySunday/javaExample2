package test.map;

//import java.io.Serializable

public class Student implements java.io.Serializable{ // Properties : Hashtable의 하위 클래스로, 키와 값을 String 타입으로 제한

	private String no;
	private String name;
	private int score;
	
	public Student() {} // 생성자

	public Student(String no, String name, int score) {
		super();
		this.no = no;
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return no+", "+name+", "+score;
	}

	// 게터세터
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
