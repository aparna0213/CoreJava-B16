package collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirlaProducts implements Comparable<BirlaProducts> {//comparable
	int pid;
	String name;
	int price;
	public BirlaProducts(int pid, String name, int price) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "BirlaProducts [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(BirlaProducts o) {
		return this.name.compareTo(o.name);
		//return this.pid-o.pid;// 101 102 103 104 105 (+1 and -1 operations)
		//return this.price-o.price;
	}
	

	public static void main(String[] args) {
		
	
	BirlaProducts b1=new BirlaProducts(101,"idea",2000);
	BirlaProducts b2=new BirlaProducts(104,"indriya",40000000);
	BirlaProducts b3=new BirlaProducts(103,"ultra",6000);
	BirlaProducts b4=new BirlaProducts(100,"lenin",9000);
	BirlaProducts b5=new BirlaProducts(102,"indriya",100000);
	
	List<BirlaProducts> list=new ArrayList<>();
	list.add(b1);
	list.add(b2);
	list.add(b3);
	list.add(b4);
	list.add(b5);
	Collections.sort(list);
	for(BirlaProducts obj:list) {
		System.out.println(obj);
	}
	
	
	

}

	
}
