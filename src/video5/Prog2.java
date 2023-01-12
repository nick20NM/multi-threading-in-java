package video5;

class Thread2 extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
		}
	}

}

public class Prog2 {

	public static void main(String[] args) throws InterruptedException {
		Thread2 t = new Thread2();
		t.start();
//		t.join();
		t.join(10000);
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread " + i);
		}
	}

}
