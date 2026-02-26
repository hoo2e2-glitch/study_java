package classTsak;

public class Netflix extends Genre {
	
	// up casting
	
	public void checkGenre(Genre genre) {
		if(genre instanceof Animation) {
			Animation animation  = (Animation)genre;
			animation.showSubTitle();
			
		}else if (genre instanceof Drama) {
			Drama drama = (Drama)genre;
			drama.sellGoods();
			
		}else if (genre instanceof Movie) {
			Movie movie = (Movie)genre;
			movie.shakeChair();
			
		}
		
	}

	
	
//	넷플릭스
//	애니메이션, 영화, 드라마
	
//	선택한 영화에 따라 다른 기능 구현
//	애니메이션 "자막지원"
//	영화 "4D 지원"
//	드라마 "굿즈 판매"
}
