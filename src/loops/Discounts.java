package loops;

public class Discounts {
	public void shopping() {
	int bill=50000;
	int discPercentage=10;
	int Discount=(bill*discPercentage)/100;
	int finalbill=bill-Discount;
	System.out.println("Discountprice::"+ Discount);
	System.out.println("finalbill::"+finalbill);
	if(bill<1000) {
		System.out.println("no discounts on this bill");	
	}else if(bill>=1000 && bill<=5000) {
		System.out.println("flat 10% discount on this bill");
	}else if(bill>=5000 && bill<=10000) {
		System.out.println("flat 20% discount on this bill");
	}else if(bill>=10000 && bill<=25000) {
		System.out.println("flat 30% discount on this bill");
	}else if (bill>=25000) {
		System.out.println("flat 35% discount on this bill");
	}
}	
	
	public static void main(String[] args) {
		Discounts dts=new Discounts();
		dts.shopping();
	}

}
