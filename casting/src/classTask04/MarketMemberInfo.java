package classTask04;

//마트(부) - 마트정보(부) 물건구매/물건진열/
//회원정보(부) 회원/비회원/

//MarketMember 
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
//
//MarketNonMember
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰



public class MarketMemberInfo {
	
	private String name;
	private String number;
	private long money;
	private int point;
	private int coupon;
	
	public MarketMemberInfo() {;}

	public MarketMemberInfo(String name, String number, long money, int point, int coupon) {
		super();
		this.name = name;
		this.number = number;
		this.money = money;
		this.point = point;
		this.coupon = coupon;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getCoupon() {
		return coupon;
	}

	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
	
	public void check() {
		System.out.println("회원여부확인");
		
	}
	    
	
}
