package oops;

public class insurance  {//overriding
	public void calculatepremium(int amount,String history) {
		System.out.println("insurance:: "+amount+" "+history);
	}
public static void main(String[] args) {
	insurance i=new insurance();
	i.calculatepremium(600000, "genaral");
}
}
