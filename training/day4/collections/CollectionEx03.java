package training.day4.collections;

import java.util.*;

import training.day2I.Account;

public class CollectionEx03 {
public static void main(String[] args) {
	Vector<String> list = new Vector<String>(7,5);
	System.out.println("Initial capacity is: "+list.capacity());
	System.out.println("Initial size is: "+list.size());
	list.add("one");
	list.add("one");
	list.add("one");
	list.add("one");
	list.add("one");
	list.add("one");
	list.add("one");
	list.add("one");
	list.add("one");
	list.add("one");
	list.add("one");
	
	System.out.println("Final capacity is: "+list.capacity());
	System.out.println("Final size is: "+list.size());
	/*Vector<Account> v =new Vector<Account>();
	Account a = new Account("sdws",23);
	v.add(a);
	v.get(0).getCustName().substring(0, 1);*/
}
}
