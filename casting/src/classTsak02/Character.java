package classTsak02;

public class Character extends Monster{
	
	// 공통 - 얻는다
	String get;
	String hunted;
	
	public Character() {;}
	public Character(String get, String hunted) {
		this.get = get;
		this.hunted = hunted;
	}
	
	void gameStart() {
		System.out.println("사냥게임을 시작합니다.");
	};
	
	void get() {
		System.out.println("얻는다");
	};
	
	void hunted() {
		System.out.println("사냥한다");
	};
	
	public void addMonster(Monster monster) {
		if(monster instanceof Ork) {
			Ork ork = (Ork)monster;
			ork.huntedOrk();
			ork.hunted();
			ork.get();
		
		}else if(monster instanceof Fairy) {
			Fairy fairy = (Fairy)monster;
			fairy.huntedFairy();
			fairy.hunted();
			fairy.get();
		
		}else if(monster instanceof Human) {
			Human human = (Human)monster;
			human.huntedHuman();
			human.hunted();
			human.get();
		
		}
	
		
	}	

}
