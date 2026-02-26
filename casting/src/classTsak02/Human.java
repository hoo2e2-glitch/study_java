package classTsak02;

public class Human extends Character {
	
	public Human() {;}
	
	public Human(String get,  String hunted) {
		super(get, hunted);
	}


	public void huntedHuman() {
		System.out.println("휴먼이 숨는다");
		
	}
	
	@Override
	void hunted() {
		System.out.println("휴먼을 사냥한다");
	}
	
	void get() {
		System.out.println("갑옷을 얻는다");
	}
	

}
