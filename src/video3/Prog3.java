package video3;

class Thread3 extends Thread {

	public void run() {
		System.out.println("child thread");
	}

}

public class Prog3 {

	public static void main(String[] args) {
//		Thread3 t = new Thread3();
//		Thread t1 = new Thread(t);
//		t1.start();
		Thread t = new Thread(new Thread3());
		t.start();
		System.out.println("main thread");
	}

}
