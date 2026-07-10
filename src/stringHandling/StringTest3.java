package stringHandling;

public class StringTest3 {
public static void main(String[] args) {
	String s="YourJavaSTOp";
	System.out.println(s.length());
	System.out.println(s.toCharArray());
	System.out.println(s.endsWith("p"));
	System.out.println(s.equals("yourjavastop"));
	System.out.println(s.hashCode());
	System.out.println(s.indexOf("p"));
	System.out.println(s.isBlank());
	System.out.println(s.isEmpty());
	System.out.println(s.lastIndexOf("p"));
	System.out.println(s.repeat(6));
	System.out.println(s.startsWith("y"));
	System.out.println(s.startsWith("Y"));
	System.out.println(s.strip());
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	System.out.println(s.trim());
	System.out.println(s.compareTo("java"));
	System.out.println(s.concat("java"));//add the element
	System.out.println(s.equalsIgnoreCase("javayourstop"));
	System.out.println(s.replace("Y", "o"));
	System.out.println(s.toCharArray());
	
	char[] ch=s.toCharArray();
	System.out.println(ch);
	
	String s2= "your java stop";
	System.out.println(s2);
	String [] arr=s2.split( " ");
	for(String word:arr) {
		System.out.println(word);
		
	}
	System.out.println(s.substring(4));
	System.out.println(s.getClass());
	System.out.println(s.getBytes());
	System.out.println(s.lines());
	System.out.println(s.repeat(6));
	
}
}
