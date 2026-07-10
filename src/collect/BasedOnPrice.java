package collect;

import java.util.Comparator;

public class BasedOnPrice implements Comparator<TataProducts> {

	@Override
	public int compare(TataProducts o1, TataProducts o2) {
		// TODO Auto-generated method stub
		return o1.price-o2.price;
	}

}
