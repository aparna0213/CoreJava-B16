package except;

public class FinallyTest {
	public void m1() {
		try {
		int i=100;
		int j=2;
		int k=i/j;
		System.out.println(k);
		System.out.println("try block");//when exceptions came in try-block try-block will not execute ,then catch and finally block execute
	}catch (Exception e) {// no exceptions in try block ,code will execute from try-block 
		e.printStackTrace();
		System.out.println("catch block");
	}finally {// code can contain one try block and many catch blocks and one final block
		//finally block must execute, if we want to print necessary code then we will write in finally block
		System.out.println("finally block");//if any exceptions came  or not then finally block will execute
	}
	}
public static void main(String[] args) {
	FinallyTest ft=new FinallyTest();
	ft.m1();
}
}
