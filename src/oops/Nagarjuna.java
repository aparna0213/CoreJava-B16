package oops;

public class Nagarjuna extends NageswarRao{
	public void annapurnastudio() {
		System.out.println("parent studio");
	}
	public void house() {
		System.out.println("parent jublihills house");
	}
	public void gold() {
		System.out.println("parent gold");
	}
	
	public void bike() {
		System.out.println("parent bike");
	}
	public static void main(String[] args) {
		Nagarjuna ng=new Nagarjuna();
		NagaChaitanya nc=new NagaChaitanya();// object can create any classes
		nc.annapurnastudio();
		ng.annapurnastudio();
		ng.house();
		ng.bike();
		ng.gold();
		ng.land();
		nc.land();
		//ng.car(); we can not access child properties unless it gives you error
	}

}
