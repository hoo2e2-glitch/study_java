package anonymousTest;

// 클래스
public class AnonymousTest {
	public static void main(String[] args) {
		
	
	// 인터페이스 객체화
	Study study = new Study() { // *익명* 내부클래스 - 중괄호 앞에 이름없음, 클래스 내에서 일회성
		
		@Override
		public void setTopic(String topic) { // 메서드 선언
			System.out.println("주제: " + topic);
			}
		};
		
		study.setTopic("아아");	
		
	}


}

