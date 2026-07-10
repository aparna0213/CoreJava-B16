package except;

public class Customer {
	int balance=1000;
	public void fundstransfer(int bill) {
		if(balance>bill) {
			System.out.println("transaction success");
		}else {
			System.out.println("transaction failed");
			throw new inSufficienFundsException("add funds");
		}
	}
public static void main(String[] args) {
	Customer c=new Customer();
	c.fundstransfer(3600);
}
}
