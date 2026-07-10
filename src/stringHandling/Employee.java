package stringHandling;
//final class
public final class Employee {
	//private final variables
	//while declaration itself we have to give final variables otherwise it will give errors
	//final class we cant extented
	//final variable we cant re initialize
	//in string we are making this immutable for making class final and private final variables
	//String  is imutable class we cant not modify the data
	private  final int id;
	private final String name;
	private final int salary;
	// to initialize the data-constructor
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	//to read the data=getters
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		Employee e=new Employee(101, "aparna", 500000);
		//System.out.println(e.id+" "+e.name+" "+e.salary);
		System.out.println(e);
		//e.setid();
		//e.id=202;
		//e.name="kumar";
		Employee e1=new Employee(201, "aparna", 500000);
		System.out.println(e1.id+" "+e1.name+" "+e1.salary);

	}

}
