package clasTask03;

//초식동물(Harbivore)
//- 코알라, 사슴
public class Harbivore extends Animals {
	
	public Harbivore() {;}

	public Harbivore(String name, String type) {
		super(name, type);
	}
	
	
	public void koala(){
		System.out.println("코알라");
	}
	
	public void deer(){
		System.out.println("사슴");
	}
	
	@Override
	public void separation() {
		System.out.println("초식동물");
	}
	
	
	
	
	
	

}
