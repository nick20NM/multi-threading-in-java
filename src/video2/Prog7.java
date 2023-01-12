package video2;

class Thread7 extends Thread{

	public void run() {
		System.out.println("run method");
	}
	
}
public class Prog7 {

	public static void main(String[] args) {
		Thread6 t = new Thread6();
		t.start();
		System.out.println("main method");
		t.start();
	}

}
