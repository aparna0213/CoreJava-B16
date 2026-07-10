package collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {
	public void ArrayListTest() {
		//we can create object for class
		//ArrayList<E> al=new ArrayList<E>();
		//E=element type
		//<>generic
		List<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(2, 25);//adding the elements
		al.remove(3);//removing elements
		al.add(60);
		al.add(70);
		al.add(80);
		
		al.get(4);//get value by index(read elements)
		al.get(0);
		
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
	}
	
	System.out.println("=============");
	for(Integer val:al) {
		System.out.println(val);
	}}
	
	public void LinkedListTest() {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("sai");
		ll.add("bhoni");
		ll.add("anusha");
		ll.add("aparna");
		ll.add("sravs");
		ll.remove(3);
		ll.add(5, "appu");
		ll.remove();
		ll.remove();
		
		System.out.println(ll.get(4));
		for(String val:ll) {
			System.out.println(val);
		}
		
	}
	public void VectorTest() {
		List<Integer> vt=new Vector<Integer>();
		vt.add(12);
		vt.add(22);
		vt.add(32);
		vt.add(42);
		vt.add(52);
		for(int val:vt) {
			System.out.println(val);	
		}
		
	}
	
	
	
	
	
public static void main(String[] args) {
	ListTest lt=new ListTest();
	//lt.ArrayListTest();
	//lt.LinkedListTest();
	lt.VectorTest();
}
}
