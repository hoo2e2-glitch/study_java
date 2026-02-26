package arrayList.Task;

public class User {
	
	private String name;
	private String id;
	private String password;
	private String phone;
	
	public User() {;}

	public User(String name, String id, String password, String phone) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.phone = phone;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	protected String getPassword() {
		return password;
	}

	protected void setPassword(String password) {
		this.password = password;
	}

	protected String getPhone() {
		return phone;
	}

	protected void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [name=");
		builder.append(name);
		builder.append(", id=");
		builder.append(id);
		builder.append(", password=");
		builder.append(password);
		builder.append(", phone=");
		builder.append(phone);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	eq
	
	
}
