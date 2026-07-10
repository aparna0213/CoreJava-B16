package loops;

public class ForTest {
	//for loop
	//initialization     condition     increment/decrement
	//execution
	//increment-i++,    decrement-i--
	//when for loop start then first initialization and then condition and then execution later increment or decrement 
	//remember this point
	public void test() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			
		}
	}
public static void main(String[] args) {
	ForTest ft=new ForTest();
	ft.test();
}
}
