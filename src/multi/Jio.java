package multi;

public class Jio extends Thread {//t1-21  t2-22  t3-23
	public synchronized void run() {
		//synchronized allows only one thread at a time
		for(int i=1;i<15;i++) {
			System.out.println("thread ID.."+Thread.currentThread().getId());
		}
		
	}
public static void main(String[] args) {
	Jio j1=new Jio();
	Thread t1=new Thread(j1);
	t1.start();
	Thread t2=new Thread(j1);
	t2.start();
	Thread t3=new Thread(j1);
	t3.start();
}
}
