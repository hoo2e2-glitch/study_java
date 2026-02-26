package classTask04;

//마트(부) - 마트정보(부) 물건구매/물건진열/
//회원정보(부) 회원/비회원/

//3. 포인트 적립 메서드
//- 회원이 각각 포인트를 가지도록
//- 비회원은 5%
//- 회원은 10%

public class MarketUser extends MarketMemberInfo {
	
	{
		this.setMoney(10_000);
		this.setPoint(10);
	}
	
	public MarketUser() {;}

	public MarketUser(String name, String number, long money, int point, int coupon) {
		super(name, number, money, point, coupon);
	}
	
	
	public void printMember() {
		System.out.println("회원입니다.");
		
	}
	

}
