package training.day4.collections;

import java.util.HashSet;

public class CollEx04 {
public static void main(String[] args) {
	HashSet<String> set = new HashSet<>();
	set.add("abd");
	set.add("cde");
	set.add("abd");
	for(String temp:set) {
		System.out.println(temp);
	}
	
}
}
