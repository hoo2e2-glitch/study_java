package forTast;

public class ForTask01 {
	public static void main(String[] args) {
			
//	      1~10까지 반복 후 5~8을 제외하고 출력
		      for(int i = 0; i < 6; i++) {
		         int value = i + 1;
		         System.out.println(value > 4 ? value + 4 : value);
		      }
		}
	}
	
