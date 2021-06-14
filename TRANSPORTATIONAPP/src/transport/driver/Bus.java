package transport.driver;

public class Bus extends Vehicle
{
	private int noOfPassangers;
	
	public Bus(int vehicleModel, int registrationNumber, int vehicleSpeed, int fuelCapacity, int fuelConsumption, int noOfPassangers)
	{
		super(vehicleModel, registrationNumber, vehicleSpeed, fuelCapacity, fuelConsumption);
		this.noOfPassangers = noOfPassangers;
	}
	
	public int getNoOfPassangers() {
		return noOfPassangers;
	}

	public void setNoOfPassangers(int noOfPassangers) {
		this.noOfPassangers = noOfPassangers;
	}

	public void displayNoOfPassangers()
	{
		System.out.println("no of passangers is " + noOfPassangers);
	}
	
	@Override
	public void display(int vehicleModel, int registrationNumber , int vehicleSpeed , int fuelCapacity , int fuelConsumption ,String bus,int time,int distance)
	{
		Vehicle v = new Vehicle(vehicleModel, registrationNumber, vehicleSpeed, fuelCapacity, fuelConsumption);
		v.display(vehicleModel, registrationNumber, vehicleSpeed, fuelCapacity, fuelConsumption , bus,time , distance);
	}
}
