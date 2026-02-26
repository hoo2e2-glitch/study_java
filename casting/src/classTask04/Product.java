package classTask04;

//마트(부) - 마트정보(부) 물건구매/물건진열/
//회원정보(부) 회원/비회원/

//Product 상품
//- 필드: 이름, 가격, 재고

public class Product {
	
	private String name;
	private long price;
	private int stock;
	
	public Product() {;}

	public Product(String name, long price, int stock) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	

}
