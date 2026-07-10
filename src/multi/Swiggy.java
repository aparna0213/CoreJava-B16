package multi;

public class Swiggy extends Thread{//class level lock swiggy
	@Override
	public void run() {
		order();
	}
	public static synchronized void order() {
		for(int i=1;i<15;i++) {
			System.out.println("Thread..."+Thread.currentThread().getId());
		}
	}
public static void main(String[] args) {
	Swiggy s1=new Swiggy();//object level lock-s1
	Thread t1=new Thread(s1);
	t1.start();
	Thread t2=new Thread(s1);
	t2.start();
	
	Swiggy s2=new Swiggy();//object level lock -s2
	Thread t3=new Thread(s2);
	t3.start();
	Thread t4=new Thread(s2);
	t4.start();
}
}
