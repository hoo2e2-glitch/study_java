package lambdaTask2;

public class LambdaTask2 {

	   public static void main(String[] args) {
//	      1) 문자열과 정수형을 전달하면 정수형마다 글자를 건너뛰고 반환(리턴)하는 메서드
//	      입력 예시)
//	      "abcdabcd", 4
		   Show1 sh = (s, n) -> {
			   for(int i = 0; i < 8; i++) {
				   n
			   }
			  return; 
		   };
		   
		   System.out.println("abc");
		   
	      
//	      출력 예시
//	      "abcabc"
	      
//	      2) 문자열과 문자형을 전달하면 찾은 문자열의 인덱스에 해당하는 글자를 반환(리턴) 메서드
//	      없을 시 "-1"
//	      "abcdabcd", 'a'
//	      출력 결과
//	      "c"
		   
		   Show2 sh2 = (s, c) -> {
			   
		   };
	      
//	      3) 문자열에서 중복된 값을 모두 없애고 반환(리턴)하는 메서드
//	      입력 예시
//	      "가나다라마바사가나다라가나다"
		   String a = "";
		   Show3 sh3 = (s1) -> {
			   for(int i = 0; i < a.length(); i++) {
				   if(s1 == i) {
					   
				   }
			   }
			   
		   };
		   
//	      출력 예시
//	      "가나다라마바사"
	      
//	      4) 문자열을 전달하면 문자열을 뒤집어서 리턴(반환)해주는 메서드
//	      입력 예시
//	      "123456789"
		   Show4 sh4 = (s2) -> {
			   String result = "", input = null;
			   for(int i = 0; i < input.length(); i++ ) {
				   result += input.charAt(input.length() -i - 1);
			   }
			   return result;
		   };
		   
		   System.out.println(sh4);
	      
//	      출력 예시
//	      "987654321"
	      
	      
	      
	   }
	}

