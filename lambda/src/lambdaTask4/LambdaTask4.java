package lambdaTask4;

public class LambdaTask4 {
	
	   public static void main(String[] args) {
//	      1. 정수를 입력하면 정수에 해당하는 구구단을 출력해주는 람다
//	      입력 예시)
//	      3
//	      출력 예시)
//	      3 x 1 = 3
//	      ...
//	      3 x 9 = 27 
		   Gugu gu = (num) -> {
			   for(int i = 3; i < 10; i++) {
				   for(int dan = 1; dan <=9; dan++) {
					   System.out.print(i + "X" + dan + "=" + (i * dan) + "\t");
				   }
			   }
			   return num;
		   };
	      System.out.println(gu.gugudan(2));
	      
//	      2. 두 개의 정수와 연산자를 전달하면 식을 완성시켜주는 람다
//	      입력 예시1)
//	      10, 20, "+"
//	      
//	      출력 예시1)
//	      30
	      
//	      입력 예시2)
//	      10, 20, "-"
//	      
//	      출력 예시2)
//	      -10
	      
	      Calc0 cal = (num1, num2) -> {
	    	  String pl = null;
	    	  int aa = 0, bb = 0, result = 0;
	    	  for(int i = 0; i < aa; i++) {
	    		  for(int j =0; j < bb; i++) {
	    			  System.out.print(i + "+" + j + "=" + pl + "\t");
	    		  }
	    	  }
	    	  return result;
	      };
	      
	      System.out.println(cal.calc0(10, 20));
	    	  
	      
//	      3. 배열에 10개의 무작위 정수를 전달하면,
//	      큰수부터(내림차순) 정렬하여 배열에 담아 리턴(반환)해주는 메서드
//	      입력 예시)
//	      {10, 3, 7, 8, 0, 9}
	      
//	      출력 예시)
//	      {10, 9, 8, 7, 3, 0}
	      
	      Arr arrr = (aaa) -> {
	    	  int[] cc = null;
	    	  for(int data : cc) {
	    		  
	    		  System.out.println(data);
	    	  };
	    	  return aaa;
	      };
	      
//	      System.out.println(arrr.arr(10, 3, 7, 8, 0, 9));
	   
	   
	   
	   
	   
	   }
	      
	      
	      
	      
	      
	   }
	










