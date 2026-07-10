package multi;

public class Customer {
	int bankBal=2000;
	public synchronized void withdraw(String user,int withdrawamt) throws InterruptedException {
		System.out.println("welcome to withdraw::"+user);
		if(bankBal<withdrawamt) {
			System.out.println("sorry sir ..we dont have enough balance");
			wait();
		}
		bankBal=bankBal-withdrawamt;
		System.out.println("succesfully withdraw amt..+user"+"withdraw amt.."+withdrawamt);
	}
	public synchronized void deposite(String user,int depositeamt) {
		System.out.println("welcome to deposite::"+user);
		bankBal=bankBal+depositeamt;
		System.out.println("succesfully deposite.."+user+"deposite amt.."+depositeamt);
		System.out.println("notiying...");
		notify();
		notifyAll();
	}

}
