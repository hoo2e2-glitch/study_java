package inheritanceTsak;

//상속 및 분리 실습

//
//PersonTask
class PersonTask{
//이름, 나이, 주소, 핸드폰
	String name;
	int age;
	String address;
	long phone;
	
	public PersonTask() {;}
	public PersonTask(String name, int age, String address, long phone) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}

//각 메서드 출력
//work 일을 한다
//sleep 잠을 잔다
//eat 세 끼를 먹는다
	void work() {
		System.out.println("일");
	};
	void sleep() {
		System.out.println("잠");
	};
	void eat() {
		System.out.println("먹다");
	};
}



//StudentTask
class StudentTask extends PersonTask{
//인스타아이디
	String insta;
	
	public StudentTask() {;}
	public StudentTask(String name, int age, String address, long phone, String insta) {
		super(name, age, address, phone);
		this.insta = insta;
	}
	
//각 메서드 출력
//work 아르바이트를 한다
//sleep 수업 시간에 잠을 잔다
//eat 아침을 거른다
	@Override
	void work() {
		System.out.println("아르바이트를 한다");
	};
	void sleep() {
		System.out.println("수업 시간에 잠을 잔다");
	};
	void eat() {
		System.out.println("아침을 거른다");
	};
	
}


//
//EmployeeTask
class EmployeeTask extends PersonTask{
//비상금
	int money;
	
	public EmployeeTask() {;}
	public EmployeeTask(String name, int age, String address, long phone, int money) {
		super(name, age, address, phone);
		this.money = money;
	}

//각 메서드 출력
//work 하루 종일 일을 한다
//sleep 잠을 설친다
//eat 야식을 먹는다
	@Override
	void work() {
		System.out.println("하루 종일 일을 한다.");
	};
	
	void sleep() {
		System.out.println("잠을 설친다");
	};
	
	void eat() {
		System.out.println("야식을 먹는다");
	};

}
//
//InhertanceTask에서

//사람, 학생, 직장인 객체화 후 각 메서드 출력하기




public class InheritanceTsak01 {
	public static void main(String[] args) {
		
		PersonTask person = new PersonTask("이름", 20, "주소", 12345678);		
		StudentTask student = new StudentTask("이름", 20, "주소", 12345678, "insta");		
		EmployeeTask employee = new EmployeeTask("이름", 20, "주소", 12345678, 300_000);
		
		// 사람
		person.work();
		person.sleep();
		person.eat();
		
		// 학생
		student.work();
		student.sleep();
		student.eat();
		
		//직장인
		employee.work();
		employee.sleep();
		employee.eat();		
	}

}
