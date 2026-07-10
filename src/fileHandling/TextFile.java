package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile {
	public static void main1(String[] args) throws IOException {
		File file=new File("D:\\Files\\test.txt");// to write content in line --//to provide path location
		FileWriter fw=new FileWriter(file);// asked me to throws exception
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("teja it");//write method to write
		bw.newLine();
		bw.write("your java stop");
		bw.newLine();
		bw.write("vijayawada");
		bw.close();//close method is used in jdbc con.close(); connection.close()
		fw.close();
		//we must use close method to close write method it not it don't stop until we use close();
		//write operations are write,update,delete,save
		//read operations are get
		System.out.println("file created successesfully");
		
	}
	public static void main(String[] args) throws IOException {
		File file=new File("D:\\Files\\test.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while (line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
		fr.close();
		
	}

}
