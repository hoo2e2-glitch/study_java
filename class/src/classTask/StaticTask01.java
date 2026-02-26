package classTask;

//회사
class Company {
	static int income; // = 1_000_000; // 초기값을 설정하고 싶으면 선언할 때 바로 넣어주면 가능
	String name;
	int age;
	
	
	public Company() {;}
	public Company(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	
}
public class StaticTask01 {
	public static void main(String[] args) {
		Company employee1 = new Company("홍길동", 20);
		Company employee2 = new Company("장보고", 20);
		Company employee3 = new Company("김철수", 30);
		
		
		employee1.income += 10_000;
		employee2.income += 30_000;
		employee3.income -= 40_000;
	
		System.out.println(employee1.income);
	
	}
	

}
