package stackpakage;

import java.util.Comparator;

public class Movies implements Comparator<Movies>
{
	private String movieName;
	private double price;
	private String genre;
	public Movies(String movieName, double price, String genre) {
		super();
		this.movieName = movieName;
		this.price = price;
		this.genre = genre;
	}
	
	public Movies()
	{
		
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString()
	{
		return movieName + "\t\t\t\t" + price + "\t\t" + genre;
	}
	
	@Override
	public int compare(Movies m1,Movies m2)
	{
		if (m1.price == m2.price)
		{
			return m1.movieName.compareTo(m2.movieName);
		}
		else
		{
			return ((Double)m2.price).compareTo(m1.price);
		}
	}
}
