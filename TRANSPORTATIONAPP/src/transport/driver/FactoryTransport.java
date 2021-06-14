package transport.driver;

public class FactoryTransport
{
	public static void getObject(Vehicle v)
	{
		
		if (v instanceof Truck)
		{
			((Truck)v).displayCargoLimit();
		}
		else if (v instanceof Bus)
		{
			((Bus)v).displayNoOfPassangers();
		}
	}

}
