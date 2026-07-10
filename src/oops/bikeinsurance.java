package oops;

public class bikeinsurance extends insurance{
	@Override
	public void calculatepremium(int amount,String accidenthistory) {
		System.out.println("bikeinsurance:: "+amount+" "+accidenthistory);
	}
public static void main(String[] args) {
	insurance i=new insurance();
	i.calculatepremium(40000, "bikeinsurance");
}
}
