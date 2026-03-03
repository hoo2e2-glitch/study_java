package streamTask;

import java.util.Objects;

public class User {
	
	private Long id;
	private String name;
	private int age;
	private String job;
	private String gender;

	// 1
	public User() {;}
	
	// 2
	public User(Long id, String name, int age, String job, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.job = job;
		this.gender = gender;
	}
	
	// 3
	protected Long getId() {
		return id;
	}

	protected void setId(Long id) {
		this.id = id;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected String getJob() {
		return job;
	}

	protected void setJob(String job) {
		this.job = job;
	}

	protected String getGender() {
		return gender;
	}

	protected void setGender(String gender) {
		this.gender = gender;
	}
	
	// 4
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", job=" + job + ", gender=" + gender + "]";
	}
	
	
	// 5
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);

	}

	
	@Override
	public int hashCode() {
	    return Objects.hash(id);
	}
	
	
//			
}
