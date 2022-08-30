package inherit.sample;

public class Phone {
	
	// 필드
	private String model; 
	private String number;
	
	// 생성자
	public Phone() {}
	
	public Phone(String model, String number) {
		super();
		this.model = model;
		this.number = number;
	}

	// 게터세터 메소드
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
