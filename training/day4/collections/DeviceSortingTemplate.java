package training.day4.collections;

import java.util.Comparator;

public class DeviceSortingTemplate implements Comparable{

	public static Comparator<Device> sortByName() {
		return new Comparator<Device>() {

			@Override
			public int compare(Device o1, Device o2) {
				// TODO Auto-generated method stub
				return o1.getdName().compareTo(o2.getdName());
			}
		
		
		};
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
