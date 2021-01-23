package chapter06_Exercise;

public class Account1 {
	
	private int balance;
	private final int MIN_BALANCE=0;
	private final int MAX_BALANCE=1000000;
	
	public Account1() {
		// TODO Auto-generated constructor stub
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(MIN_BALANCE<=balance && balance<=MAX_BALANCE) {
			this.balance = balance;
		}
	}
	

}
