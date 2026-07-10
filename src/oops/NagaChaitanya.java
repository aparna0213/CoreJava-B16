package oops;

public class NagaChaitanya extends Nagarjuna  {
	public void car() {
		System.out.println("child car");
	}
	@Override
	public void bike() {
		System.out.println("child bike");
	}
	public static void main(String[] args) {
		NagaChaitanya nc=new NagaChaitanya();
		nc.car();
		nc.annapurnastudio();
		nc.house();
		nc.gold();
		nc.bike();
		
		System.out.println("========================");
		Nagarjuna ng=new Nagarjuna();
		ng.annapurnastudio();
		ng.house();
		ng.gold();
		ng.bike();
		nc.land();
		ng.land();
		
	}
	

}
