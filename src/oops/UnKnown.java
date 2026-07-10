package oops;

public class UnKnown {//encapsulation example
	public static void main(String[] args) {
		AccountHolder a=new AccountHolder(101,"aparna",21487867,3900);
		AccountHolder aa=new AccountHolder(101,"aparna",21487867,60000);//new object created for account balance change
		
		//System.out.println(a.accountid+" "+a.holdername+ ""+a.accountnumber+" "+a.accountbalance);
		
		AccountHolder a2=new AccountHolder();
		a2.setAccountid(101);
		a2.setHoldername("aparna");
		a2.setAccountnumber(342546656);
		a2.setAccountbalance(5000000);
		
		System.out.println(a2.getAccountid());
		System.out.println(a2.getHoldername());
		System.out.println(a2.getAccountnumber());
		System.out.println(a2.getAccountbalance());
		
		a2.setAccountbalance(60000);//have to create object to change any element
		System.out.println(a2.getAccountbalance());
		a2.setAccountbalance(90000);// no need to create another object
		System.out.println(a2.getAccountbalance());
		}

}
