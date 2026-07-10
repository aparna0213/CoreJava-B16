package multi;

public class Uber extends Thread {
	public void run() {
		order();
	}
	public void order() {
		synchronized (this) {//adding synchronized block to single loop(in mutex we are taken "this")
			
		
		for(int i=1;i<15;i++) {
			System.out.println("loop-1 Thread"+Thread.currentThread().getId());
		}
		}
		for(int i=1;i<15;i++) {
			System.out.println("loop-2 Thread"+Thread.currentThread().getId());
		}
	}
	
public static void main(String[] args) {
	Uber u=new Uber();
	Thread t1=new Thread(u);
	t1.start();
	Thread t2=new Thread(u);
	t2.start();
	
	Uber u1=new Uber();
	Thread t3=new Thread(u1);
	t3.start();
	Thread t4=new Thread(u1);
	t4.start();
	
}
}
