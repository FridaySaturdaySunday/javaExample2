package test.poly;

public class TestPolyArgument {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		b.buy(new Chair());
		b.buy(new Desk());
	}
}

class Buyer {
	private int money = 500;
	
	public void buy(Furniture f) {
//	Furniture f = new Chair(); // => 이런 과정이 생략된것. 업캐스팅
//	Furniture f = new Desk();
		
		// 구매 못하는 케이스 -> 어떤 기능을 할 수 없는 예외케이스에 return사용
		if (money < f.getPrice()) {
			System.out.println("잔액부족!");
			return; // 해당 메소드 종료
		}
		
		// 구매하는 케이스
		money -= f.getPrice();
		
		System.out.println(f.toString()+"구매성공! 잔액: "+money+"만원");
		
		if(f instanceof Chair) {
			((Chair)f).seatChair(); // 다운캐스팅
		}
	}
}

class Furniture {
	
	public int price; // 제품가격

	// 가구 생성은 가격이 있어야 생성 가능
	public Furniture(int price) { // 생성자
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}

class Chair extends Furniture {

	public Chair() {
		super(100); // 부모 클래스의 생성자 호출
	}

	@Override
	public String toString() {
		return "Chair";
	}
	
	public void seatChair() {
		System.out.println("앉아보셨나요? 편안한가요?");
	}
}

class Desk extends Furniture {
	
	public Desk() {
		super(200); // 부모 클래스의 생성자 호출
	}
	
	@Override
	public String toString() {
		return "Desk";
	}
}










