package anonymousTask1;

public class Starbucks {
// 입점 시 상품등록
// Form 인터페이스 
	
	private String[] menus;
	public Starbucks() {;}
	
	public Starbucks(String[] menus) {
		super();
		this.menus = menus;
	}
	
	public String[] getMenus() {
		return menus;
	}

	public void setMenus(String[] menus) {
		this.menus = menus;
	}

	public void ra(Form form) {
		this.setMenus(form.getMenus());
	}
	
	  public void sell(String menu, Starbucks starbucks) {
	      String[] menus = this.getMenus();
	      boolean isSell = false;
	      
	      for(int i = 0; i < menus.length; i++) {
	         if(menus[i].equals(menu)) {
	            isSell = true;
//	            starbucks -> 무료나눔행사 지점 아닌지
	            if(starbucks instanceof EventMarker) {
	               if(menu.equals("아메리카노")) {
	                  System.out.println("무료 행사 나눔중");
	                  break;
	               }
	            }
	            System.out.println("판매 완료");
	            break;
	         }else {
	            continue;
	         }
	      }
	      
	      if(!isSell) {
	         System.out.println("판매 준비중입니다...");
	      }
	   }
	   
	}


