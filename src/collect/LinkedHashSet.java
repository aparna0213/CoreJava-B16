package collect;

public class LinkedHashSet {
	public void LinkedHashSetTest() {
		java.util.Set<String>lhs=new java.util.LinkedHashSet<String>();
		lhs.add("aparna");
		lhs.add("anusha");
		lhs.add("pavani");
		lhs.add("lakshmi");
		lhs.add("malikaa");// following insertion order
		lhs.add(null);
		//lhs.add(null); allowing one null element
		for(String val:lhs) {
			System.out.println(val);
		}
		
	}
public static void main(String[] args) {
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.LinkedHashSetTest();
}
}
