package video4;

class Thread2 extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread " + i);
		}
	}

}

public class Prog2 {

	public static void main(String[] args) {
		Thread2 t = new Thread2();
		t.setPriority(10);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread " + i);
		}
	}

}
