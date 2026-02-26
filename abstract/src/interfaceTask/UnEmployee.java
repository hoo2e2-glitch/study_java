package interfaceTask;

public class UnEmployee extends PersonAdapter{
	public UnEmployee() {;}
	public UnEmployee(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void eat() {
		System.out.println("먹기만 한다.");
	}
	
}
