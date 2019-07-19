package training.day2I;

public class BMW extends Four_Wheeler{
	private String variable;
public BMW(int noOfDoors, FuelType fuelType,String variable) {
		super(noOfDoors, fuelType);
		// TODO Auto-generated constructor stub
		this.variable=variable;
	}

public void musicPlayer()
{
	System.out.println("BMW comes with"+variable+"player");
}

@Override
public void accelerate() {
	// TODO Auto-generated method stub
	System.out.println("BMW accelerated");
}

@Override
public void decelerate() {
	// TODO Auto-generated method stub
	System.out.println("BMW decelerated");
}
}
