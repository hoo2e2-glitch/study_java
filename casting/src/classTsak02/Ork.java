package classTsak02;

public class Ork extends Character {
	
	public Ork() {;}
	
	public Ork(String get,  String hunted) {
		super(get, hunted);
	}

	public void huntedOrk() {
		System.out.println("오크가 달려든다!");	
	}
	
	@Override
	void hunted() {
		System.out.println("오크를 사냥한다");
	}
	
	void get() {
		System.out.println("가죽 얻는다");
	}

}
