package methods;

public class MethodsTest9 {
	int total;
	public int mobiles() {
		int mi=500;
		int realme=1000;
	    total=mi+realme;
	   return total;
	 
	}
	public int electronics() {
		int tv=1000;
		int fan=2000;
		total=tv+fan;
		return total;
	}
	public int fashion() {
		int shirts=2000;
		int pants=3000;
		total=shirts+pants;
		return total;
	}
	
	public void finalbill() {
		int mobilebill=mobiles(); //1500
		int mobilediscount=discount(mobilebill,"mobiles");
		System.out.println("mobile discount amount::"+mobilediscount);
		int finalmobilebill=mobilebill-mobilediscount;
		System.out.println("final mobile bill::"+ finalmobilebill);
		int electronicsbill=electronics();
		int electronicsdiscount=discount(electronicsbill,"electronics");
		System.out.println("electronics discount amount::"+electronicsdiscount);
		int finalelectronicsbill=electronicsbill+electronicsdiscount;
		System.out.println("final electronics bill::"+ finalelectronicsbill);
		int fashionbill=fashion();
		int fashiondiscount=discount(fashionbill,"fashion");
		System.out.println("fashion discount amount::"+fashiondiscount);
		int finalfashionbill=fashionbill+fashiondiscount;
		System.out.println("final fashion bill"+ finalfashionbill);
		
		
		
	}
public int discount(int bill,String catg) {//1500,mobiles
	// mobiles=10%, electronics=20% fashion 30%
		int discountpercent=0;
		int discountamount=0;
		if(catg.equals("mobiles")) {
			discountpercent=10;
			discountamount=bill*discountpercent/100;
		}else if(catg.equals("electronics")) {
			discountpercent=20;
			discountamount=bill*discountpercent/100;
		}else if(catg.equals("fashion")) {
			discountpercent=30;
			discountamount=bill*discountpercent/100;
		}
		return discountamount;
	}
public int gst(int bill,String catg) {
	//mobiles gst-18%,electronics gst-15%,fashion gst-12%
	int gstpercentage=0;
	
	int originalbill=0;
	if(catg.equals("mobiles")) {
		gstpercentage=18;
		originalbill=bill*gstpercentage/100;
		
	}else if(catg.equals("electronics")) {
		gstpercentage=15;
		originalbill=bill*gstpercentage/100;
	}else if(catg.equals("fashion")) {
		gstpercentage=12;
		originalbill=bill*gstpercentage/100;
	}
	return originalbill;
}
public int originalbill() {

		int mobilebill = mobiles();
		int mobilediscount = discount(mobilebill,"mobiles");
		int finalmobilebill = mobilebill - mobilediscount;
		int gst = gst(finalmobilebill,"mobiles");
		int originalbill = finalmobilebill + gst;
		System.out.println("Original Bill :: " + originalbill);
		return originalbill;
	}
public int originalbill2() {
	int electronicsbill=electronics();
	int electronicsdiscount = discount(electronicsbill,"mobiles");
	int finalelectronicsbill = electronicsbill - electronicsdiscount;
	int gst = gst(finalelectronicsbill,"electronics");
	int originalbill2 = finalelectronicsbill + gst;
	System.out.println("Original Bill2 :: " + originalbill2);
	return originalbill2;
}
public int originalbill3() {
	int fashionbill=fashion();
	int fashiondiscount = discount(fashionbill,"mobiles");
	int finalfshionbill = fashionbill - fashiondiscount;
	int gst = gst(finalfshionbill,"electronics");
	int originalbill3 = finalfshionbill + gst;
	System.out.println("Original Bill3 :: " + originalbill3);
	return originalbill3;
}


public static void main(String[] args) {
	MethodsTest9 mt9=new MethodsTest9();
	mt9.finalbill();
	
	int gstmobiles = mt9.gst(1350,"mobiles");
	System.out.println("gst amount for mobiles :: " + gstmobiles);
	int gstelectronics=mt9.gst(2400,"electronics");
	System.out.println("gst amount for electronics::"+ gstelectronics);
	int gstfashion=mt9.gst(3500,"fashion");
	System.out.println("gst amount for electronics::"+ gstfashion);
	mt9.originalbill();
	mt9.originalbill2();
	mt9.originalbill3();
}
}
