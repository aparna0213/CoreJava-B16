package oops;

public class product {
	int id;
	String name;
	double price;
	public product() {
		System.out.println("zero args constructor");
	}
	public product(int i) {
		System.out.println("single args constructor");
		id=i;
	}
	public product(int i,String s) {
		System.out.println("2 args constructor");
		id=i;
		name=s;
		
	}
	public product(int i,String s,double d) {
		System.out.println("3 args constructor");
		id=i;
		name=s;
		price=d;
		
	}
public static void main(String[] args) {
	product p=new product();
	System.out.println(p.id);
	System.out.println(p.name);
	System.out.println(p.price);
	
	System.out.println("=============================");

	product p1=new product(10);
	System.out.println(p1.id);
	System.out.println(p1.name);
	System.out.println(p1.price);
	
	System.out.println("================================");
	
	product p2=new product(10,"mobile");
	System.out.println(p2.id);
	System.out.println(p2.name);
	System.out.println(p2.price);
	
	System.out.println("==================================");
	
	product p3=new product(10,"mobile",6564.876);
	System.out.println(p3.id);
	System.out.println(p3.name);
	System.out.println(p3.price);
	
	
}
}
