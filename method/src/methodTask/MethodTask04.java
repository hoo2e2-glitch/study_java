package methodTask;

import java.util.Scanner;

public class MethodTask04 {
	
//  1. 두 정수를 전달하면 몫과 나머지를 배열로 전달하는 메서드
	int[] number(int num1, int num2) {
		int[] result = new int[2];
		
		result[0] = num1 % num2;
		result[2] = num1 / num2;
		return result;		
	}
    
//  2. 사용자가 입력하는 값중 정수 분리하기
//  입력 예시)
//  안1녕2하3세4요
//  출력 예시)
//  1234
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String message = "글자+숫자입력\nex)입력 예시)\n안1녕2하3세4요\n출력 예시)\n1234",
			word = "", result = "";
	int num3 = 0;
	
	System.out.println(message);
	word = sc.nextLine();
//	num3 = sc.nextInt();
	
	for(int i = 0; i < word.length(); i++) {
		
	}
	
	result += word + num3;
	System.out.println(result);
	
	}

  
//  3. 사용자가 입력한 글자와 찾을 글자를 입력하면 글자의 개수를 반환해주는 메서드
//  입력 예시) apple
//  찾을 글자 p
//  반환 2
	Scanner sc = new Scanner(System.in);
	String message1 = "글자입력\nex)입력 예시)\napple\n출력 예시)\np\n반환 2",
		word1 = "", result1 = "";
	
	



  
//  4. 5개 정수를 배열로 마구잡이로 전달할 때 가장 작은 2개의 숫자를 배열에 담아 전달하는 메서드
  
//  5. 랜덤한 값을 100칸 배열에 담은 후 배열 안의 값 중 홀수의 합만 출력
  
//  6. 연속된 중복 문자 제거하기
//  입력 예시1)
//  abbbbacda
//  출력 예시1)
//  aacda
  
//  입력 예시2)
//  aabbccccd
//  출력 예시2)
//  abcd
  
	
	
}




