package collect;

public class Student implements Cloneable {
int id;
String name;

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}

public static void main(String[] args) throws CloneNotSupportedException {
	Student s1=new Student();
	s1.id=101;
	s1.name="aparna";
	System.out.println(s1);
	
	Student s2=s1;// object to object copying-shallow copy
	System.out.println(s2);
	
	Student s3=s1;// variable to variable copying-deep copy
	s3.id=s1.id;
	s3.name=s3.name;
	System.out.println(s3);
	
	Student s4=(Student)s1.clone();// copying object using clone()//casting (studnet)
	System.out.println(s4); 
	System.out.println(s4.getClass()); //getclass()-package cuurrent using
	//clone() givs compile time exception then we thorws exception
	//and then also gave exception in runtime exception then we have to implement "Cloneable interface"
	// clone method is used for copying objects it gives more performance than other 2
	//copying objects in 3 types= 1-shallow,2=deep,3=clone()
	
}
}
