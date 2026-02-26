package classTask04;

//마트(부) - 마트정보(부) 물건구매/물건진열/
//회원정보(부) 회원/비회원/

//3. 포인트 적립 메서드
//- 회원이 각각 포인트를 가지도록
//- 비회원은 5%
//- 회원은 10%

//4. 만약 비회원이라면 
//- 회원이 각각 쿠폰를 가지도록
//- 쿠폰 1장 제공, 쿠폰이 10장이라면 상품 무료!

public class MarketNonUser extends MarketMemberInfo {
	
	{
		this.setMoney(20_000);
		this.setPoint(5);
	}

	public MarketNonUser() {;}

	public MarketNonUser(String name, String number, long money, int point, int coupon) {
		super(name, number, money, point, coupon);
	}
	
	
	// 비회원이라면 쿠폰이 10장이라면 상품 무료!
	public void printNonMember() {
		System.out.println("비회원입니다.");
		
	}
	
	
}
