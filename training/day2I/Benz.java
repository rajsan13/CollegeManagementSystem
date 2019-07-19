package training.day2I;

public class Benz extends Four_Wheeler{

public Benz(int noOfDoors, FuelType fuelType) {
		super(noOfDoors, fuelType);
		// TODO Auto-generated constructor stub
	
	}

public void engineeStandard(String engineStd)
{
	System.out.println("The Benz is "+engineStd);
}

@Override
public void doors() {
	System.out.println("Benz has"+getNoOfDoors());
}

@Override
public void fuelType() {
	System.out.println("Benz's Fueltype is "+getFuelType());
}

@Override
public void accelerate() {
System.out.println("Benz accelerated");
}

@Override
public void decelerate() {
System.out.println("Benz decelerated");
}
}
