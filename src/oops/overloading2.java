package oops;

public class overloading2 {
	public void test(int id) {
		System.out.println("single parameter "+id);
	}
	public void test(double amt) {
		System.out.println("double parametaer"+amt);
	}
	public void test(String name) {
		System.out.println(" String parameter.." +name);
	}
public static void main(String[] args) {
	overloading2 ol2=new overloading2();
		ol2.test(52.2);
		ol2.test(30);
		ol2.test( "java");
	}
}
//in overloading method name is same but we can change parameters (datatypes are diifferent)
