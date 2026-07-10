package modifiers1;

public class A {
	
	protected int id=10;
	protected void test() {
		System.out.println("A class test method");
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.test();
		System.out.println(a.id);
	}

}
