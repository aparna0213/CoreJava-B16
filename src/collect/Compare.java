package collect;

public class Compare {
	public void CompareTest() {
		Integer a=10;
		Integer b=20;
		Integer c=10;
		System.out.println(a.compareTo(b));// 10 compare 20  = -1 compare value bigger than compared values lesser-1
		System.out.println(b.compareTo(a));// 20 compares 10= +1(1) compare value lesser than compared values grater +1
		System.out.println(a.compareTo(c));// 10 compare 10=0 two values are equal then 0
	}
public static void main(String[] args) {
	Compare c=new Compare();
	c.CompareTest();
}
}
