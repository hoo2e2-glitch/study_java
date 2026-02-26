package practice;

class Parent {
    public void show() {
        System.out.print("부모");
    }
}
class Child extends Parent {
    public void show() {
        super.show();
        System.out.print("자식");
    }
}



public class Task04 {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.show();
		
		
	}
}

