package training.day2I;

import java.io.Serializable;

public class Account implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 4752640894217483015L;

@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", custName=" + custName + ", initialBalance=" + initialBalance
				+ "]";
	}

private int accountId;
private String custName;
private double initialBalance;
private static int count=100;

public Account() {
	super();
}

public Account(String custName, double initialBalance) {
	//super();
	this.accountId = count++;
	this.custName = custName;
	this.initialBalance = initialBalance;
}

public int getAccountId() {
	return accountId;
}

public String getCustName() {
	return custName;
}

public double getInitialBalance() {
	return initialBalance;
}

public int getCount() {
	return count;
}
}
