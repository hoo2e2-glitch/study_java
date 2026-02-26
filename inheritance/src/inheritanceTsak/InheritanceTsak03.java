package inheritanceTsak;

//Phone
// 1. private
//이름, 브랜드, 가격
class Phone{
	private String name;
	private String brand;
	private int price;
	
	
// 2. 기본 
public Phone() {;}

// 3. 초기
public Phone(String name, String brand, int price) {
	this.name = name;
	this.brand = brand;
	this.price = price;
}
// 4. get,set
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

//문자발신 sms()
public void sms() {
	System.out.println("문자");
}
//전화 call()
public void call() {
	System.out.println("전화");
}
}


//Phone2G
//인터넷
// 오버로딩
class Phone2G extends Phone {
	public Phone2G() {;}
	public Phone2G(String name, String brand, int price) {
		super(name, brand, price);
	}
	public void internet() {
		System.out.println("인터넷");
		
	};
	
}

//Phone3G
//인터넷, 영상통화
class Phone3G extends Phone2G{
	public Phone3G() {;}
	public Phone3G(String name, String brand, int price) {
		super(name, brand, price);
	}
	public void videocll() {
		System.out.println("영상통화");
		
	}
	
}


public class InheritanceTsak03 {
	public static void main(String[] args) {
		//Phone2G, Phone3G 객체화
		Phone g = new Phone();
		Phone2G g2 = new Phone2G();
		Phone3G g3 = new Phone3G();
		
		g.call();
		
//Phone2G: 인터넷 메서드를 호출
		g2.call();
		g2.internet();
		
//Phone3G: 영상통화 메서드 호출
		g3.call();
		g3.internet();
		g3.videocll();
	}

}
