package training.day2I;

public class Two_Wheeler extends Vehicle{

	public void fuelType(FuelType fuelType)
	{
		System.out.println("Runs on "+fuelType);
	}
	public void selfStart(boolean flag)
	{
		System.out.println(flag?"Two Wheeler has selfStart":"Two Wheeler Does not selfStart");
	}
	public void hasNoOfGear(int noOfGears)
	{
		System.out.println("No of Gears are "+noOfGears);
	}
}
