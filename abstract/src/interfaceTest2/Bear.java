package interfaceTest2;

// 3개
public class Bear extends Animal implements CarnivoreMark{
	public Bear() {;}
	
	private String name;

	public Bear(String name) {
		super(name);
		this.name = name;
	}
	
	
}
