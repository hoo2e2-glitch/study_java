package classTest;

public class StaticTset {
	int data = 10;
	static int data_s = 10;
	
	   void increase() {
		      System.out.println(++data);
		   }
		   
		   static void increase_s() {
		      System.out.println(++data_s);
		   }
		   
		   
		   public static void main(String[] args) {
			   
			   StaticTset st = new StaticTset();
//			   st.increase();
//			   st.increase();
//			   st.increase();
//			   st.increase();
//			   st.increase();
//			   st.increase();
//			   st.increase();
//			   st.increase();
//			   st.increase();
//			   st.increase();
//			   st = new StaticTest();
			   
				increase_s();
				increase_s();
				increase_s();
				increase_s();
				increase_s();
				st = new StaticTset();
				increase_s();
				increase_s();
				increase_s();
				increase_s();
				increase_s();
				
				StaticTset st1 = new StaticTset();
				StaticTset st2 = new StaticTset();
				StaticTset st3 = new StaticTset();
				StaticTset st4 = new StaticTset();
				
				System.out.println(st1.data_s);
				System.out.println(st2.data_s);
				System.out.println(st3.data_s);
				System.out.println(st4.data_s);
		      
		      
		      
		      
		   }
		}
