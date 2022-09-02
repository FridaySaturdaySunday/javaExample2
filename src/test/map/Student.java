package test.map;

//import java.io.Serializable

public class Student implements java.io.Serializable{ // MVC 중 Model 역할 (vo)
	// 직렬화(Serialize)
	// : 자바 시스템 내부에서 사용되는 Object 또는 Data를 외부의 자바 시스템에서도 사용할 수 있도록 byte 형태로 데이터를 변환하는 기술.

	private static final long serialVersionUID = -5665441252652405264L;
	
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
