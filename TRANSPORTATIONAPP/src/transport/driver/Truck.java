package transport.driver;

public class Truck extends Vehicle
{
	private int cargoLimit;
	public Truck(int vehicleModel, int registrationNumber, int vehicleSpeed, int fuelCapacity, int fuelConsumption , int cargoLimit)
	{
		super(vehicleModel, registrationNumber, vehicleSpeed, fuelCapacity, fuelConsumption);
		
		this.cargoLimit = cargoLimit;
	}

	public void setCargoLimit(int cargoLimit)
	{
		this.cargoLimit = cargoLimit;
	}
	
	public int getCargoLimit()
	{
		return cargoLimit;
	}
	
	public void displayCargoLimit()
	{
		System.out.println("truck cargo limit is " + cargoLimit);
	}

	@Override
	public void display(int vehicleModel, int registrationNumber , int vehicleSpeed , int fuelCapacity , int fuelConsumption ,String truck,int time,int distance)
	{
		Vehicle v = new Vehicle(vehicleModel, registrationNumber, vehicleSpeed, fuelCapacity, fuelConsumption);
		v.display(vehicleModel, registrationNumber, vehicleSpeed, fuelCapacity, fuelConsumption , truck, time, distance);
	}
}
