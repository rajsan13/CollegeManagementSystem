package training.day4.collections;

import java.util.ArrayList;

public class CollEx01 {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(25.5);
	list.add("hi");
	list.add(new Object());
	list.add(45);
	for(Object temp:list) {
		System.out.println(temp);
	}
}
}
