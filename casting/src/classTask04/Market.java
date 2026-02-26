package classTask04;


//마트(부) - 마트정보(부) 물건구매/물건진열/
//회원정보(부) 회원/비회원/

public class Market {
	
	private String marketName;
	// - 상품 등록은 최대 5개까지만 할 수 있다.
	private Product[] product = new Product[5];
	// 현재 등록된 상품 수
	private int productCount = 0;
	 
	 public Market() {;}
	 
	 public Market(String marketName, Product[] product, int productCount) {
		super();
		this.marketName = marketName;
		this.product = product;
		this.productCount = productCount;
	}


	 // 상품등록
	 public void addProduct(Product product) {
		 if(productCount >= 5) {
			 System.out.println("등록 초과");
			 return;
		 }
		 for(int i = 0; i < productCount; i++) {
			 if(this.product[i].getName().equals(product.getName())) {
			 System.out.println("이미 등록된 상품");
			 return;
			 }
		 }
		 this.product[productCount] = product;
		 productCount++;
		 
	 }

	// 상품판매 - 미완
	public void sellingProduct(MarketMemberInfo user, String name, int stock) {
		
		
		
		
	}
	
	// 포인트 적립 - 미완
	public void addPoint(int Point) {
		
		
		
	}

	
	

}
