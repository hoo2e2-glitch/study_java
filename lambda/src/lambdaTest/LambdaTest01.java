package lambdaTest;

public class LambdaTest01 {
	public static void main(String[] args) {
//		Calc calc = (num1, num2) -> num1 + num2;
		Calc calc = (num1, num2) -> {return num1 + num2;};
		Calc2 calc2 = (num1, num2) -> num1 / (double)num2;
		
		calc2.divide(10, 3);
		System.out.println(calc2.divide(10, 3));
			
	}

}
