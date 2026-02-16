package arrayTask;

import java.util.Scanner;

public class ArrayTask03 {
	public static void main(String[] args) {
//      플레티넘
//      1. 사용자의 입력값을 변환
//      사용자에게 입력 받은 문자열 중 소문자는 대문자로, 대문자는 소문자로 변환하여 모두 배열에 담고 출력
//      입력 예시) 안녕hi!
//      출력 예시) 안녕HI!
		
		Scanner sc = new Scanner(System.in);
		// 메세지, 초기화 
		String message = "글적기\nex)입력 예시) 안녕hi!\n출력 예시) 안녕HI!"
						, input = "";
		
		System.out.println(message);
		input = sc.nextLine();
		
		// 글자?
		char [] data = new char[input.length()];	
	
		// 아스키 32 
	    for(int i = 0; i < input.length(); i++) {
	    	char ch = input.charAt(i);
	    
	    	// 소문자
	    if(ch >= 'a' && ch <= 'z') {
	    	data[i] = (char)(ch - 32);
	    	// 대문자
            }else if (ch >= 'A' && ch <= 'Z')
            data[i] = (char)(ch - 32);
            } else {
	    	// 그 외 	
            data[i] = input.charAt(i);
	    	}
            // 배열담기 다시풀기
            System.out.println();
			
		
		

//		2. 사용자가 입력한 모든값을 반대로 뒤집어서 모두 배열에 담고 결과를 출력
//		입력 예시) apple
//		출력 예시) elppa

		
		Scanner sc = new Scanner(System.in);
		// 메세지, 초기화 
		String message1 = "글자적고 반대로 뒤집어서 출력"
						, input1 = "";
		
		System.out.println(message1);
		input1 = sc.nextLine();
		// 글자?
		char [] data2 = new char[input1.length()];
		
		
		// 반대
		for(int i = 0; i < input1.length(); i++ ){
			data2[i] = input1.charAt(input1.length() - i - 1);
		}
		
//		// 글자
//		for(int i = 0; i < data2.length; i++) {
//			System.out.println(data2[i]);
//		}

		
		
		
		
		
		
		
		
		
		
	}

}
