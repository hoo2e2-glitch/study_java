package methodTask;

import java.util.Scanner;

public class MethodTask03 {
	public static void main(String[] args) {

//      번외 로또 추첨하기
//      로또 번호 6개를 배열에 담아서 결과를 반환해주는 메서드
		// 6개 담을 준비
		int[] lotto = new int[6]; 
		// 6번 반복 뽑기
      for(int i = 0; i < 6; i++) {
         lotto[i] = (int)Math.floor(Math.random() * 45) + 1;
         // 번호 출력
         System.out.print(lotto[i] + " "); // 숫자사이 공백넣기
      }
    
//      단 반드시 배열을 사용해야 함
//      1. 한글을 정수로 바꿔주는 메서드(일공이사 -> 1024)
      Scanner sc = new Scanner(System.in);
      String message = "정수로 바꿀 글자를 입력하세요.\nex)일공이사",
            hangles = "공일이삼사오육칠팔구", result = ""; // 결과 담을 빈문자열
      String[] hangle = null; // 입력받은 글자 담을 배열
      
      System.out.println(message);
      hangle = sc.nextLine().split("");
      
      for(int i = 0; i < hangle.length; i++) {
         result += hangles.indexOf(hangle[i]);
      }
      // indexOf : 찾는 글자가 몇 번째 위치에 있는지 숫자로 알려줌
      
      System.out.println(result);
    
//      2. 정수를 한글로 바꿔주는 메서드(1024 -> 일공이사)
      Scanner sc1 = new Scanner(System.in);
      String message1 = "한글로 바꿀 정수를 입력하세요.\nex)1024",
            hangles1 = "공일이삼사오육칠팔구", result1 = "";
      String[] hangle1 = null;
      
      System.out.println(message1);
      hangle1 = sc1.nextLine().split("");
      for(String s: hangle1) {
         result1 += hangles1.charAt(Integer.parseInt(s));
      }
      // charAt : 그 위치에 있는 글자를 꺼내줌
      
      System.out.println(result1);
      
      
   }
}

// indexOf → 글자를 주면 위치(숫자)를 알려줌
// charAt  → 위치(숫자)를 주면 글자를 알려줌
