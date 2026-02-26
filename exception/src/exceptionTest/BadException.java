package exceptionTest;

// RuntimeException 컴파일러가 검사하지 않는다.
public class BadException extends RuntimeException {
	public BadException() {;}
	public BadException(String me) {
		super(me);
	
	}
	
	

	
	
}
