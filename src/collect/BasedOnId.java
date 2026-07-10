package collect;

import java.util.Comparator;

public class BasedOnId implements Comparator<TataProducts>{

	@Override
	public int compare(TataProducts o1, TataProducts o2) {
		// TODO Auto-generated method stub
		return o1.pid-o2.pid;
	}
	

}
