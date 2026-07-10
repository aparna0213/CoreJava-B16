package oops;

public class Hdfc extends Cred{
	public void moneytransfer() {
		System.out.println("hdfc money transfer");
	}
	@Override
	public void upipay() {
		System.out.println("hdfc upipay");
	}
	public void cheques() {
		System.out.println("hdfc chesques");
	}
	public static void main(String[] args) {
		Hdfc h=new Hdfc();
		h.moneytransfer();
		h.upipay();
		h.cheques();
		h.shopping();
		h.creditscore();
		h.paymentprocess();
	}

}
