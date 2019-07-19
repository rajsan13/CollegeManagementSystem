package training.day4.collections;

import java.util.HashSet;

class Device implements Comparable{
	private int dId;
	private String dName;
	private Double dPrice;
	public Device(int dId, String dName, Double dPrice) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dPrice = dPrice;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public Double getdPrice() {
		return dPrice;
	}
	public void setdPrice(Double dPrice) {
		this.dPrice = dPrice;
	}
	@Override
	public String toString() {
		return "Device [dId=" + dId + ", dName=" + dName + ", dPrice=" + dPrice + "]";
	}
	@Override
	public int hashCode(){
		return this.dName.charAt(0);
	}
	@Override
	public boolean equals(Object obj){
		Device device = (Device) obj;
		if(this.dId==device.dId && this.dName.equals(device.dName) && this.dPrice == device.dPrice)
			return true;
		else
			return false;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class CollEx05 {
/**
 * @param args
 */
public static void main(String[] args) {
	HashSet<Device> set =new HashSet<>();
	set.add(new Device(191,"laptop",500.0));
	set.add(new Device(191,"laptop1",500.0));
	set.add(new Device(193,"laptop3",502.0));
	set.add(new Device(194,"laptop4",530.0));
	for(Device temp:set) {
		System.out.println(temp.hashCode()+""+temp);
	}
	
}
}
