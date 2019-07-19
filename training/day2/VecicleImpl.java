package training.day2;

public class VecicleImpl {
public static void main(String[] args) {
	Vehicle[] vehicles = new Vehicle[5];
	vehicles[0]=new BMW(2,FuelType.PETROL,"sony");
	vehicles[1]=new Benz(3,FuelType.CNG);
	vehicles[2]=new BMW(2,FuelType.PETROL,"sony");
	vehicles[3]=new Benz(3,FuelType.CNG);
	vehicles[4]=new BMW(2,FuelType.PETROL,"sony");
	Display.showVehicle(vehicles);
}
}
