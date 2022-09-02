package test.map;

import java.util.*;
import java.io.*;

public class StudentManager { // MVC 중 Controller 역할

	private ArrayList<Student> list = new ArrayList<Student>();
	private Properties prop = new Properties();
	
	public StudentManager() {} // 기본 생성자
	
	public void propertyInsert(Student st) { // Student의 객체 st 생성
		prop.setProperty(st.getNo(), st.toString()); // Student 정보를 받아서 prop에 저장
		System.out.println(st.getName()+" 학생의 데이터 삽입 성공!");
	}
	
	public void propertyStore() {
		try { 
			prop.store(new FileWriter(new File("prop.propeties")), "Ex_Student.properties"); // prop.store(파일명) : prop에서 꺼내서 File에 저장
			System.out.println("학생 데이터 저장 성공!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void propertyPrint() {
		try { 
			prop.load(new FileReader(new File("prop.propeties"))); // prop.load(파일명) : File에서 읽어서 prop에 로딩해줌
			
			
			System.out.println("====Set enhanced for 출력====");
			Set<Object> setkey = prop.keySet(); // Set으로 변환 -> iterator나 enhanced for 사용 가능
			for(Object key : setkey) { 
				System.out.printf("key:%s, value:%s\n", String.valueOf(key), prop.getProperty(String.valueOf(key)));
			}
			
			
			System.out.println("====고정 키 값으로 뿌림====");
			// Loop(i : 1~prop) - {
			// parseStudent(prop.get(i)) => 결과 모양을 list에 추가
			// list 모두 출력 sysout
			// }
			for(int i=1; i<=prop.size(); i++) { // 1~prop 크기만큼 반복
				String index = String.valueOf(i); // String.valueOf(i) : 숫자(i)를 문자열로 바꿔줌
				list.add(parseStudent(prop.getProperty(index))); // 키값(index)이 1~prop인 애를 꺼냄 -> 학생 객체로 변환(parseOO) -> list에 추가
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(Student s : list) {
			System.out.println(s);
			}
			System.out.println("학생 데이터 출력이 완료되었습니다.");
	}
	
	// prop.get(i)를 받아서 잘라서 new Student() 생성
	public Student parseStudent(String str) { // parseOO : 넘겨 받은 데이터를 학생 객체로 변환
		String tmp[] = str.split(", "); // ", " 단위로 쪼개서 tmp[]에 저장
		return new Student(tmp[0], tmp[1], Integer.parseInt(tmp[2]));
		}

	
	
	
	
	
	
	
	
	
}
