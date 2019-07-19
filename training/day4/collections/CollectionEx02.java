package training.day4.collections;

import java.util.*;

public class CollectionEx02 {
public static void main(String[] args) {
	ArrayList<String> a = new ArrayList<String>(); 
	a.add("sd");
	a.add("sfsdgf");
	a.add("sfsf");
	a.add("wret");
	System.out.println("Size is: "+a.size());
	for(String temp : a) {
		System.out.println(temp);
	}
	System.out.println("------------------");
	Iterator<String> itr = a.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		//System.out.println(itr);
	}
	System.out.println("------------------");
	a.add(1,"asfsf");
	System.out.println(a);
	
	ArrayList<String> b =new ArrayList<String>();
	for(int i=0;i<2;i++) {
		b.add(a.get(i));
	}
	System.out.println(b);
	
}
}
