package test.exception;

public class TestException1 {

	public static void main(String[] args) {

		int arr[] = new int[3];
		
		try {
			for (int i = 0; i < arr.length; i++)
				arr[i] = i;
			for (int i = 0; i <= arr.length; i++) // 여기서 오류 발생
				System.out.println(arr[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 : 사용불가 인덱스 접근");
			e.printStackTrace(); // System.out.println(e);
		} finally {
			System.out.println("반드시 수행하는 코드");
		}

	}

}
