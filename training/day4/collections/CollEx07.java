package training.day4.collections;

import java.util.*;
import java.util.Map.Entry;

public class CollEx07 {
public static void main(String[] args) {
	HashMap<String,Integer> map =new HashMap<>();
	map.put("dsj", 56);
	map.put("asf",24);
	System.out.println(map.get("asf"));
	Set<Entry<String, Integer>> entrySet = map.entrySet();
	Iterator itr = entrySet.iterator();
	while(itr.hasNext()) {
		Map.Entry temp = (Entry) itr.next();
		System.out.println("Key is "+temp.getKey()+" value is "+temp.getValue());
	}
}
}
