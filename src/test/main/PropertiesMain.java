package test.main;

import test.map.Student;
import test.map.StudentManager;

public class PropertiesMain { // Properties : Hashtable의 하위 클래스로, 키와 값을 String 타입으로 제한

	public static void main(String[] args) {

		StudentManager stm = new StudentManager();
		
		// properties 데이터 삽입
		stm.propertyInsert(new Student("1","홍길동",80));
		stm.propertyInsert(new Student("2","김유신",60));
		stm.propertyInsert(new Student("3","신사임당",95));
	
		// properties 데이터 저장
		stm.propertyStore();
		
		// properties 데이터 입출력
		stm.propertyPrint();
	
	}

}
