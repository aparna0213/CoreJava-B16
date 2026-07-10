package collect;

public class HashTest {
	//if content is same always hashcode will be same
	//hashcode will give int values
	public static void main(String[] args) {
		Integer i=10;
		System.out.println(i.hashCode());
		String s="java";
		System.out.println(s.hashCode());
		String s1="kumar";
		System.out.println(s1.hashCode());
		String s2="java";
		System.out.println(s2.hashCode());
		
		System.out.println(s.hashCode()==s1.hashCode());//==compare the hashcode values
		System.out.println(s.hashCode()==s2.hashCode());
		
		System.out.println(s.equals(s2));// "java"="java"-true    // .equals compare the content 
		System.out.println(s.equals(s1));//"java"="kumar"-false
		
		
	}

}
