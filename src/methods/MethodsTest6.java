package methods;

public class MethodsTest6 {
	int total;
	public int mobiles() {
		int mi=50;
		int realme=60;
		int total=mi+realme;
		return total;
	}
	public int electronics() {
		int tv=55;
		int fan=80;
		int total=tv+fan;
		return total;
	}
	public int watches() {
		int titan=70;
		int fastrac=60;
		int total=titan+fastrac;
		return total;
	}
	public int rings() {
		int goldrings=40;
		int silverrings=30;
		int total=goldrings+silverrings;
		return total;
		
	}
	public int finalbill() {
		int mobilebill=mobiles();
		int electronicsbill=electronics();
		int finalbill=mobilebill+electronicsbill;
		System.out.println(finalbill);
		return finalbill;
	}
	public int finalbill1() {
		int watchesbill=watches();
		int ringsbill=rings();
		int total=watchesbill+ringsbill;
		System.out.println(total);
		return total;
		
	}
	public void fullbill() {
		int finalbill=finalbill();
		int finalbill1=finalbill1();
		int	fullbill=finalbill+finalbill1;
	    System.out.println(fullbill);
	}
	public static void main(String[] args) {
		MethodsTest6 mt6=new MethodsTest6();//object  classname ref=new constructor();
		mt6.finalbill();
		mt6.finalbill1();
		mt6.fullbill();
	}

}
