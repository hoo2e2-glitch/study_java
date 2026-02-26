package objectTest;

import java.util.Objects;

public class Uesr {
	// private long id; 넣기
	private long id;
	private String name;
	
	public Uesr() {;}

	public Uesr(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	protected long getId() {
		return id;
	}

	protected void setId(long id) {
		this.id = id;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Uesr [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	
//	equals 재정의
//	Long id 필드 비교
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Uesr other = (Uesr) obj;
		return id == other.id;
	}

	
	

}
