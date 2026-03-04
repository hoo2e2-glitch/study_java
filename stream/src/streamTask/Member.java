package streamTask;

import java.util.Objects;

public class Member {
	
	private Long id;
	private String name;
	private String hobby;
	private String intro;
	
	public Member() {;}

	public Member(Long id, String name, String hobby, String intro) {
		super();
		this.id = id;
		this.name = name;
		this.hobby = hobby;
		this.intro = intro;
	}

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

	protected String getHobby() {
		return hobby;
	}

	protected void setHobby(String hobby) {
		this.hobby = hobby;
	}

	protected String getIntro() {
		return intro;
	}

	protected void setIntro(String intro) {
		this.intro = intro;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", hobby=" + hobby + ", intro=" + intro + "]";
	}

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
		Member other = (Member) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
	
	

}
