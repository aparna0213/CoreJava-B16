package methods;

public class MethodsTest2 {
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
	public int laptops() {
	int	hp=80;
	int lenova=100;
	int total=hp+lenova;
	return total;
	}
	public int vegetables() {
		int tomato=7;
		int onions=10;
		int total=tomato+onions;
		return total;
		
	}
	public int watches() {
		int titan=60;
		int fastrac=80;
		int total=titan+fastrac;
		return total;
	}
	public int rings() {
		int goldrings=506;
		int silverrings=43;
		int total=goldrings+silverrings;
		return total;
		
	}
	public int bottles() {
		int plastic =545;
		int steel=675;
		int total=plastic+steel;
		return total;
		
	}
	
	public static void main(String[] args) {
		
	MethodsTest2 mt2=new MethodsTest2();
	
	int mobilebill=mt2.mobiles(); 
	System.out.println("mobile bill::"+mobilebill);
	
	int electronicbill=mt2.electronics();
	System.out.println("electronic bill::"+electronicbill);
	
	int laptopsbill=mt2.laptops();
	System.out.println("laptops bill::"+laptopsbill);
	
	int vegetablebill=mt2.vegetables();
	System.out.println("vegetable bill::"+vegetablebill);
	
	int watchbill=mt2.watches();
	System.out.println("watch bill::"+watchbill);
	
	int ringsbill =mt2.rings();
	System.out.println("rings bill::"+ringsbill);
	
	int bottlesbill=mt2.bottles();
	System.out.println("bottles bill::"+bottlesbill);
	
	int totalbill=mobilebill+electronicbill+laptopsbill+vegetablebill+watchbill+ringsbill+bottlesbill;
	System.out.println("Total Bill::"+totalbill);
		}
	
	}	
	
	


