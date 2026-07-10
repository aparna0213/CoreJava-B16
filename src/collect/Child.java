package collect;

public class Child extends Parent {
	public void house() {
		System.out.println("cild house");
	}
	public void bike() {
		System.out.println("child bike");
	}
public static void main(String[] args) {
	Parent p=new Parent();
	p.house();
	p.land();
	System.out.println("============================");
	//p.bike(); not access child data
	Child c=new Child();
	c.house();// child can access both parent and child data
	c.bike();
	c.land();
	System.out.println("==============================");
	//we can create object for super class ref and sub class object
	//parent class ref=child class object
	//we cant access subclass specific methods
	Parent p1=new Child();
	p1.house();
	p1.land();
	//p1.bike(); 
	
	
	
}
}
