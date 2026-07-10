package oops;

public  class FinalTest1 extends FinalTest2 {
	int id=10;
	@Override
	public void test() {
		System.out.println("test1 method");
		System.out.println("id value::"+id);
		id=30;
		System.out.println("id::"+id);
	}
public static void main(String[] args) {
	FinalTest1 ft1=new FinalTest1();
	ft1.test();
	System.out.println(ft1.id);
}
}
