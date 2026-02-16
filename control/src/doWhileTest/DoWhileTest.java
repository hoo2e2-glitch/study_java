package doWhileTest;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int choice = 0;
		String message = "1. 분실신고\n" + "2. 통신사 이동" + "3. 결제 수단 변경" + "0. 상담원연결"; 
	      do {
	          System.out.println(message);
	          choice = sc.nextInt();
	       } while(choice != 0);
	    }
	 }