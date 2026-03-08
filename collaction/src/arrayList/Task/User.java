package arrayList.Task;

import java.util.Objects;

public class User {
	
//	1. private
//	ex) 
//	id -> test123@gmail.com
	private String id;
	private String name;
	private String password;
	private String phone;
	
//	2. 기본 생성자, 초기화 생성자
	public User() {;}

	public User(String name, String id, String password, String phone) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.phone = phone;
	}

//	3. getter, setter
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

//	4. toString()
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + "]";
	}

	//	5. Equals, Hashcode
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

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
	

	
	
}

