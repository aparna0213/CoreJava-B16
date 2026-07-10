package multi;

public class DeadLock {
public static void main(String[] args) {
	String lock1="charan";
	String lock2="arjun";
	Thread t1=new Thread(new Runnable() {
		
		@Override
		public void run() {
			synchronized(lock1) {
				System.out.println("t1-thread acquired lock1:"+lock1);
				synchronized(lock2) {
					System.out.println("t1-lock acquires lock2:"+lock2);
				}
			}
			// TODO Auto-generated method stub
			
		}
	});
	t1.start();
	Thread t2=new Thread(new Runnable() {
		
		@Override
		public void run() {
			synchronized(lock2) {
				System.out.println("t2- thread aquires lock2:"+lock2);
				synchronized(lock1){
					System.out.println("t2 -thraed aquires lock1:"+lock1);
				}
			}
			// TODO Auto-generated method stub
			
		}
	});
	t2.start();
}
}
