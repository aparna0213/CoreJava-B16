package collect;

import java.util.Arrays;
import java.util.Collections;
//import java.util.Collections;
import java.util.List;

public class TataProducts {//comparator example
	int pid;
	String name;
	int price;
	public TataProducts(int pid, String name, int price) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "TataProducts [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		TataProducts t1=new TataProducts(105, " motors", 20000);
		TataProducts t2=new TataProducts(102, " steel", 30000);
		TataProducts t3=new TataProducts(101, " tanishq", 50000);
		TataProducts t4=new TataProducts(104, " voltas", 70000);
		TataProducts t5=new TataProducts(106, " tcs", 80000);
		
		List<TataProducts>list=Arrays.asList(t1,t2,t3,t4,t5);
		//Collections.sort(list);wrong approach
		Collections.sort(list, new BasedOnId());
		//Collections.sort(list, new BasedOnName());
		//Collections.sort(list, new BasedOnPrice());
		
		String property="id";
		//String property="name";
		//String property="price";

		
		if(property.equals("id")) {
			Collections.sort(list, new BasedOnId());
		}else if(property.equals("name")) {
			Collections.sort(list, new BasedOnName());
		}else if(property.equals("price")) {
			Collections.sort(list, new BasedOnPrice());
		}
		String ordertype="DESC";
		if(ordertype.equals("DESC")) {
			Collections.reverse(list);
		}
		
	
		for(TataProducts obj:list) {
			System.out.println(obj);
			
		}
		System.out.println();
	}
	

}
