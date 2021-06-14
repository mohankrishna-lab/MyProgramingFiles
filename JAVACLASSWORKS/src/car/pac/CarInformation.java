package car.pac;

public class CarInformation
{
	public static void main(String[] args) 
	{
		GetCarObject g = new GetCarObject();
		
		Car[] c = g.getObjects();
		g.displayC(c);
		
	}
}
