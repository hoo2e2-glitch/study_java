package objectTest;

public class ObjectTest {

//	1. private : 직접 접근 금지 / 화면호출
	private  String name;
	
//	2. 기본생성자 : 컴파일러가 만들어줌
	public ObjectTest() {;}
	
//	3. 초기화 생성자	
	public ObjectTest(String name) {
	super();
	this.name = name;
}
	
//	4. get / set
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}


//	6. toString() : 해당 객체 
//	재정의하기 / 필드 봐야함
//	alt + sh + s + s
//	
	
	
	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();
		System.out.println(ot);
		System.out.println(ot.toString());
		
		Uesr uesr1 = new Uesr(1L, "홍길동");
		
//		도서관 책 대여
//		id끼리 비교
		if(uesr1.equals(new Uesr(1L, "홍길동"))) {
			System.out.println("책 대여");
			
		}else{
			System.out.println("도난");
			}
	
	}

		
		
		
	}

	



