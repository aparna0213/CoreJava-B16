package oops;

public interface PhonePay {//interface
	// we can only  create abstract methods
	
	public PhonePay(){
		// we can not create constructor for interface
	}
	
		{
		//we can not create instance blocks for interface
	}
	
static	{
		// we can not create static blocks for interface
	}
	
	int ticket=500;
	public static final int id =20;
	// by default interface variables are public,static,final no need to mention
	//in interface by default methods are public and abstract methods

	public void ticketbooking();//abstract methods
	// interface allows only abstract methods
	//abstract methods=without method body is called abstract methods
//interface can be override in classes
	public static void main(String[] args) {
		PhonePay pp=new PhonePay();//we can not create object for interface
		
		System.out.println(id);
		System.out.println(ticket);
	}
	
	
	
}
