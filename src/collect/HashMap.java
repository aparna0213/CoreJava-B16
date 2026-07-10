package collect;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMap {
	public void HashMapTest() {
		java.util.Map<String,String>map=new java.util.HashMap<String, String>();
		//HashMap<String,String>map=new HashMap<String,String>();
		map.put("vij123","vijay");
		map.put("bho123", "bhoni");
		map.put("apa123", "aparna");
		map.put("aru123", "aruna");
		map.put("suj123", "sujata");// keys values are entry
		map.put(null, "karna");//hash map allows one null key
		map.put(null, "arjun");//its stores in zero bucket
		map.put(null, "bheem");//overriding null keys
		map.put("parasuram", null);
		map.put("yudister", null);// hashmap allows many null values
		map.put("lav", null);
		map.put("apa123", "aparna");//overriding same contents(duplicate) objects
		// not allow duplicate kays values may be duplicate
		map.put("apa123a", "aparna");//overriding keys objects
		
		for(Entry<String, String> entry:map.entrySet()) {
			System.out.println(entry);
			//System.out.println(entry.getKey()+""+entry.getValue());
			
		}
		
		
	}
	public void LinkedHashMapTest() {
			Map<String, String> map=new LinkedHashMap<String, String>();
			// it follows insertion order
			map.put("apa123",   "aparna");
			map.put("siva123",   "siva");
			map.put("dur123",   "durga");
			map.put("ath123",   "atharva");
			map.put(null,"java");
			map.put(null,"test");//overriding null keys , allows one null key
			map.put("appu123",null );
			map.put("appu1234",null );
			map.put("appu12345",null );// allows many null values
			
			for(Entry<String, String>entry:map.entrySet()) {
				System.out.println(entry);
			}
			
	}
	public void TreeMapTest() {
		Map<String,String>map=new TreeMap<String, String>();
		// treemap follows ascending order
		//it follows insertion order
		map.put("apa123",   "aparna");
		map.put("siva123",   "siva");
		map.put("dur123",   "durga");
		map.put("ath123",   "atharva");
		//map.put(null,"java");//treemap doesnt allown null keys
		//map.put("appu1234",null );//treemap not allow null values
		
		
		
		for(Entry<String, String>entry:map.entrySet()) {
			System.out.println(entry);
		}
	}
	public void HashtableTest() {
		Map<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(123, "aa");// doesnt follow insertion order
		ht.put(102, "bb");//works like hashmap
		ht.put(103, "cc");
		ht.put(104, "dd");//lagacy calss
		//ht.put(null,"test");// not allowing  null keys
		//ht.put("appu123",null );//not allowing null values
		for(Entry<Integer, String>entry:ht.entrySet()) {
			System.out.println(entry);
		}
	}
public static void main(String[] args) {
	HashMap map=new HashMap();
	//map.HashMapTest();
	//map.LinkedHashMapTest();
	//map.TreeMapTest();
	map.HashtableTest();
	
	
}
}
