package arrayTask;

import java.util.Scanner;

public class ArrayTask05 {
	   public static void main(String[] args) {
//	      골드 ~ 플레티넘
//	      1. 비밀번호를 암호화해주는 로직을 완성하세요.
//	      입력예시)
//	      test123!@#
		  // 글자.숫자.특수문자
		   
//	      비밀번호 이외의 특수문자가 나올 수 있음.
//	      출력 예시)
//	      ???????
		   
		  Scanner sc = new Scanner(System.in);
		  
		  // 메세지, 초기화
		  String message = "비밀번호\nex)입력예시\ntest123!@#)", input = null;
		  System.out.println(message);
		  char[] result = null ;
		  
		  // 가져오기
		  input = sc.nextLine();
		  // pass = sc.nextLine();
		  result = new char[input.length()] ;
		  
		  // ??? 이거 출력
		  for(int i = 0; i < input.length(); i++) {
			  result[i] = '?';
		  }
		  
		  // 출력
		  for(int i = 0; i < result.length; i++) {
			  System.out.println(result[i]);
		  }
		  
				  
				  
	      
//	      2. 가장 많이 판매된 상품의 총 판매 수익과
//	      가장 적게 판매되 상품의 판매 수익의 차를 출력하세요.
//	      아메리카노 2000원, 카페라떼 3000원, 에이드 4000원, 밀크쉐이크 5000원
//		  Scanner sc = new Scanner(System.in);
		  
//		  String message = "수익차이";  
//		  System.out.println();
		  
	      String[] menus = {"아메리카노", "카페라떼", "에이드", "밀크쉐이크"};
	      
//	      orders의 정수는 menus의 주문 번호입니다.
	      int[] orders = {0, 1, 0, 1, 3, 1, 1, 2, 2, 0, 2, 3, 1, 2, 3, 0, 2, 2, 1, 1, 0};
	      
	      
	      
	      
	      
	   }
	}


