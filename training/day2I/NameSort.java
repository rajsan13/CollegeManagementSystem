package training.day2I;

import java.util.Arrays;

public class NameSort implements Comparable{
public static void main(String[] args) {
	String[] names = {"Praneeth","Himanshu","Anurag","udit"};
	for(String temp:names)
	{
		System.out.println(temp);
	}
	Arrays.sort(names);
	for(String temp:names)
	{
		System.out.println(temp);
	}
	//Arrays.sort(names,Compa);
}

@Override
public int compareTo(Object arg0) {
	// TODO Auto-generated method stub
	return 0;
}
}
