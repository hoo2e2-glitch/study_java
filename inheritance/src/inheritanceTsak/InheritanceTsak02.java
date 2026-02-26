package inheritanceTsak;

// 부모클래스
class AA {
	public void paint() {
		System.out.print("A");
		draw();
	}
	public void draw() {
		System.out.print("B");
	}
	
}

// 상속받은 자식클래스
class BB extends AA {
	public void paint() {
		super.draw(); // 강제로 부모의 draw 강제호출 -> super - AA(부모클래스)
		System.out.print("C");
		this.draw(); // BB draw() 호출 / this - 자신호출
	}
	public void draw() {
		System.out.print("D");
	}
}


public class InheritanceTsak02 {

	public static void main(String[] args) {
		BB b = new BB(); // 객체화
		
//		b 자식
		b.paint(); // BCD
		b.draw(); // D
	}
}
