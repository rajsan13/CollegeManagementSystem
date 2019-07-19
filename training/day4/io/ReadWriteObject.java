package training.day4.io;

import java.io.*;

import training.day2I.Account;

public class ReadWriteObject {
	public static void storeAccount(Account acc) throws FileNotFoundException, IOException {
		File file = new File("account.ser");
		ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(file));	
		oos.writeObject(acc);
		oos.writeInt(45);
		oos.writeDouble(56.23);
		oos.close();
		System.out.println("Data written succesfully");
		}
	public static Account getAccount() throws ClassNotFoundException, IOException {
		File file =new File("account.ser");
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream(file));
		Account acc = (Account) ois.readObject();
		System.out.println(ois.readInt());
		return acc;
	}
	
public static void main(String[] args) throws IOException, ClassNotFoundException{
	Account acc = new Account("asad",614);
	try {
		/*storeAccount(acc);*/
        Account acc1 = new Account();
		acc1=getAccount();
		System.out.println(acc1);
		
	}catch(IOException ioe) {
		ioe.printStackTrace();
	}
}
}
