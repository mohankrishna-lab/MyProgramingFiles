package stackpakage;

import java.util.Comparator;

public class Laptops implements Comparator<Laptops>
{
	private double price;
	private String name;
	private String color;
	public Laptops(double price, String name, String color) {
		super();
		this.price = price;
		this.name = name;
		this.color = color;
	}
	
	public Laptops()
	{
		
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString()
	{
		return name + "\t\t" + price + "\t\t" + color;
	}

	@Override
	public int compare(Laptops l1,Laptops l2)
	{
		if (l1.getPrice() == l2.getPrice())
		{
			return l1.name.compareTo(l2.name);
		}
		else
		{
			return ((Double)l2.price).compareTo(l1.price);
		}
	}
}
