package oops;

public class AccountHolder {//encapsulation example
	private int accountid;
	private String holdername;
	private int accountnumber;
	private int accountbalance;
	
	
	public AccountHolder() {
		super();
		// TODO Auto-generated constructor stub
	}
	//created constructor
	public AccountHolder(int accountid, String holdername, int accountnumber, int accountbalance) {
		super();
		this.accountid = accountid;
		this.holdername = holdername;
		this.accountnumber = accountnumber;
		this.accountbalance = accountbalance;
	}
	//getters and setters methods
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getHoldername() {
		return holdername;
	}
	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(int accountbalance) {
		this.accountbalance = accountbalance;
	}
	

}
