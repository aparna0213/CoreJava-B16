package methods;

public class MethodsTest8 {
	
	int total;
	int finalbill;
	int discountprice;
	
	public int mobiles(int discountpercentage) {
		int mi=500;
		int realme=700;
	     total=mi+realme;
		discountprice=total*discountpercentage/100;
	 finalbill=total-discountprice;
		return finalbill;
	}
	public int electronics(int discountpercentage) {
		int tv=500;
		int fan=600;
		 total=tv+fan;
		 discountprice=total*discountpercentage/100;
		 finalbill=total-discountprice;
		return finalbill;
	}
	public int watches(int discountpercentage) {
		int titan=400;
		int armani=600;
		total=titan+armani;
	    discountprice=total*discountpercentage/100;
		finalbill=total-discountprice;
		return finalbill;
	}
	public void totalbill() {
		int mobilebill=mobiles(10);
		System.out.println("finalbill::"+mobilebill);
		int electronicsbill=electronics(20);
		System.out.println("finalbill1::"+electronicsbill);
		int watchbill=watches(10);
		System.out.println("finalbill2::"+watchbill);
		
	}
	public static void main(String[] args) {
		MethodsTest8 mt8=new MethodsTest8();
		mt8.totalbill();
	}

}
