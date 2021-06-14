package reguralgeoshapes;

public class FactoryProducer
{
	public static AbstaractFactory getFactory(String type)
	{
		if (type.equalsIgnoreCase("Shape"))
		{
			return new ShapeFactory();
		}
		else
		{
			return new ColorFactory();
		}
	}
}
