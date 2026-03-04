package optionalTest;

// 커스텀 예외 생성
public class NoSerachUser extends RuntimeException {
	public NoSerachUser() {;}
	public NoSerachUser(String message) {
		super(message);
		
	}
	
}
