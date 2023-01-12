package video3;

class Runnable2 implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread " + i);
		}
	}

}

public class Prog2 {

	public static void main(String[] args) {
		Runnable2 r = new Runnable2();
		Thread t1 = new Thread();
		Thread t2 = new Thread(r);
		
		// case-1
//		t1.start();
		
		// case-2
//		t1.run();
		
		// case-3
		t2.start();
		
		// case-4
//		t2.run();
		
		// case-5
//		r.start();
		
		//case-6
//		r.run();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread " + i);
		}
	}

}
