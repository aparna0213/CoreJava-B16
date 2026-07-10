package methods;

public class MethodsTest7 {
	public void test1() {
		System.out.println("zero parameter");
	}
	public void test2(int id) {
		System.out.println("single parameter::"+id);
	}
	public void test3(int id,String name) {
		System.out.println("two parameters ::" +id  +name);
	}
	public static void main(String[] args) {
		MethodsTest7 mt7=new MethodsTest7();
		mt7.test1();
		mt7.test2(20);
		mt7.test3(10,"java");


}
}