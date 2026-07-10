package multi;

public class anonumusTest {
	public static void main2(String[] args) {//we cant write object for interface
		Runnable r1=new Runnable() {//anonumus inner type method
			@Override
			public void run() {
				for (int i=1;i<15;i++) {
					System.out.println("Thread:: "+Thread.currentThread().getId());
				}
			}//inner type
		};
		r1.run();
	}
	public static void main(String[] args) {
		Thread t=new Thread(new Runnable() {//anonumus inner type method
			@Override
			public void run() {
				for(int i=1;i<15;i++) {
					System.out.println("Thread::"+Thread.currentThread().getId());
				}
			}
		});
		t.start();
		
	}

}
