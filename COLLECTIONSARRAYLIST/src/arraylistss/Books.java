package arraylistss;

import java.util.Comparator;

public class Books implements Comparator<Books>
{
	private String name;
	private double price;
	private String author;
	public Books(String name, double price, String author) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
	}
	
	public Books()
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString()
	{
		return name + "\t\t" + price + "\t\t" + author;
	}
	
	@Override
	public int compare(Books b1 , Books b2)
	{
		return ((Double)b2.price).compareTo(b1.price);
	}
}
