package arraylistss;

import java.util.Comparator;

public class Pen implements Comparator<Pen>
{
	private String name;
	private double price;
	
	public Pen(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public Pen()
	{
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return name + "\t\t" + price;
	}
	
	public int compare(Pen p1,Pen p2)
	{
		return p2.name.compareTo(p1.name);
	}
}
