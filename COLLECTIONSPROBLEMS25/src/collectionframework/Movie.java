package collectionframework;

import java.util.Comparator;

public class Movie implements Comparator<Movie>
{
	private String name;
	private double rating;
	private String genre;
	private int year;
	
	public Movie(String name, double rating, String genre,int year) {
		super();
		this.name = name;
		this.rating = rating;
		this.genre = genre;
		this.year = year;
	}
	
	public Movie()
	{
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString()
	{
		return name + "\t\t" + rating + "\t" + genre + "\t" + year;
	}
	
	@Override
	public int compare(Movie m1, Movie m2)
	{
		return ((Double)m1.getRating()).compareTo(m2.getRating());
	}
}
