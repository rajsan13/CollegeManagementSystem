package training.day3;

public class SynchronizeTest extends Thread{
Account account;
int amount;
public SynchronizeTest(Account account,int withDrawAmount,String name) {
	this.account=account;
	this.amount=withDrawAmount;
	new Thread(this,name).start();
}
public void run() {
	
	account.withdraw(amount);
}
public static void main(String[] args) {
	Account account = new Account(1000);
	new SynchronizeTest(account,500,"Mr.A");
	new SynchronizeTest(account,750,"Mr.B");
}
}
