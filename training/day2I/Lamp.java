package training.day2I;

public class Lamp extends Device implements RemoteControl{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("lamp is on");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("lamp is off");
	}

}
