package collect;

public class TreeSet {
	public void TreeSetTest() {
		java.util.Set<Integer> ts=new java.util.TreeSet<Integer>();
		ts.add(10);//set follows internal data structure of map
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);// it follows insertion order(sorting order)
		//ts.add(null); not allowing null elements
		for(Integer val:ts) {
			System.out.println(val);
		}
	}
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.TreeSetTest();
}
}
