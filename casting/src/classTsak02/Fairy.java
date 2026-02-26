package classTsak02;

public class Fairy extends Character {
	
	public Fairy() {;}
	public Fairy(String get,  String hunted) {
		super(get, hunted);
	}


	public void huntedFairy() {
		System.out.println("요정이 마법을 사용한다");
		
	}
	
	@Override
	void hunted() {
		System.out.println("요정을 사냥한다");
	}
	
	void get() {
		System.out.println("날개를 얻는다");
	}
	
	
}
