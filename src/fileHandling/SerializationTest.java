package fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {
	public static void main(String[] args) throws IOException {
		Customer c1=new Customer(1, "aparna", 76675646554L, 765, 876);
		//System.out.println(c1);
		FileOutputStream fos=new FileOutputStream("D:\\Files\\customer.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c1);
		oos.close();
		fos.close();
		System.out.println("serialization done.......");
		
	}

}
