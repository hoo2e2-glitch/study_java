package methodTest;

public class MethodTest02 {
	   
	   int[] test(int[] data) {
	      data[0] = 20;
	      return data;
	   }
	   
	   public static void main(String[] args) {
	      MethodTest02 ts = new MethodTest02();
	      int[] data = {50};
	      
	      ts.test(data);
	      System.out.println(data[0]);
	   }
	}

// 20이 출력되는 이유
// ** 배열은 주소를 넘겨줌 **
// 메서드 안에서 바꾸면 원본도 같이 바뀜

// 일반변수 -> 값을 복사해서 넘겨줌(원본유지) 
// 배열 -> 주소를 넘겨줌(원본이 바뀜)


