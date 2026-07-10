package collect;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public void HashSetTest() {
		Set<Integer> hs=new HashSet<Integer>();
		hs.add(10);//hash set doesnt follow insertion order
		hs.add(12);
		hs.add(14);
		hs.add(16);
		hs.add(18);
		hs.add(18);//not allowing duplicates its overriding
		hs.add(null);
		//hs.add(null);//it allows one null element
		for(Integer val:hs) {
			System.out.println(val);
		}
	}
	
public static void main(String[] args) {
	SetTest st=new SetTest();
	st.HashSetTest();
}
}
