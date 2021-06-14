package transport.driver;

public class Vehicle
{
	private int vehicleModel;
	private int registrationNumber;
	private int vehicleSpeed;
	private int fuelCapacity;
	private int fuelConsumption;
	
	public Vehicle(int vehicleModel,int registrationNumber,int vehicleSpeed,int fuelCapacity,int fuelConsumption)
	{
		this.vehicleModel = vehicleModel;
		this.registrationNumber = registrationNumber;
		this.vehicleSpeed = vehicleSpeed;
		this.fuelCapacity = fuelCapacity;
		this.fuelConsumption = fuelConsumption;
	}
	
	public void setVehicleModel(int vehicleModel)
	{
		this.vehicleModel = vehicleModel;
	}
	
	public int getVehicleModel()
	{
		return vehicleModel;
	}
	
	public void setRegistrationNumber(int registrationNumber)
	{
		this.registrationNumber = registrationNumber;
	}
	
	public int getRegistrationNumber()
	{
		return registrationNumber;
	}
	
	public void setVehicleSpeed(int vehicleSpeed)
	{
		this.vehicleSpeed = vehicleSpeed;
	}
	
	public int getVehicleSpeed()
	{
		return vehicleSpeed;
	}
	
	public void setFuelCapacity(int fuelCapacity)
	{
		this.fuelCapacity = fuelCapacity;
	}
	
	public int getFuelCapacity()
	{
		return fuelCapacity;
	}
	
	public void setFuelConsumption(int fuelConsumption)
	{
		this.fuelConsumption = fuelConsumption;
	}
	
	public int getFuelConsumption()
	{
		return fuelConsumption;
	}
	
	public int fuelNeeded(int distance)
	{
		if (distance <= 5)
		{
			return 1;
		}
		else
		{
		return distance / fuelConsumption;
		}
	}
	
	public int distanceCovered(int time)
	{
		return vehicleSpeed * time;
	}
	
	public void display(int vehicleModel, int registrationNumber , int vehicleSpeed , int fuelCapacity , int fuelConsumption ,String v , int time, int distance)
	{
		System.out.println("vehicle " + v + " model is " + getVehicleModel() );
		System.out.println("vehicle " + v + " registration number is " + getRegistrationNumber());
		System.out.println("vehicle " + v + " speed is " + getVehicleSpeed());
		System.out.println("vehicle " + v + " fuel capacity is " + getFuelCapacity());
		System.out.println("vehicle " + v + " comsumed fuel is " + getFuelConsumption());
		System.out.println("vehicle " + v + " distanceCovered is " + distanceCovered(time));
		System.out.println("vehicle " + v + " distanceCovered is " + fuelNeeded(distance));
	}
}
