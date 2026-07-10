package loops;

public class ArrayTest {
	//collection of elements of same type-array
	//int 1=10;
	//int j=20;
	//int k=30;-initialization
	public void test() {
		//int=datatype,  arr=reference variable  []=array symbol   new=keyword,  [5]=length of an array
		int arr[]=new int[5];// array syntax
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		//arr[5]=60;
		System.out.println(arr[0]);//printing array indexes
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		//System.out.println(arr[5]);
		System.out.println("===================================");
		for(int i=0;i<arr.length;i++) {//array size=length-1
			//for(int i=0;i<5;i++){}we can write like this but we are making array size to 5 not more than we making it to static
			System.out.println(arr[i]);
		}
	}
	public void test2() {//we taken string datatype and arr[] changed to birlaproducts[]
		String birlaproducts[]= {"vi","pantaloons","birlasoft","indriya","ultratech"};
		System.out.println(birlaproducts[0]);
		System.out.println(birlaproducts[1]);
		System.out.println(birlaproducts[2]);
		System.out.println(birlaproducts[3]);
		System.out.println(birlaproducts[4]);
		//System.out.println(birlaproducts[5]);// when we trying to print more than array size value we get arrayindexoutofboundsexception
		System.out.println("===========we can write for loop to string like other  datatypes===================");
		for(int i=0;i<birlaproducts.length;i++) {
			System.out.println(birlaproducts[i]);
		}
		System.out.println("===========for each loop ===============");
		for(String val:birlaproducts) {
			System.out.println(val);
		}
	}
public static void main(String[] args) {
	ArrayTest ar=new ArrayTest();
	ar.test();
	ar.test2();
}
}
