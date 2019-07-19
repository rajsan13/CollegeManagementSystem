package training.day2I;

public class Four_Wheeler extends Vehicle{
private int noOfDoors;
public int getNoOfDoors() {
	return noOfDoors;
}
public void setNoOfDoors(int noOfDoors) {
	this.noOfDoors = noOfDoors;
}
public FuelType getFuelType() {
	return fuelType;
}
public void setFuelType(FuelType fuelType) {
	this.fuelType = fuelType;
}
private FuelType fuelType;

	public Four_Wheeler(int noOfDoors, FuelType fuelType) {
	super();
	this.noOfDoors = noOfDoors;
	this.fuelType = fuelType;
}
	public void doors()
	{
		System.out.println("FourWheeler has"+noOfDoors+"doors");
	}
	public void fuelType()
	{
		System.out.println("Runs on "+fuelType);
	}
}
