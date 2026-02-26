package methodTask;

public class MethodTask01 {
	   void printFromTo10() {
//		   1. 1~10까지 출력하는 메서드
		      for(int i = 0 ; i < 10; i++) {
		         System.out.println(i + 1);
		      }
		   }
		   
//	  		2. 1~n까지의 합을 반환해주는 메서드
		   int getTotal(int count) { // 매개변수 count 입력받음
		      int total = 0;	// 합계를 담은 변수, 0으로 시작
		      for(int i = 0; i < count; i++) {
		         total += i + 1;
		      }
		      return total;	// 최종 합계 반환
		   }
		   
		   public static void main(String[] args) {
		      
		      MethodTask01 mt = new MethodTask01();
		      int total = 0; // 합계 담을 변수
		      
//		      1. 1~10까지 출력하는 메서드
		      mt.printFromTo10();
		      
//		      2. 1~n까지의 합을 반환해주는 메서드
		      total = mt.getTotal(79);
		      System.out.println(total);
		   }
		}





