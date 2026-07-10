package oops;

public class employee {//constructor example
	int id;
	String name;
	long salary;
	double age;
	
	//java will provide zero args constructor or default constructor
	//if we create argument constructor then java default constructor will override
	//constructor will overload but not override(constructor name are different parent and child)
	public employee() {
		System.out.println("zero args constructor");
	}
	
	
public employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


public employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

public employee(int id, String name, long salary, double age) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.age = age;
}


public static void main(String[] args) {
	employee ee=new employee();
	System.out.println(ee.id);
	System.out.println(ee.name);
	
	employee e=new employee();
	System.out.println(e.id);
	System.out.println(e.name);
	System.out.println(e.salary);
	
	System.out.println("======================");
	
	employee e1=new employee(108,"aparna",100000) ;
	System.out.println(e1.id);
	System.out.println(e1.name);
	System.out.println(e1.salary);
	
	System.out.println("==================");
	
	employee e2=new employee(108,"aparna",100000,27.3);
	System.out.println(e2.id);
	System.out.println(e2.name);
	System.out.println(e2.salary);
	System.out.println(e2.age);
	
	}
}

