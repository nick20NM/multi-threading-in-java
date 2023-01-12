package video2;

class Thread6 extends Thread{

	public void start() {
		super.start();
		System.out.println("start method");
	}

	public void run() {
		System.out.println("run method");
	}
	
}
public class Prog6 {

	public static void main(String[] args) {
		Thread6 t = new Thread6();
		t.start();
		System.out.println("main method");
	}

}
