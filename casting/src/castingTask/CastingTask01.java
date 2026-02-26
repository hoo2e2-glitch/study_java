package castingTask;

public class CastingTask01 {
	public static void main(String[] args) {
//      6.37, 3.99, 3
//      3개의 값을 연산하여 3을 만들기
//      단 모두 한 번씩 사용해야한다.
//		변수에 담아서 사용하기
		
		System.out.println((int)-(6.37 - 3.99) * 3);
		System.out.println((int)6.37 - (int)3.99 * 3);
		System.out.println((int)(6.37 + 3.99) / 3);
		
//      6.37, 3.99, 3
      double num1 = 6.37, num2 = 3.99;
      int num3 = 3, numResult = 0;
      String result = "(int)(%.2f + %.2f) / %d = %d";
      
      numResult = (int)(num1 + num2) / num3;
      System.out.printf(result, num1, num2, num3, numResult);
		
	}
}
