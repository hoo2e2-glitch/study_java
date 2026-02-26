package interfaceTask;

public class PersonAdapter extends Person implements PersonAction{

	public PersonAdapter() {;}
	public PersonAdapter(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void eat() {;}

	@Override
	public void goToSchool() {;}

	@Override
	public void goToCompany() {;}

}
