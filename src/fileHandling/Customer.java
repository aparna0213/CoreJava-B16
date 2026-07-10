package fileHandling;

import java.io.Serializable;

public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int cid;
	String name;
	long cardNum;
	transient int cvv;
	static int pin;
	public Customer(int cid, String name, long cardNum, int cvv, int pin) {
		super();
		this.cid = cid;
		this.name = name;
		this.cardNum = cardNum;
		this.cvv = cvv;
		this.pin = pin;
	}
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", cardNum=" + cardNum + ", cvv=" + cvv + ", pin=" + pin
				+ "]";
	}

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCardNum() {
		return cardNum;
	}
	public void setCardNum(long cardNum) {
		this.cardNum = cardNum;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	

}
