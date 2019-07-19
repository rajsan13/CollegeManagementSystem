package training.day4.collections;

import java.util.*;
import java.util.Map.Entry;

public class CollEx08 {
public static void main(String[] args) {
	List<String> helloWorld = Arrays.asList("goodmrng","namaskaram","bonjour");
	List<String> helloWorld1 = Arrays.asList("goodmrng1","namaskaram1","bonjour1");
	List<String> helloWorld2 = Arrays.asList("goodmrng2","namaskaram2","bonjour2");
	Map<String,List<String>> map = new HashMap<>();
	map.put("goodmrng", helloWorld);
	map.put("goodmrng1", helloWorld1);
	map.put("goodmrng2", helloWorld2);
	Iterator<Entry<String, List<String>>> iterator = map.entrySet().iterator();
	while(iterator.hasNext()) {
		Entry<String, List<String>> next = iterator.next();
		System.out.println(next.getKey());
		System.out.println(next.getValue());
	}
	
	
}
}
