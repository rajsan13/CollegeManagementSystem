package training.day3;

public class Account {
private int balance;
public Account(int balance) {
	this.balance=balance;
}


public synchronized void withdraw(int amount) {
	if(amount<balance) {
		try {
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
		this.balance=this.balance-amount;
		System.out.println("The remaining Balance is "+this.balance);
	}
	else {
		System.out.println("Sorry! Insufficient funds.you have only "+balance+"rupees");
	}
}
}
