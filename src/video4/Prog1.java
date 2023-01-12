package video4;

class Thread1 extends Thread{
	
}
public class Prog1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(18);
		Thread.currentThread().setPriority(8);
		Thread1 t = new Thread1();
		System.out.println(t.getPriority());
	}

}
