package collectionframework;

import java.util.Comparator;

public class Mobile implements Comparator<Mobile>
{
	private long number;
	private String name;
	private double price;
	
	public Mobile(long number, String name, double price) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
	}
	
	public Mobile()
	{
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return number;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString()
	{
		return number + "\t" + name + "\t" + price;
	}
	
	@Override
	public int compare(Mobile m1, Mobile m2)
	{
		if (m1.number == m2.number)
			return ((Double)m1.price).compareTo(m2.price);
		else
			return m2.name.compareTo(m1.name);
	}
}
