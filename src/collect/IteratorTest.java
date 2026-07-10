package collect;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class IteratorTest {
	public void itrTest() {
		List<Integer> l=new ArrayList<Integer>();
		l.add(12);
		l.add(14);
		l.add(16);
		l.add(18);
		l.add(20);
		for(Integer val:l) {
			System.out.println(val);
		}// arrange in a proper sequence and return
		//we can iterate the data with while loop as well
		System.out.println("===============");
		 Iterator<Integer> itr=l.iterator();//iterator is a interface it having abstract methods
		 //abstract methods dont have method body
		while(itr.hasNext()) {//hasnext method checks element is present or not
			System.out.println(itr.next());
		}System.out.println("===========");
		//next method retrives the element
		
		}
		public void ListitrTest() {
			//it iterates the data from forward direction to backward direction
			List<Integer> l=new ArrayList<Integer>();
			l.add(12);
			l.add(14);
			l.add(16);
			l.add(18);
			l.add(20);
			ListIterator<Integer> Listitr=l.listIterator();
			while(Listitr.hasNext()) {
				System.out.println(Listitr.next());
			}
			System.out.println("=============");
			while(Listitr.hasPrevious()) {// it checks the elements are present in backward direction in sequence
				System.out.println(Listitr.previous());//it retrives the elements from backward direction
		
			}//but it not allowing only previous methods it require next methods too otherwise output is not printing
			
		}
		public void enumerateTest() {
			// to iterate the legacy classes
			Vector<Integer> v=new Vector<Integer>();
			v.add(12);
			v.add(14);
			v.add(16);
			v.add(18);
			v.add(20);
			Enumeration<Integer>en=v.elements();
			System.out.println("==================");
			while(en.hasMoreElements()) {
				System.out.println(en.nextElement());
			}

			
		}
		

	
public static void main(String[] args) {
	IteratorTest it=new IteratorTest();
	//it.itrTest();
	//it.ListitrTest();
	it.enumerateTest();
}
}
