package castingTask;

public class CastingTask02 {
	public static void main(String[] args) {
//      "8.43" + 2.59를 더해서 10이 나오도록 출력하기
		
		// 초기화
		double num1 = 0, num2 = 0;
		
		// "8.43" -> 8.43
		num1 =  Double.parseDouble(("8.43"));
		
		//
		num2 = (int)2.59;
		
		// 1.
		System.out.println((int)num1 + num2);
		
		// 2. result
		int result = 0, result2 = 0;
		result = (int)num1 + (int)num2;
		System.out.println(result);
		
		// 3. result2
		String result1 = "(int)%.2f + (int)%.2f = %d";
		result2 = (int)num1 + (int)num2;
		System.out.printf(result1, num1, num2, result2);
		
		
		
	}
	
		
}
