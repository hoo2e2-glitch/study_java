package classTest;

// Person, Bank
class Bank{
	String bankName;
	int bamkMoney;
	
	public Bank() {}
	public Bank(String bankName) {
	this.bankName = bankName;
}

//	사용자의 돈 입금
//	수수료 1000원
	void deposit(int money, Person person) {
		this.bamkMoney += money + 1000;
		person.personMoney -= money + 1000;
	}
	
//	사용자의 돈을 출금
//	수수료 5000원	
	void withdraw(int money, Person person) {
		this.bamkMoney -= money - 5000;
		person.personMoney += money - 5000;
	}
}

class Person{
	int personMoney;
	String personName;
	
	public Person() {}
	public Person(int personMoney, String personName) {
		this.personMoney = personMoney;
		this.personName = personName;
	}
	
}

public class ClassTest02 {
	public static void main(String[] args) {
		Bank kb = new Bank("은행");
		Person gh = new Person();
		
		kb.deposit(10000, gh);
		System.out.println("규혁돈" + gh.personMoney);
		System.out.println("은행돈" + kb.bamkMoney);
		
		kb.withdraw(5000, gh);
		System.out.println("규혁돈" + gh.personMoney);
		System.out.println("은행돈" + kb.bamkMoney);
	}

}
