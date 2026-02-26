package practice;

public class Task01 {
	
	public static void main(String[] args) {

		//공백이 있는 직각삼각형 만들기!
		for(int i = 0 ; i < 7; i++) {
			
			//공백 - 감소
			for(int j = 0;  j < 7-i  ; j++) {
				System.out.print(" ");
			}
		
			//별 - 증가
			for(int star = 0 ;  star < (i+1) ; star++ ) {
				System.out.print("*");
			}
			
			//줄바꿈
			System.out.println();
			
		}
		
		
		for(int gugu = 2; gugu <10; gugu++ ) {
			
			//구구단 출력
			for(int dan = 1; dan <=9; dan++) {
				System.out.print(gugu +"X" +dan +"=" + (gugu * dan)+ "\t");
			}
			
			//내용이 없는 println() 메서드 사용 
			System.out.println();
			
		}	
		
	}

}
