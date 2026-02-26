package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		int num = 0;
		
		
		try {
			System.out.println(arr[3] / num);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스범위 벗어남");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("0으로 나눌 수 없음");
		}
		finally {
			System.out.println("예외가 발생하든, 발생하지 않든 무조건 실행하는 코드");
		}
	
	}
	
}
