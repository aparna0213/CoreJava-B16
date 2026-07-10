package loops;

public class DoWhileTest {
	public static void main(String[] args) {
		//even the condition fails,at least one condition will execute
		int i=0;//initialization
		do {
			System.out.println(i);//execution
			i++; //increment/decrement
		}while(i<10);//condition
	}

}
