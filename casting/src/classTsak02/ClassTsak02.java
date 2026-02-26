package classTsak02;

public class ClassTsak02 {
//  게임 시스템
//  캐릭터 - 넷플릭스 는 몬스터를 사냥할 수 있다. .hunter
// 몬스터 - 장르
//  오크, 요정, 휴먼 - 영화
//  오크를 사냥하면 
//  "오크가 달려든다!"를 출력 +@
//  "가죽 얻는다"를 출력
  
//  요정을 사냥하면
//  "요정이 마법을 사용한다"를 출력 +@
//  "날개를 얻는다"를 출력
  
//  휴먼을 사냥하면
//  "휴먼이 숨는다"를 출력 +@
//  "갑옷을 얻는다"를 출력

	
	public static void main(String[] args) {
		Character cha = new Character();
		
		cha.gameStart();
		
		cha.addMonster(new Ork());
		cha.addMonster(new Fairy());
		cha.addMonster(new Human());
		
	}
}
