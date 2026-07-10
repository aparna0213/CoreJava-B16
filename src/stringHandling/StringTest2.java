package stringHandling;

public class StringTest2 {
	public static void main(String[] args) {
		String s1="java";
		String s2=new String("gopi");
		String s3="java";
		String s4="gopi";
		String s5=new String("java");
		String s6=new String("gopi");
		String s7=new String("lokesh");
		String s8="gopi";
		
		//== compare method-compares 2 objects-instances
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s6);
		System.out.println(s4==s7);
		System.out.println(s4==s6);
		System.out.println(s4==s2);
		System.out.println(s1==s4);
		System.out.println(s1==s5);
		System.out.println(s4==s8);
		System.out.println("=======================");
		//.equals -compares content
		System.out.println(s1.equals(s7));
		System.out.println(s2.equals(s6));
		System.out.println(s3.equals(s2));
		System.out.println(s4.equals(s1));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equals(s3));
		
	}

}
