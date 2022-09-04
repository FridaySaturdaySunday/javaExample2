package test.getClass;

import java.lang.reflect.Field;

import test.clone.Point;

public class GetClassEx {

	public void testGetClass() {
		
		// getClass() : Object의 runtime class를 반환
		// JVM에 로딩되어 있는 클래스의 정보를 반환해줌
		
		Point point = new Point(10, 20);
		
		Class cls = point.getClass();
		
		System.out.println("getName() : " + cls.getName()); // 객체의 클래스 이름
		System.out.println("getSuperclass() : " + cls.getSuperclass()); // 상위클래스 이름
		
		Field[] fields = cls.getDeclaredFields();
		for (Field f : fields) {
			System.out.println("Field : " + f);
		}
	}

}
