package variables;

public class DataTypes3 {
	// variables are 3 types
	//1.local  2. instance  3. static
	//local variables are in method inside
	//instance variables are in method outside or class inside
	
	int id=123;
	long mobile=766565L;
	char grade='a';
	float miles=5.32f;
	boolean areyouindian=true;
	String name="TejaIT";
	
	public static void main(String[] args) {

	 //classname ref =new constructor -with a classname
		DataTypes3 dt3=new DataTypes3(); // object creation
		System.out.println(dt3.id);
		System.out.println(dt3.mobile);
		System.out.println(dt3.grade);
		System.out.println(dt3.miles);
		System.out.println(dt3.areyouindian);
		System.out.println(dt3.name);
		
		
		
	}

}
