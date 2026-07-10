package except;

public class ExceptionTest2 {
	public void test() {
		System.out.println("start.....");
		try {
		int i=10;
		int j=0;
		int k=i/j;
		System.out.println(k);
		
	
		}catch (ArithmeticException e) {
		e.printStackTrace();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}catch (RuntimeException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("end....");
	}
public static void main(String[] args) {
	ExceptionTest2 et2=new ExceptionTest2();
	et2.test();
}
}
