package video3;

class Thread1 extends Thread{
	
}
public class Prog4 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread t = new Thread();
		System.out.println(t.getName());
		Thread.currentThread().setName("TONY STARK");
		System.out.println(Thread.currentThread().getName());
//		System.out.println(10/0);
	}

}
