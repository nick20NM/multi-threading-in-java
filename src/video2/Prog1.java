package video2;

class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread " + i);
		}
	}

}

public class Prog1 {

	public static void main(String[] args) {
		Thread1 t = new Thread1();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread " + i);
		}
	}

}
