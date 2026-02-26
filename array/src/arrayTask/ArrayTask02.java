package arrayTask;

import java.util.Scanner;

public class ArrayTask02 {
	
	   public static void main(String[] args) {
		      
//	      골드
//	      1. 사용자가 몇 개를 입력할 지 모를 때,
//	      입력한 모든 값을 배열에 담은 후 최댓값과 최솟값을 출력
		   String message = "번 째 정수를 입력하세요.\n";
		   System.out.println(message);
		   Scanner sc = new Scanner(System.in);
		   int num = 0, min = 0, max = 0,  count = 0;
		   int[] data = new int[num];
		   
		   data[count] = sc.nextInt();
		   System.out.println(data[count]);
		   
		   min = data[0];
		   max = data[0];
		   
		   for(int i = 0; i < count; i++) {
			   if(min > data[i]) { min = data[i];}
			   if(max < data[i]) { max = data[i];}
		   }
		   System.out.println(min);
		   System.out.println(max);
		   
	      
//	      2. 사용자가 몇 개를 입력할 지 모를 때,
		   int num1 = 0, count1 = 0;
		   double num3 = 0;
//	      입력한 모든 값을 배열에 담고, 실수와 정수의 개수를 출력
		   int[] data2 = null;
		   Scanner sc = new Scanner(System.in);
		   String message = "숫자를 입력하세요.\n";
		   
		   
		   while(true) {
			   System.out.println(count1 + 1 + message);
			   data2[count1]= sc.nextInt();
			   count1++;
		   }
		   
		   for(int i = 0; i < data2.length; i++) {
			   if(num1 == num3) {
				   System.out.println(num1 + "정수");
			   }else {
				   System.out.println(num3 + "실수");
				   
			   }
			   
		   }
		   
//	      입력예시) "10", "10.7", "2", "3.6"
//	      출력예시) 실수 2개,
		  
		  // 강사님 풀이
//	      골드
//	      1. 사용자가 몇 개를 입력할 지 모를 때,
//	      입력한 모든 값을 배열에 담은 후 최댓값과 최솟값을 출력
//	      Scanner sc = new Scanner(System.in);
//	      int[] arData1 = null;
//	      int count = 0, min = 0, max = 0;
//	      String message1 = "배열의 길이를 입력하세요.";
//	      
//	      System.out.println(message1);
//	      count = sc.nextInt();
//	      arData1 = new int[count];
//	      
//	      for(int i = 0; i < count; i++) {
//	         System.out.println(i + 1 + "번 째 정수를 입력하세요.\nex)10");
//	         arData1[i] = sc.nextInt();
//	      }
//	      
//	      min = arData1[0];
//	      max = arData1[0];
//	      
//	      for(int i = 0; i < arData1.length; i++) {
//	         if(min > arData1[i]) { min = arData1[i]; };
//	         if(max < arData1[i]) { max = arData1[i]; };
//	      }
//	      
//	      System.out.printf("최솟값: %d 최댓값: %d", min, max);
	      
//	      2. 사용자가 몇 개를 입력할 지 모를 때,
//	      입력한 모든 값을 배열에 담고, 실수와 정수의 개수를 출력
//	      입력예시) "10", "10.7", "2", "3.6"
//	      출력예시) 실수 2개, 정수 2개
	      Scanner sc = new Scanner(System.in);
	      String[] arData2 = null;
	      int arData2Length = 0, integerCount = 0, floatCount = 0;
	      String message1 = "배열의 길이를 입력하세요.";
	      
	      System.out.println(message1);
	      arData2Length = sc.nextInt();
	      arData2 = new String[arData2Length];
	      
	      for(int i = 0; i < arData2Length; i++) {
	         
	         System.out.println(arData2Length + 1 + "번 째 값을 입력하세요\nex)10 or 11.2");
	         
	         String input = sc.next();
	         arData2[i] = input;
	         
	         if(input.contains(".")) {
	            floatCount++;
	         }else {
	            integerCount++;
	         }
	      }
	      
	      System.out.printf("실수: %d개, 정수: %d개", floatCount, integerCount);
	   }
	}


