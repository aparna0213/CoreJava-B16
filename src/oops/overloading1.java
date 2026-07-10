package oops;

public class overloading1 {
	public void test() {
		System.out.println("zero arguments");
	}
	public void test(int id) {
		System.out.println("single arguments"+id);
	}
	public void test(int id,String name) {
		System.out.println("two arguments.."+id+"  "+name);
	}
public static void main(String[] args) {
	overloading1 ov1=new overloading1();
	ov1.test();
	ov1.test(10);
	ov1.test(20, "java");
	
	
}
}
//polymorphism  is two types
//1.comepiletime polymorphism--overloading -static
//2.runtime polymorphism--overriding-dynamic

//in overloading-- method name is same and paremeters are different