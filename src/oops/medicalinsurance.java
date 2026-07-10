package oops;

public class medicalinsurance extends insurance {
	@Override
	public void calculatepremium(int amount,String healthhistory) {
		System.out.println("healthinsurance:: "+amount+" "+healthhistory);
	}
public static void main(String[] args) {
	insurance i=new insurance();
	i.calculatepremium(4000000, "healthinsurance");
}
}


