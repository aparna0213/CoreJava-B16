package methods;

public class MethodsTest3 {
	public int mobiles() {
		int mi=500;
		int realme=600;
		int total=mi+realme;
		return total;
		
	}
	public int electronics() {
		int fridge=50;
		int ac=70;
		int total=fridge+ac;
		return total;
	}
	public int watches() {
		int titan=586;
		int armaniexchange=776;
		int total=titan+armaniexchange;
		return total;
	}
	public int rings() {
		int goldrings=766;
		int platinumrings=676;
		int totalrings=goldrings+platinumrings;
		return totalrings;
	}
	public int totalbill() {
		//MethodsTest3 mt3=new MethodsTest3(); in a custom method we dont need object 
		int mobilebill=mobiles();
		int electronicbill=electronics();
		int totalbill=mobilebill+electronicbill;
		return totalbill;
	}
	public int totalbill1() {
		int watchbill=watches();
		int ringsbill=rings();
		int totalbill1=watchbill+ringsbill;
		return totalbill1;
		
	}
public static void main(String[] args) {
	MethodsTest3 mt3=new MethodsTest3();
	
	int finalbill=mt3.totalbill();
	System.out.println(finalbill);
	
	int finalbill2=mt3.totalbill1();
	System.out.println(finalbill2);
	
	int fullbill=finalbill+finalbill2;
	System.out.println(fullbill);
	
}
	
}
