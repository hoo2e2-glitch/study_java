package clasTask03;

//육식동물(Carnivore)
//- 사자, 곰
public class Carnivore extends Animals {
	
	public Carnivore() {;}

	public Carnivore(String name, String type) {
		super(name, type);
	}
	
	void lion() {
		System.out.println("사자");
	}
	
	void bear() {
		System.out.println("곰");
	}
	
	@Override
	public void separation() {
		System.out.println("육식동물");
	}
	
	

}
