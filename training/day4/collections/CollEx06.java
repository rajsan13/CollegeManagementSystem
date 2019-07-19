package training.day4.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class CollEx06 {
public static void main(String[] args) {
	TreeSet<String> set = new TreeSet<>();
	set.add("asad");
	set.add("qwer");
	set.add("brt");
	System.out.println(set);
	System.out.println("-------------------------");
	TreeSet<Device> devices = new TreeSet<>(new Comparator<Device>() {

		@Override
		public int compare(Device o1, Device o2) {
			// TODO Auto-generated method stub
			return o1.getdName().compareTo(o2.getdName());
		}
	});
	devices.add(new Device(191,"laptop",500.0));
	devices.add(new Device(191,"paptop1",500.0));
	devices.add(new Device(193,"aaptop3",502.0));
	devices.add(new Device(194,"taptop4",530.0));

	System.out.println(devices);
	
}
}
