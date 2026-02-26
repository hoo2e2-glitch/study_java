package classTest;

// 부모
class Car {
	public Car() {;}
	
	void engineStrat() {
	System.out.println("시동을 켠다");	
	}
}
// 자식
class SuperCar extends Car {
	public SuperCar() {;}
	
	// 부모의 코드에 자식이 올라탐
	@Override
	void engineStrat() {
		System.out.println("음성으로 시동을 켠다");	
		}
	
	void openRoof() {
		System.out.println("뚜껑 오픈");
	}
	
}


public class ClassTest {
	public static void main(String[] args) {
		
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
		
		
		
		// uo casting
		// 부모의 코드에 자식에 코드가 덮어써짐
		Car noOptionFerrari = new SuperCar();
		
		// uo casting 객체와 부모의 객체는 다르다.
		// 오버라이딩 된 메서드의 결과가 다르다.
		matiz.engineStrat();
		noOptionFerrari.engineStrat();
		
		// error
//		SuperCar fullOptionFerrari = new Car();   
				
		// down casting
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		fullOptionFerrari.openRoof();
		
	
		System.out.println(matiz instanceof Car);
		System.out.println(matiz instanceof SuperCar);
		System.out.println(noOptionFerrari instanceof Car); // 상속받은 객체
		System.out.println(noOptionFerrari instanceof SuperCar); // 태생은 그대로
		System.out.println(fullOptionFerrari instanceof Car); 
		System.out.println(fullOptionFerrari instanceof SuperCar);
		
		// **넘치는건 괜찮음 but 부족한건 안됨.**		
			
		}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


