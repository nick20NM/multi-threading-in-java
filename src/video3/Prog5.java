package video3;

class Thread5 extends Thread{

	public void run() {
		System.out.println("run method executed by "+Thread.currentThread().getName());
	}
	
}
public class Prog5 {

	public static void main(String[] args) {
		Thread t = new Thread(new Thread5());
		t.start();
		System.out.println("main method executed by "+Thread.currentThread().getName());
	}

}
