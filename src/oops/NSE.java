package oops;

public  abstract class NSE {//abstract
	public void Stocksinfo() {
		System.out.println("Infosys,hcl,wipro,tcs,birlagroups,reliance");
	}
	public void ipo() {
		System.out.println("swiggy,zomato,blinkit");
	}
	public void holidays() {
		System.out.println("aug 15,oct 2,jan 26");
	}
	public abstract void Brokaragecharges();
	
	public NSE() {//we can create constructor
		System.out.println("constructor...");
	}
	{//we can create instance blocks
		System.out.println("instance blocks..");
	}
	
	static{//we can create static blocks
		System.out.println("static blocks..");
	}
	
//public static void main(String[] args) {//we can not create object for abstract class
//	NSE n=new NSE();}// we can call abstract methods by extends with another class
}
