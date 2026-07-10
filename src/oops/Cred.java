package oops;

public class Cred extends BillDesk {

	public void upipay() {
		System.out.println("cred upipay");
	}
	public void shopping() {
		System.out.println("cred shopping");
	}
	public void creditscore() {
		System.out.println("credit score");
	}
public static void main(String[] args) {
	Cred c=new Cred();
	c.upipay();
	c.creditscore();
	c.shopping();
	c.paymentprocess();
	
}
}
