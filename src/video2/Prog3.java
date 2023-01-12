package video2;

class Thread3 extends Thread{

	public void run() {
		System.out.println("no-arg run()");
	}
	
	public void run(int i) {
		System.out.println("int-arg run()");
	}
	
}
public class Prog3 {

	public static void main(String[] args) {
		Thread3 t = new Thread3();
		t.start();
	}

}
