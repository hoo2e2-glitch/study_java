package classTsak;

public class ClassTsak01 {
//	넷플릭스
//	애니메이션, 영화, 드라마
	
//	선택한 영화에 따라 다른 기능 구현
//	애니메이션 "자막지원"
//	영화 "4D 지원"
//	드라마 "굿즈 판매"
	
	public static void main(String[] args) {
		Netflix net = new Netflix();
		net.checkGenre(new Drama());
		net.checkGenre(new Animation());
		net.checkGenre(new Movie());
		
	}

}
