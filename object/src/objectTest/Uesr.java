package objectTest;

import java.util.Objects;

public class Uesr {
	// private long id; 넣기
	private Long id;
	private String name;
	
	public Uesr() {;}

	public Uesr(Long id, String name) {
		this.id = id;
		this.name = name;
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

	
	@Override
	public String toString() {
		return "Uesr [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

//  equals를 재정의
//  Long id 필드를 비교하자!
  @Override
  public boolean equals(Object obj) {
     if (this == obj)
        return true;
     if (obj == null)
        return false;
     if (getClass() != obj.getClass())
        return false;
     Uesr other = (Uesr) obj;
     return Objects.equals(id, other.id);
  }
  
}
