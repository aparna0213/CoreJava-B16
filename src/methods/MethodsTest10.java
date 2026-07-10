package methods;

public class MethodsTest10 {
	String name="java"; // instance variable-heap memory
	static double amt=65.76; //static variable-method area
	int iid;
	
	public void test1() {
		System.out.println("instance mathod::");
		int id=20; // local variable-stack memory
		System.out.println(id);
		
	}
	public static void test2() {
		System.out.println("static method::");
		int iiid=10;
		System.out.println(iiid);
	}
	public void test3() {
		int iid=50; // local variable
		System.out.println(iid);	}
	public static void main(String[] args) {
		MethodsTest10 mt10=new MethodsTest10();
		mt10.test1();
		MethodsTest10.test2();
		mt10.test3();
		System.out.println(mt10.name);
	}
	

}
