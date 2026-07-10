package except;

public class EceptionTest3 {
	public void test() {
		try {
			int i=100;
			int j=10;
			int k=i/j;
			System.out.println(k);
			System.out.println("try block....");
			
}catch (Exception e) {
	System.out.println("catch block....");
	e.printStackTrace();
	
}finally {
	System.out.println("finally block...");
	System.out.println("========================");
}
		
	}
	
	public int test1() {
		try {
			int i=100;
			int j=0;
			int k=i/j;
			System.out.println(k);
			System.out.println("try block....");
			
			return 10;
}catch (Exception e) {
	System.out.println("catch block....");
	e.printStackTrace();
	
	return 20;
}finally {
	System.out.println("finally block...");
	return 30;
	
}
	
		
	}
public static void main(String[] args) {
	EceptionTest3 et3=new EceptionTest3();
	et3.test();
	System.out.println(et3.test1());// when return statement gave we have to call this way otherwise return value not printing
	
	//et3.test1(); wrong approch
}
	
	
}

