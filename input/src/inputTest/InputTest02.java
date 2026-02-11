package inputTest;

import java.util.Scanner;

public class InputTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String messeage = "정수 또는 실수를 입력하세요.";
		
		System.out.println(messeage);
//		System.out.println(sc.nextInt());
		System.out.println(sc.nextDouble());
		
	}
}
