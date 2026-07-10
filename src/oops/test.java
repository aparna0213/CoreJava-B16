package oops;

public class test extends test2 {
	int id;//declarartion
	int i=15;//initialization
	public void m1() {
		System.out.println(id);
		id=20;//re-initialization
		System.out.println(id);
		id=30;//re-initialization
		System.out.println(id);
		int i=20;//local variables
		System.out.println(i);
		System.out.println(this.i);//this keyword
		System.out.println(super.i);//super keyword
		System.out.println(super.id);
		System.out.println(k);
	}
public static void main(String[] args) {
	test t=new test();
	t.m1();
}
}
//this keyword=when instance variable and local variable is same then java will give first priority to local variable
// but we need to call instance variable then we have to use "this keyword"."


//super keyword== when we want to use parent class data in child class while using extends
// we want to access parent call variable or data in child class wee must use "super keyword".