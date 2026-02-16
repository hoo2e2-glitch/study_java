package arrayTest;

public class ArrayTest {
	public static void main(String[] args) {
//      int[] arData = new int[5];
//      arData[] = 10;
//		System.out.println(arData); // 해시주소값
      
//      String[] arData2 = new String[3];
//      System.out.println(arData2[0]);
      
//      boolean[] arData3 = {false, false, true};
//      arData3[3] = false;
      
		int[] arData1 = {10, 3, 9, 6, 7, 30};
		
		for(int i = 0; i < arData1.length; i++) { //length = 필드 
			System.out.println(arData1[i]);
		}
//		System.out.println(arData1[1]);
//		System.out.println(arData1[2]);
//		System.out.println(arData1[3]);

		char [] chars = {'A', 'B', 'C', 'D', 'E'};
//		chars[0] = 97; // 확실한값은 자동 형변환
		for(char i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}
		
		
 	}
}
