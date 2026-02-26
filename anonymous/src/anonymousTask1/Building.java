package anonymousTask1;
//오픈
//역삼점
//- 아메리카노, 녹차라떼, 애플민트티
//
//신촌점
//- 아메리카노, 자몽허니블랙티, 자몽에이드
//
//
//1. 역삼점과 강남점은 아메리카노 무료행사 진행중
//2. 사용자가 sell() 메뉴를 판매하면 역삼점과 강남점의 아메리카노는 무료행사 진행중을 출력
//그 외 지점은 판매완료를 출력

// 다른거 만들기

public class Building {
	public static void main(String[] args) {
		Starbucks gananam = new Starbucks();
		Starbucks gamsil = new Starbucks();
		Starbucks yucksam = new Starbucks();
		Starbucks sinchon = new Starbucks();
		
			

		
		gananam.ra(new Form() {
			
			@Override
			public void sell() {
				System.out.println("무료행사");
			}
			
			@Override
			public String[] getMenus() {
				return new String[] {"커피", "아아"} ;
			}
		});
		
		gamsil.ra(new Form() {
			
			@Override
			public void sell() {
				System.out.println("판매완료");
				
			}
			
			@Override
			public String[] getMenus() {
				return new String[] {"에이드", "녹차"};
			}
		});
		
		yucksam.ra(new Form() {
			
			@Override
			public void sell() {
				System.out.println("무료행사");
				
			}
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "녹차라떼", "애플민트티"} ;
			}
		});
		
		sinchon.ra(new Form() {
			
			@Override
			public void sell() {
				System.out.println("판매완료");
				
			}
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "자몽허니블랙티", "자몽에이드"} ;
			}
		});
		
//		gananam.ra(new Form() {
//			
//			@Override
//			public String[] getMenus() {
//				return new String[] {"커피", "아아"} ;
//			}
//		});
		
//		gamsil.ra(new Form() {
//			
//			@Override
//			public String[] getMenus() {
//				return new String[] {"에이드", "녹차"};
//			}
//		});
		
		
		gananam.sell("에이드", gananam);
		yucksam.sell("아메리카노", yucksam);
		sinchon.sell("아메리카노", sinchon);
		gamsil.sell("디카페인 아메리카노", gamsil);

		
	}

}
