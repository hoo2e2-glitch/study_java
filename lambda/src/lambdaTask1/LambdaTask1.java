package lambdaTask1;

public class LambdaTask1 {
	public static void main(String[] args) {
//      1~10까지 출력해주는 메서드
      Print print = () -> {
         for(int i = 0; i < 10; i++) {
            System.out.println(i + 1);
         }
      };
      
      print.number(i);
      
//      문자열, 문자형, 인덱스를 전달하면 해당 인덱스에 값을 전달한 문자형으로 바꿔주는 메서드 
      Print2 print2 = (content, c, index) -> {
         String result = "";
         char[] chars = content.toCharArray();
         
         for(int i = 0; i < chars.length; i++) {
            if(index == i) {
               result += c;
            }else {
               result += chars[i];
            }
         }
         return result;
      };
      
      System.out.println(print2.replace("abcd", 'A', 0));
      
      
      
      
   }
}