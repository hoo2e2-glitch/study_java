package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		
//		Thread1 thread_1 = new Thread1("?");
//		Thread1 thread2 = new Thread1("!");
		
//		단일 쓰레드 / 동기
//		thread_1.run();
//		멀티 쓰레드
//		thread2.start();
		
		Thread2 target1 = new Thread2();
		Thread2 target2 = new Thread2();
		
		Thread thread1 = new Thread(target1, "★");
		Thread thread2 = new Thread(target2, "○");
		
		thread1.start();
		thread2.start();

//		비동기에서는 순서를 원하는데로 할 순 없지만 내부에서 동기적인 흐름으로 바꾸면 가능
//		thread1.setPriority(1);
//		thread2.setPriority(10);
		
//		.join(): 내부에서 동기적인 흐름으로 바꾸면 가능
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("메인쓰레드");
	}
	

}
