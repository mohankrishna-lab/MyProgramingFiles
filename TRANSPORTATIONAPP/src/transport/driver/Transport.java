package transport.driver;

public class Transport
{
	public static void main(String[] args)
	{		
		Truck t = new Truck(7007, 1166, 40, 190, 3,18);
		Bus b = new Bus(2111, 45663, 50, 350, 5,45);
		
		System.out.println("vehicle Details");
		getObject(new Truck(7007, 1166, 40, 190, 3,18));
		
		//System.out.println("==========================================");
		
		//System.out.println("Bus Details");
		//getObject(new Bus(2111, 45663, 50, 350, 5,45));
	}


	public static void getObject(Vehicle v)
	{
		v.display(7007, 1166, 40, 190, 3,"truck",3,90);
		v.display(2111, 45663, 50, 350, 5, "bus" , 6 ,200 );
		
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
