package video2;

class Thread5 extends Thread{

	public void start() {
		System.out.println("start method");
	}

	public void run() {
		System.out.println("run method");
	}
	
}
public class Prog5 {

	public static void main(String[] args) {
		Thread5 t = new Thread5();
		t.start();
		System.out.println("main method");
	}

}
