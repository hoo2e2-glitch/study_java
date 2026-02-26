package innerClassTest;

public class InnerClassTest {
	public static void main(String[] args) {
		new InnerClassTest in = new InnerClassTest();
		new InnerClassTest().new InnerClass();
	}
	
	class InnerClass{
		private int value;
		
		{this.value = 20;}
		
		public InnerClass() {;}

		public InnerClass(int value) {
			super();
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
		
		
		
	}
	public InnerClassTest() {;}


}
