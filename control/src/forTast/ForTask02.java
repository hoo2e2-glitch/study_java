package forTast;

import java.util.Scanner;

public class ForTask02 {
	public static void main(String[] args) {
//      브론즈
//      1. 1~100까지 출력
		for(int i = 0; i <= 100; i++) {
			// System.out.println(i);
		}
//      2. 100~1까지 출력
		for(int i = 100; i < 0; i--) {
			// System.out.println(i);
		}
//      골드
//      1. 1~10까지 누적합을 출력
		for(int i = 0; i < 10; i++) {
			// int value = i += i;
			// System.out.println(value);
		}
//      2. 1~n까지 누적합 출력
		//for(int i = 0; i < n; i++) {
			// int value = i += n;
			// System.out.println(value);
		//}
      
//      플레티넘
//      1. A~F까지 출력
		for(int i = 0; i < 6; i++) {
			// System.out.println((char)('A' + i));
		}
//      2. A~F까지 중 C를 제외하고 출력
		for(int i = 0; i < 6; i++) {
			char value = (char)('A' + i);
			char value2 = ('C'); // C
			// System.out.println(value);
			// System.out.println(value > value2 ? value : "");
		}
      
//      다이아
//      1. aBcDeFg...Z 출력
		for(int i = 0; i < 26; i++) {
			if(i % 2 == 0) {
				//System.out.println((char)('a' + i));
			}else {
				//System.out.println((char)('A' + i));
			}
			// char a = (char)('a' + i);
			// char A = (char)('A' + i);
		}
		
//      2. 별찍기 
//        *
//       ***
//      *****
		
		
		
      
//      마스터
//      1. 해당 문자와 반복할 횟수를 입력하면 문자를 만들어주는 프로그램 
//      단 반복할 횟수는 1~9까지만 입력할 수 있다.
//      입력 예시) a1b3c2
//      출력 예시) abbbcc
		
//		Scanner sc = new Scanner(System.in);
//		
//		// 메세지
//		String messeage = "입력 예시) a1b3c2\n출력 예시) abbbcc";
//		System.out.println(messeage);
//		
//		// 초기화
//		int num = 0;
//		String alp = null;
//		
//		// 출력
//		alp = sc.next();
//		num = sc.nextInt();
//		
//		System.out.println(alp);
//		System.out.println(num);
//		
//		
//		// 조건
//		for(int i =0; i <10; i++) {
//			if(alp ) {
//				
//			}
//		};
//		
//      마스터
//      1. 해당 문자와 반복할 횟수를 입력하면 문자를 만들어주는 프로그램 
//      단 반복할 횟수는 1~9까지만 입력할 수 있다.
//      입력 예시) a1b3c2
//      출력 예시) abbbcc
//      Scanner sc = new Scanner(System.in);
//      String message = "문자와 반복할 횟수를 붙여서 입력하세요.\nex)a1b2c5",
//            input = null, result = "";
//      
//      System.out.println(message);
//      input = sc.next();
//      
//      for(int i = 0; i < input.length(); i++) {
//         if(i % 2 == 0) {
//            char c = input.charAt(i);
//            int count = input.charAt(i + 1) - 48;
//            for(int j = 0; j < count; j++) {
//               result += c;
//            }
//         }
//      }
//      
//      System.out.println(result);
      
		
		
		
      
//      2. 사용자가 입력한 횟수가 얼마인지 모르고,
//      입력한 횟수 만큼 문자를 만들어주는 프로그램
//      입력 예시) a1b22c357
//      출력 예시) abbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccccc...
      Scanner sc = new Scanner(System.in);
      String message = "문자 + 숫자 형식의 문자열을 입력하세요.\nex)a1b22c347",
            input = null, result = "";
      
      System.out.println(message);
      input = sc.next();
      
      for(int i = 0; i < input.length(); i++) {
         char c = input.charAt(i); // 문자
         
         String numberStr = "";
         i++;
//         다음 문자부터 숫자 읽기 시작
         while(i < input.length() && input.charAt(i) >= '0' && input.charAt(i) <= '9') {
            numberStr += input.charAt(i);
            i++;
         }
         
         int count = Integer.parseInt(numberStr);
         
         for(int j = 0; j < count; j++) {
            result += c;
         }
         i--;
      }
      
      System.out.println(result);
		
		
		
		
	}

}
