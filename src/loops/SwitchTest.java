package loops;

public class SwitchTest {
	public static void main(String[] args) {
		int day=2; //initialization
		switch(day) {//condition-if and switch are conditions in java
		case 1:
			System.out.println("day-1 monday");
			break;// braking the chain
		case 2: 
			System.out.println("day-2 tuesday");
			break;
		case 3:
			System.out.println("day-3 wednersday");
			break;
		case 4:
			System.out.println("day-4 thursday");
			break;
		case 5:
			System.out.println("day-5 friday");
			break;
		case 6:
			System.out.println("day-6 saturday");
			break;
		case 7:
			System.out.println("day-7 sunday");
			break;
		}	
	}

}
//before adding break to switch case it execute which day we will gave at the time after print all days
//after adding break only specific day (mention in switch())will show in console