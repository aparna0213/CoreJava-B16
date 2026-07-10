package collect;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Concurrentexception {
	public void onmap() {
		Map<Integer, String> map=new ConcurrentHashMap<Integer, String>();
		map.put(101, "aa");//we are getting exception by any adding or removing operations in for loop it disturbing the loop
		//so we are getting concurrent modification exception
		
		map.put(102, "bb");
		map.put(103, "cc");
		map.put(104, "dd");
		//map.put(102, "bb"); not allowing duplicates
		//map.remove(102);
		for(Entry<Integer, String> entry :map.entrySet()) {
			System.out.println(entry);
			map.put(105, "ee");//getting concurrent modification exception
			map.remove(101);
		}
		System.out.println("========================");
		for(Entry<Integer, String> entry :map.entrySet()) {
			System.out.println(entry);
		}
	}
	public void onList() {
		List<Integer>list=new CopyOnWriteArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		for(Integer val:list) {
			System.out.println(val);
			list.add(60);//we are getting exception by any adding or removing operations in for loop it disturbing the loop
			//so we are getting concurrent modification exception
			
		}
		System.out.println("================================");
		for(Integer val:list) {//list allowing duplicates so we need if condition
			if(val==50) {
			System.out.println(val);
			
		}
		}
	}
	public void onSet() {
	Set<Integer>set=new CopyOnWriteArraySet<Integer>();
	set.add(11);
	set.add(21);
	set.add(31);
	set.add(41);
	set.add(51);
	//set.add(21);// set not allowing duplicates
	for(Integer val:set) {
		System.out.println(val);
		set.add(61);
	}
	System.out.println("======================================");
	for(Integer val:set) {
		System.out.println(val);
	}
	}
public static void main(String[] args) {
	Concurrentexception ce=new Concurrentexception();
	//ce.onmap();
	//ce.onList();
	ce.onSet();
	
}
}
