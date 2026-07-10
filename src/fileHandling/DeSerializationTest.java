package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Customer c1=new Customer(1, "aparna", 76675646554L, 765, 876);
	//	System.out.println(c1);
		FileInputStream fis=new FileInputStream("D:\\Files\\customer.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		System.out.println(obj);
		ois.close();
		fis.close();
		System.out.println("deserialization done..........");
		
	}

}
