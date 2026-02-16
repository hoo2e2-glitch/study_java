package methodTest;

public class MethodTest {
//	이름출력
	void printName(String name) {
		System.out.println(name);
	};
	
//	두수를 더해서 반환하는 매서드
	double add(double num1, int num2) {
		return num1 + num2;
	};
	public static void main(String[] args) {
		
		// 객체화 - 할당하려면
		MethodTest mt = new MethodTest();
		System.out.println(mt.add(10, 20));
		
		// 기능 - 변수 x
		new MethodTest().printName("홍길동");
		
	}
	
}
