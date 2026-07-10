package oops;

public class shopping {//Overloading
	public void payment(int amount,String paymenttype) {
		System.out.println("amount::"+amount+" "+"paymenttype::"+paymenttype);
	}
	public void payment(int amount,String paymenttype,String upiid) {
		System.out.println("amount::"+amount+" "+"paymenttype::"+paymenttype+"upiid"+upiid);
	}
	public void payment(int amount,String paymenttype,long cardnum) {
		System.out.println("amount::"+amount+" "+"paymenttype::"+paymenttype+"cardnum"+cardnum);
	}
public static void main(String[] args) {
	shopping s=new  shopping();
	s.payment(500, "cash");
	s.payment(1000, "upi", "787675@icici");
	s.payment(2000, "card", 8878767655l);
	
}
}
// in method overloading we can use same method - diiferent parameters and we can also change positioning of parameters
//