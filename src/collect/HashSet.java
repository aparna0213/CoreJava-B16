package collect;

public class HashSet {
	public void HashSetTest() {
	java.util.Set<String>set=new java.util.HashSet<>();
	set.add("appu");
	set.add("aparna");
	set.add("attu");
	for(String val:set) {
		System.out.println(val);
	}
	}
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.HashSetTest();
}
}
