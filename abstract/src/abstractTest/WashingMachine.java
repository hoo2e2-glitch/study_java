package abstractTest;

public class WashingMachine extends Electronics{
//	구현한다

	@Override
	public void off() {
		System.out.println("음성인식으로 끔");
	}
	@Override
	public void on() {
		System.out.println("음성인식으로 켬");
			
	}

}
