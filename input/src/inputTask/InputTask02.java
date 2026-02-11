package inputTask;

import java.util.Scanner;

public class InputTask02 {
	public static void main(String[] args) {
//      사용자가 입력한 정수 또는 실수의 값이
//      정수인지 실수인지 확인 후 출력하는 로직을 구현하세요.
//      출력 예시)
//      10 -> 정수
//      10.5 -> 실수
//      10.0 -> 실수
		
		Scanner sc = new Scanner(System.in);
		
		// 메세지
		String message = "출력 예시)\n10 -> 정수\n10.5 -> 실수\n10.0 -> 실수";
		System.out.println(message);
		
		// 초기화
		int num = 0;
		double num1 = 0.0;
		
		// 출력
		num = sc.nextInt();
		num1 = sc.nextDouble();
		
		System.out.println(num + " -> 정수");
		System.out.println(num1 + " -> 실수");
		
//		강사님 풀이
		
//		사용자가 입력한 정수 또는 실수의 값이
//		정수인지 실수인지 확인 후 출력하는 로직을 구현하세요.
//		출력 예시)
//		10 -> 정수
//		10.5 -> 실수
//		10.0 -> 실수
		Scanner sc = new Scanner(System.in);
		String value = null, message = "정수 또는 실수를 입력하세요.\nex)10.7",
				isFloatAndIntegerResult = "", result = "%s은(는) %s";
		
		System.out.println(message);
		value = sc.nextLine();
//		isFloatAndIntegerResult = value.contains(".") ? "실수" : "정수";
		System.out.printf(result, value, isFloatAndIntegerResult);
		
	}
}
