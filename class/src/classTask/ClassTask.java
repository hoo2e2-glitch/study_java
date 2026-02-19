package classTask;

//1. 스포츠(Sports) 추상화
//2. 농구(BasketBall), 야구(BaseBall), 축구(Soccer) 객체 
//3. 기본 생성자, 초기화 생성자 생성 후 초기화

class Sports {
	int number;
	String name;
	
//	기본 생성자
	public Sports() {;}
	
//	shift + alt + s -> o
//	초기화 생성자
	public Sports(int number, String name, String teamName) {
		this.number = number;
		this.name = name;
		this.teamName = teamName;
		
	}
	
	
}


public class ClassTask {
	
	public static void main(String[] args) {
	
	Sports BasketBall = new Sports(5, "농구", "현대모비스");
	Sports BaseBall = new Sports(10, "야구", "한화이글스");
	Sports Soccer = new Sports(11,"축구", "리버풀");
	}
	
}
