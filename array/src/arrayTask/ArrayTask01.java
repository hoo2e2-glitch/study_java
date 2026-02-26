package arrayTask;

import java.util.Scanner;

public class ArrayTask01 {
	public static void main(String[] args) {
//      브론즈
//      1. 1~100까지 배열에 담은 후 홀수만 출력
//		int[] arNum = {} ;
//		for(int i = 0; i < 100; i++) {
//			// i % 2 !== 0;???
//			System.out.println(arNum[i]);
//		}
//		
//		
//      2. 10~1까지 중 짝수만 배열에 담고 출력
//		int[] arNum1 = {};
//		// i % 2 == 0; 
//		for(int i = 10; i < 0; i++) {
//			System.out.println(arNum1[]);
//		}
//		
//		
////      3. 1~77까지 중 짝수만 배열에 담고 출력
//		
//		int[] arNum2 = {};
//		// i % 2 == 0;
//		for(int i = 0; i < 77; i++) {
//			System.out.println();
//		}
//		
//      
////      실버
////      A~F까지 배열에 담고 출력
//		char[] alp = {'A', 'B', 'C', 'D', 'E', 'F'};
//		for(char i = 0; i < 6; i++) {
//			System.out.println(alp[i]);
//      
//   }
//      브론즈
//      1. 1~100까지 배열에 담은 후 홀수만 출력
//      int[] arData1 = new int[100];
//      for(int i = 0; i < arData1.length; i++) {
//         int value = i + 1;
//         arData1[0] = value;
//         if(value % 2 == 0) {
//            System.out.println(i);
//         }
//      }
      
//      2. 10~1까지 중 짝수만 배열에 담고 출력
//      int[] arData2 = new int[5];
//      for(int i = 0; i < 5; i++) {
//         arData2[i] = (i + 1) * 2;
//         System.out.println(arData2[i]);
//      }
      
//      3. 1~77까지 중 짝수만 배열에 담고 출력
//      int[] arData3 = null;
//      arData3 = new int[77 / 2];
//      for(int i = 0; i < arData3.length; i++) {
//         arData3[i] = (i + 1) * 2;
//         System.out.println(arData3[i]);
//      }
      
//      실버
//      A~F까지 배열에 담고 출력
//      char[] chars = new char[6];
//      for(int i = 0; i < chars.length; i++) {
//         chars[i] = (char)('A' + i);
//         System.out.println(chars[i]);
//      }
      
//      5개의 정수를 입력 받고 배열에 담은 후 최댓값과 최솟값을 출력
      String message = "번 째 정수를 입력하세요.\n";
      Scanner sc = new Scanner(System.in);
      int[] arData4 = new int[5];
      int count = 0, min = 0, max = 0;
      
      while(true) {
         System.out.print(count + 1 + message);
         arData4[count] = sc.nextInt();
         count++;
         if(count > 4) {
            break;
         }
      }
      
      min = arData4[0];
      max = arData4[0];
      
      for(int i = 1; i < arData4.length; i++) {
         if(min > arData4[i]) { min = arData4[i]; }
         if(max < arData4[i]) { max = arData4[i]; }
      }
      
      System.out.println("최댓값: " + max);
      System.out.println("최솟값: " + min);
      
   }
}







