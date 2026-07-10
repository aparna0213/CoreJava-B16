package loops;

public class BookMyShow {
	public void seatbooking() {
		String seat="platinum";
		if(seat.equals("silver") ){
			System.out.println("your ticket catogery is silver");
		}else if(seat.equals("gold")) {
			System.out.println("your ticket catogery is gold");
		}else if(seat.equals("platinum")) {
			System.out.println("your ticket catogery is platinum");
		}else {
			System.out.println("nelaticket");
		}
		
	}
	public static void main(String[] args) {
		BookMyShow bms=new BookMyShow();
		bms.seatbooking();
	}

}
