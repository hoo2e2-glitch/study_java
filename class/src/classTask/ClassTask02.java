package classTask;

//슈퍼카(SuperCar) 클래스 생성
//브랜드, 색상, 가격, 엔진(boolean), 비밀번호, 비밀번호의 오류횟수, 엔진을 킴, 엔진을 끔

	class SuperCar{
		String brand;
		String color;
		int price;
		boolean engine; //false
		int password;
		int errorCount;
//		String turnOn;
//		String turnOff;

	
	public SuperCar() {;}
	public SuperCar(String brand, String color, int price, int password) {
		this.brand = brand;
		this.color = color;
		this.price = price;
//		this.engine = engine;
		this.password = password;
//		this.errorCount = errorCount;
//		this.turnOn = turnOn;
//		this.turnOff = turnOff;
	}
	
//2. 비밀번호를 입력, 비밀번호가 일치한다면 엔진의 시동 여부를 제어(킴 or 끔)
//3. 비밀번호 3회 오류시 경찰 출동
	void engineStart() {
		if(errorCount >= 3) {System.out.println("오류시 경찰 출동");}
		return;
//		비밀번호 일치
		if(Boolean.parseBoolean(password) == false) {System.out.println("엔진 켬");
		}else if(engine) {
			System.out.println("엔진 끔");
		}
	}	
}


public class ClassTask02 {

public static void main(String[] args) {
//1. 슈퍼차 객체화
	SuperCar sc1 = new SuperCar("페라리", "노랑", 4000, 4444);
	SuperCar sc2 = new SuperCar("부가티", "빨강", 5000, 4444);
	
	}

}
