package except;

public class ThrowsTest {
	public void  m1() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("m1 method");
	}
	public void m2() {
		System.out.println("m2 method");
		m1();// when we keep cursar on redline it shows throws declaration and surrounded with try catch blocks
		//when we choose throws declaration it will give interrupted exception beside method
		// when we click on try catch blocks exception handled by try catch blocks
	}
	public void m3() {
		System.out.println("m3 method");
		m2();
	}
public static void main(String[] args) {
	ThrowsTest tt=new ThrowsTest();
	tt.m1();
	tt.m2();
	tt.m3();
}
	
}


