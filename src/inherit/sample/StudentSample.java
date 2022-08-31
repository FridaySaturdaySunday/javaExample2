package inherit.sample;

import java.util.ArrayList;

import kh.java.common.Member;

public interface StudentSample {
	
	// 인터페이스 안의 변수는 묵시적으로 public static final
	public static final int MAX_COUNT = 100; 
	
	
	
	// 인터페이스 안에 생성자 생성 불가
	
	
	
	// 인터페이스 안의 메소드는 묵시적으로 public이며 abstract(생략) 
	public void aaa();
	
	public default void bbb() {
		System.out.println("interface 안에 bbb메소드를 default로 정의함 -> 재정의 필수 아님");
	}

	public static void ccc() {
		System.out.println("interface 안에 ccc메소드를 static으로 정의함");
	}
	
	// Member에 데이터를 넣어서 주면 DB에 저장하는 기능을 하고 DB에 저장 성공하면 1 반환, 실패하면 0 반환
	public int insert(Member member);
	
	// 회원들 정보를 DB에서 읽어서 전달해줌
//	2022.08.31 삭제함. public Member[] read();
	public ArrayList<Member> getMembers(); // 컬렉션 중 List
}
