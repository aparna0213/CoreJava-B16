package oops;

public class Blocks {
	{//instance blocks
		System.out.println("instance blocks");
	}
	public Blocks() {//constructor
		System.out.println("constructor");
	}
	public void m1() {//method
		System.out.println("m1 instance method");
	}
	 public static void m2() {// static method
		System.out.println("m2 static method");
	}
	static {
		 System.out.println("static blocks");
	 }
	
public static void main(String[] args) {
	Blocks b=new Blocks();
	b.m1();
	Blocks.m2();
}
}
// java will give first preference to static blocks ,instance blocks,constructor,methods
