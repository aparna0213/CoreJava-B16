package variables;

public class DataTypes6 {
	int id=10; // initialization
	int i;  //declaration
	public void test() {
		System.out.println(id);
		System.out.println(i);
		
		id=30;  //re-initialization
		System.out.println(id);
		
		i=70;   
		System.out.println(i);
		
		id=55;  //re-initializtion
		System.out.println(id);
		
		i=43;
		System.out.println(i);
		
		String name="java";
		System.out.println(name);
		
		name="tejajava";
		System.out.println("tejajava");
	}
public static void main(String[] args) {
	DataTypes6 dt6=new DataTypes6();
	dt6.test();
	
}
}
