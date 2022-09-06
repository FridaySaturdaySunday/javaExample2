package exception.sample;

public class CheckEven {
	
	private int num;

	public void setNum(int num) {
		this.num = num;
	}

	public int printEven(int number) throws EvenException {
		this.num = number;
		if (num % 2 != 0) { // 홀수라면
			throw new EvenException(num);
		} else { // 짝수라면
			return num;
		}
	}
}
