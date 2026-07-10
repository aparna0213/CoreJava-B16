package multi;

public class Zomato implements Runnable{
	// important point is runnable interface mainly use for multiple inheritance-interview quetion
	
	public void run() {
		
		try {
			order();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void order() throws InterruptedException {
		
		for(int i=1;i<15;i++) {
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("order id.."+Thread.currentThread().getId());
			
		}
	}
public static void main(String[] args) {
	Zomato z=new Zomato();
	Thread t1=new Thread(z);
	t1.start();
	Thread t2=new Thread(z);
	t2.start();
	//t2.start(); when we are trying to call same thread again it give you illeagal threadstate exception
	// dont call same threads because one thread already gone to dead state(compleats the run method)
	//thread life cycle
	//born or new -runnable - running - dead
	// object -t1.start -run()-(wait or sleep)-dead
}
}