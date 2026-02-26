package practice;

class AA {
    public void paint() {
        System.out.print("1번 A");
        draw();
    }
    public void draw() {
        System.out.print("B");
    }
}
class BB extends AA {
    public void draw() {
        System.out.print("2번 C");
    }
}



public class Task03 {
	public static void main(String[] args) {
		BB b = new BB();
		b.paint();
		
		
		
	}

}
