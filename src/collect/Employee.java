package collect;

public class Employee {
	int id;
	String name;
	int salary;
	//public Employee(int id, String name, int salary) {// no need of constructor
	//	super();
	//	this.id = id;
	//	this.name = name;
		//this.salary = salary;
	//}
	@Override// toString() is used to  print data when output giving variables address
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.id=101;
		e1.name="aparna";
		e1.salary=50000;
		System.out.println(e1);
		
		Employee e2=new Employee();//object t o object copying is "shallow copy"
		e2=e1;
		System.out.println("e2 ref..."+e2);
		
		Employee e3=new Employee();//variable to variable copying is "deep copy"
		e3.id=e1.id;
		e3.name=e1.name;
		e3.salary=e1.salary;
		System.out.println("e3 ref..."+e3);
		
		
		
	}

}
