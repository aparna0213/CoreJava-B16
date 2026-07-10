package oops;

public class AbhiBus implements PhonePay {
	@Override
	public void ticketbooking() {
		String from="vijayawada";
		String to="hyderabad"; 
		String name="aparna";
		int age=27;
		
		System.out.println("from::"+from);
		System.out.println("to::"+to);
		System.out.println("passenger name::"+name);
		System.out.println("passenger age::"+age);
	}
public static void main(String[] args) {
	AbhiBus ab=new AbhiBus();
	ab.ticketbooking();
	System.out.println(id);
	System.out.println(ticket);
	
}

}
