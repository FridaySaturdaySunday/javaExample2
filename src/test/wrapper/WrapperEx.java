package test.wrapper;

public class WrapperEx {

	public void printWrapper(Object obj) {
		
//		Wrapper 클래스 : 자바의 기본형 데이터타입을 클래스화하기 위해 사용하는 클래스
//		기본형 데이터타입을 클래스화하면 Object 클래스의 자식 클래스가 되며 
//		데이터타입에 상관없이 Object클래스를 이용한 처리가 가능해진다
		
		
		System.out.println("데이터 : " + obj);
		System.out.println("데이터 클래스 : " + obj.getClass());
		}

}
