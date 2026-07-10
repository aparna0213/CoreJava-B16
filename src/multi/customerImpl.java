package multi;

public class customerImpl {
	public static void main(String[] args) {
		Customer c1=new Customer();
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					c1.withdraw("user-1", 15000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// TODO Auto-generated method stub
				
			}
		});
		t1.start();
		Thread t2=new Thread(new Runnable() {
			@Override
			public void run() {
				c1.deposite("user-2", 30000);
			}
		});
		t2.start();
		Thread t3=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					c1.withdraw("user-3", 15000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t3.start();
	}

}
