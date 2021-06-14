package reguralgeoshapes;

public class ShapeFactory extends AbstaractFactory
{
	public Shape getShape(String type)
	{
		Shape s = null;
		if (type.equalsIgnoreCase("Circle"))
		{
			s = new Circle();
			return s;
		}
		else if (type.equalsIgnoreCase("Square"))
		{
			s = new Square();
			return s;
		}
		else
		{
			s  = new Rectangle();
			return s;
		}
	}
	
	public Color getColor(String type)
	{
		return null;
	}
}
