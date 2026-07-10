package loops;

public class BookMyShow1 {
	public void price() {
		int price=50;
		if(price>=100) {
			System.out.println("second class");
		}else if(price<=200 && price >=100) {
			System.out.println("first class");
		}else if(price<=300 && price>=200 ) {
			System.out.println("balcony");
		}else {
			System.out.println("nelaticket");
		}
	}
public static void main(String[] args) {
	BookMyShow1 bms=new BookMyShow1();
	bms.price();
}
}
