package oops;

public class overloading3 {
	public void test(int id, String name) {
		System.out.println("int::"+id+" "+name);
	}
	public void test(String name,int id) {
		System.out.println("String::"+name+" "+id);
	}
public static void main(String[] args) {
	overloading3 ol3=new overloading3();
	ol3.test(10, "java");
	ol3.test("java", 20);
}

}
//same methods same parameters different places(we can change parameters places)