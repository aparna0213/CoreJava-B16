package stringHandling;

public class StringTricky {
	public void m1(String s1) {
		System.out.println("String....");
	}
	public void m1(StringBuffer s2) {
		System.out.println("String buffer....");
	}
	public void m1(StringBuilder s3) {
		System.out.println("String builder....");
	}
public static void main(String[] args) {
	StringTricky st=new StringTricky();
	//st.m1(null);--ambiguity-dont know which m1 method to call because all methods are same (m1)
	st.m1("java");//important for interview tricky quetion
	StringBuffer sb=new StringBuffer("java");
	st.m1(sb);//we have to pass reff
	StringBuilder sbu=new StringBuilder("java");
	st.m1(sbu);
	}

}
