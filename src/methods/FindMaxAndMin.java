package methods;

import java.util.Arrays;
import java.util.List;

public class FindMaxAndMin {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(12,13,6,4,16,19);
		int min=list.stream().mapToInt(x->x).min().getAsInt();
		int max=list.stream().mapToInt(x->x).max().getAsInt();
		System.out.println("max"+max);
		System.out.println("min"+min);
	}

}
