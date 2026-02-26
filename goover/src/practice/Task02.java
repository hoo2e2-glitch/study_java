package practice;

//## 💻 코드 작성 문제
//
//**다음 조건에 맞는 클래스와 메서드를 작성하시오.**

//Calculator 클래스를 만드세요.
class Calculator {
	int[] arr = null;
	
	public Calculator() {;}
	public Calculator(int[] arr) {
		this.arr = arr;
	}
	
	public int getTotalEven(int[] arr) {
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				total += arr[i];
			}
		}
		return total;
	}  
}


//
//조건:
//1. int 배열을 매개변수로 받아서
//   배열 안의 숫자 중 짝수만 골라
//   전부 더한 값을 반환하는 메서드 getTotalEven() 을 작성하시오.
//
//2. main에서 아래 배열로 메서드를 호출하고 결과를 출력하시오.
//   int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//예상 출력값: 30
//(2 + 4 + 6 + 8 + 10 = 30)

public class Task02 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		cal.getTotalEven(numbers);
		
		
		System.out.println(cal.getTotalEven(numbers));

		
	}

}
