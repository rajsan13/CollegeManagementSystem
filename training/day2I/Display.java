package training.day2I;

public class Display {
public static void showVehicle(Vehicle ...vehicles)
{
if(vehicles==null) {
	System.out.println("No Vehicle");
	return;
}
for(Vehicle temp: vehicles) {
	temp.accelerate();
	temp.decelerate();
	System.out.println("----------------------");
	if(temp instanceof Four_Wheeler) {
		((Four_Wheeler)temp).doors();
		((Four_Wheeler) temp).fuelType();}
		else if (temp instanceof BMW) {
			((BMW)temp).musicPlayer();
		}
		else if (temp instanceof Benz){
			//((Benz) temp).engineeStandard();
		}
		
	
}

}
}
