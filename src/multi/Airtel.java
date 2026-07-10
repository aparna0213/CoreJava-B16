package multi;

public class Airtel extends Thread{//extends thread class
	@Override
	public void run() {//override  the run method
		for(int i=1;i<15;i++) {
			System.out.println("run method..."+Thread.currentThread().getId());
			
		}
		//thread is a class
		//single thread-synchronous-performance low -low failure chances-thread safe
		// performing multiple tasks at a time is multi threading-asynchronous-performance high- high failure chances
	}
	
public static void main(String[] args) {//class object shouid be passed through thread class
	Airtel a=new Airtel();//create class object 
	Thread t1=new Thread(a);//-16// create a thread object
	t1.start();// start the thread using start method
	Thread t2=new Thread(a);//-17
	t2.start();
	Thread t3=new Thread(a);
	t3.start();
	Thread t4=new Thread(a);
	t4.start();
}
}
