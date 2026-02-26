package clasTask03;

//잡식동물(Omivore)
//- 강아지, 고양이
public class Omivore extends Animals {
	public Omivore() {;}

	public Omivore(String name, String type) {
		super(name, type);
	}
	
	void dog() {
		System.out.println("강아지");
	}
	
	void cat() {
		System.out.println("고양이");
	}
	
	@Override
	public void separation() {
		System.out.println("잡식동물");
	}

}
