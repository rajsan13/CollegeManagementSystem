package training.day2I;

public class AccountImpl {
public static void main(String[] args) {
Account ac1=new Account("Mayur",2000);
Account ac2=new Account("Umang",6000);
System.out.println(ac1.getAccountId()+","+ac1.getCustName()+ac1.getInitialBalance());
System.out.println(ac2.getAccountId()+","+ac2.getCustName()+ac2.getInitialBalance());

}

}
