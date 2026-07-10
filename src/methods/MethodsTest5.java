package methods;

public class MethodsTest5 {
	public int mobiles() {
		int mi=699;
		int realme=766;
		int total=mi+realme;
		return total;
	}
	public int electronics() {
		int tv=767;
		int fan=766;
		int total=tv+fan;
		return total;
	}
	public void finalbill() {
		System.out.println("this is final bill method" );
		int mobilebill=mobiles();
		int electronicbill=electronics();
		int finalbill=mobilebill+electronicbill;
		System.out.println("this is final bill::"+finalbill);
	}
	public static void main(String[] args) {
		MethodsTest5 mt5= new MethodsTest5();
		mt5.finalbill();
		
	}

}
