package collect;

public class GarbageCollectorTest {
	public static void main(String[] args) {
		String s=null;//unused objects
		String s1="teja";//unused objects
		String s2="java";
		String s3="stop";
		String s4=s2.concat(s3);
		System.out.println(s4);
	}
//garbage collector will collect unusable objects..
//demon thread-gc internally have demon thread-monitoring-logging
//gc before calling un- usable objects it will call finalize() method	
	// finalize()-it is object class method
}
