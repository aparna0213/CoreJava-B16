package except;

public class ExceptionTest1 {
	//exceptions are 2 types
	//compiletime-exceptions/checked exceptions-inturrupt
	//runtime exceptions/un-checked exceptions-arithematic,nullpointer,numberformate,arrayindexoutofbounds
	
	public void arithematic() {
		//
		System.out.println("arithematic start...");//runtime exception
		try {
		int i=100;
		int j=0;
		int k=i/j;//we get infinity value
		System.out.println(k);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			}
		System.out.println("arithematic exception end...");
		}
	//if we are trying to perform any operations with null value we get nullpointer exception
	public void nullpointer() {
		System.out.println("null pointer start..");
		try {
		int i=10;
		Integer j=null;
		int k=i+j;
		System.out.println(k);
		
	}catch (NullPointerException e) {// fixing the problem
		e.printStackTrace();
	}
		System.out.println("null pointer end..");
		}
	public void numberformat() {
		System.out.println("numberformat start..");
		try {
		String val="123a";
		Integer i=Integer.valueOf(val);
		System.out.println(i);
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("numberformat end..");
	}
	public void interrupt() {//compiletime exception
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);//it sleeps for particular time
			} catch (InterruptedException e) {//select surrounded by try catch blocks after getting error
				e.printStackTrace();
			}
		}
	}
	                  
public static void main(String[] args) {
	ExceptionTest1 et1=new ExceptionTest1();
	et1.arithematic();
	et1.nullpointer();
	et1.numberformat();
	et1.interrupt();
	
	
}
}
