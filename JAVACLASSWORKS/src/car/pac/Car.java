package car.pac;

public class Car 
{
	private double price;
	private String color;
	private int mfy;
	public Car(double price, String color,int mfy)
	{
		super();
		this.price = price;
		this.color = color;
		this.mfy = mfy;
	}
	public double getPrice() 
	{
		return price;
	}
	public String getColor() 
	{
		return color;
	}
	public int getMfd() 
	{
		return mfy;
	}
	
	@Override
	public String toString()
	{
		return price + "\t\t\t" + color + "\t\t\t" + mfy;
	}
}
