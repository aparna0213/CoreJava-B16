package variables;


public class Product {
	int id=10; // instance variable
	
	static String name="java";
			
	public static void main(String[] args) {
		Product p=new Product();//object
		System.out.println(p.id);
		double amt=45.67;  //local variable
		System.out.println(amt);
		System.out.println(name);// static variable
				
			}
	

}
