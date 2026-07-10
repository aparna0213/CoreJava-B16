package oops;

public  final class FinalTest2 {
	final int id=10;
	final public void test() {
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

//final keyword 
// we can not access final keyword ,class,method in different class (within class also its giving error)
//final is final
//final we can not re- initialze,we can not ovrride,we can not extends inheritance