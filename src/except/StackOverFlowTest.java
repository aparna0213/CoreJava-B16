package except;

public class StackOverFlowTest {
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	public void m3() {
		System.out.println("m3 method");
		//m1();//we are getting stackoverflowerror
	}
public static void main(String[] args) {
	StackOverFlowTest soft=new StackOverFlowTest();
	soft.m1();
	soft.m2();
	soft.m3();
}
}
