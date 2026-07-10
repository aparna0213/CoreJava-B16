package methods;

public class MethodsTest4 {
	public byte id() {
		return 123;
	}
	public short iid() {
		return 1234;
	}
	public String name() {
		return "java";
				
	}
	public void nothing() {
		System.out.println("nothing method");
		// void is return type it is no need to return anything
	}
	public int mobile() {
		System.out.println("mobile");
		return 353465656;
	}
	public void pan() {
		
		System.out.println("pan");
		return ;
		//no need of return statement in void return type
	}
	public void aadhar() {
		System.out.println("aadhar");
	}
	public void laptopnum() {
		System.out.println("laptopnum");
		return;
	}

   public static void main(String[] args) {
	MethodsTest4 mt4=new MethodsTest4();
	byte id=mt4.id();
	System.out.println(id);
	short iid=mt4.iid();
	System.out.println(iid);
	String name=mt4.name();
	System.out.println(name);
	mt4.nothing();
	int mobile=mt4.mobile();
	System.out.println(mobile);
	mt4.pan();
	mt4.aadhar();
	mt4.laptopnum();
	
}
}
