package video3;

class Runnable1 implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread " + i);
		}
	}

}

public class Prog1 {

	public static void main(String[] args) {
//		Runnable1 r = new Runnable1();
//		Thread t = new Thread(r);
//		t.start();
		Thread t = new Thread(new Runnable1());
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread " + i);
		}
	}

}
