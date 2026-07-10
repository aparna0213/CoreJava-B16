package collect;

public class ArrayTest {
	//array=elements of same type
	public static void main(String[] args) {
		int []arr=new int[5];
		arr[0]=5;
		arr[1]=15;
		arr[2]=25;
		arr[3]=35;
		arr[4]=45;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("==============================");
		
		for( int i=0;i<arr.length;i++) {//for loop
			System.out.println(arr[i]);
		}
		System.out.println("===============================");
		
		for(int i:arr) {//for each loop
			System.out.println(i);
		}
		
	}

}
