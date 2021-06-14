package reguralgeoshapes;

public class ColorFactory extends AbstaractFactory 
{
	Color c = null;
	
	public Color getColor(String type)
	{
		if (type.equalsIgnoreCase("Red"))
		{
			c = new Red();
			return c;
		}
		
		else if (type.equalsIgnoreCase("Green"))
		{
			c = new Green();
			return c;
		}
		
		else
		{
			c = new Blue();
			return c;
		}
	}
	
	public Shape getShape(String type)
	{
		return null;
	}
}
