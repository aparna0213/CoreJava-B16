package methods;

public class MethodsTest1 {
	//custom method
	public byte id() {
		return 123;	
	}
	public byte schoolid() {
		return 24;
	}
	public short num() {
		return 1234;
	}
	public short schoolnum() {
		return 2345;
	}
	public int mobile() {
		return 12345;
	}
	public int schoolmobile() {
		return 23456789;
	}
	public long pan() {
		return 123456;
		
	}
	public long schoolpan() {
		return 4543434;
	}
	public float weight() {
		return 58.5f;
	}
	public float schoolsize() {
		return 5746.7f;
	}
	public double height() {
		return 150;
	}
	public double schoolheight() {
		return 6554;
	}
	public boolean areyouindian() {
		return true;
	}
	
	public char name() {
		return 'A';
	}
	public String surname() {
		return "pasupuleti";
	}
public static void main(String[] args) {
	
	MethodsTest1 mt1=new MethodsTest1(); //object
	
	byte idval=mt1.id();
	System.out.println(idval);
	
	short numval=mt1.num();
	System.out.println(numval);
	
	int mobileval=mt1.mobile();
	System.out.println(mobileval);
	
	long panval=mt1.pan();
	System.out.println(panval);
	
	float weightval=mt1.weight();
	System.out.println(weightval);
	
	double heightval=mt1.height();
	System.out.println(heightval);
	
	boolean areyouindian=mt1.areyouindian();
	System.out.println(areyouindian);
	
	char name=mt1.name();
	System.out.println(name);
	
	
	String surname=mt1.surname();
	System.out.println(surname);
	
	byte schoolid=mt1.schoolid();
	System.out.println(schoolid);
		
	short schoolnum=mt1.schoolnum();
	System.out.println(schoolnum);
	
	
	int schoolmobile=mt1.schoolmobile();
	System.out.println(schoolmobile);
	
	long schoolpan=mt1.schoolpan();
	System.out.println(schoolpan);
	
	float schoolsize=mt1.schoolsize();
	System.out.println(schoolsize);
	
	double schoolheight=mt1.schoolheight();
	System.out.println(schoolheight);
		
		
	
}
	
}
