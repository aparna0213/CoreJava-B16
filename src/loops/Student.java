package loops;

public class Student {
	//100-75 first class
	//74=50 second class
	//35=49 third class
	public void marks() {
		int marks=68;
		// if condition== true or false
		if(marks<35) {
			System.out.println("student failed");
		}else if(marks>=40 && marks<50) {
			System.out.println("pass in third garde");
		}else if(marks >=50 && marks<75) {
			System.out.println("pass in second class");
		}else if(marks>=75 && marks<=100) {
			System.out.println("pass in first class");
		}else {
			System.out.println("just pass");
		}
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.marks();
	}
}
