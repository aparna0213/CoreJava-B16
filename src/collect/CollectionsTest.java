package collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsTest {
public static void main(String[] args) {
	List<Integer>list=new ArrayList<Integer>();
	list.add(12);
	list.add(18);
	list.add(16);
	list.add(14);
	list.add(20);
	Collections.sort(list);// sorting in acending order
	Collections.reverse(list);// sorting in decending oder but it will complete after values in sorted ascending order
	for(Integer val:list) {
		System.out.println(val);
	}
	Collections.unmodifiableList(list);
	List<Integer> syncList=Collections.synchronizedList(list);
	Set<Integer> set=new HashSet<Integer>();
	Set<Integer>syncset=Collections.synchronizedSet(set);
	
	HashMap<Integer, String> map=new HashMap<Integer, String>();
	Map<Integer, String>syncmap=Collections.synchronizedMap(map);
	
	List<Integer>list2=Arrays.asList(12,13,14,15);
	
	Integer arr[]= {12,13,14,15};
	List<Integer>list3=Arrays.asList(arr);//converting array into list
	
	Object arr2=list3.toArray();//converting list into array
	
	
	
	
	
	
	}
}
