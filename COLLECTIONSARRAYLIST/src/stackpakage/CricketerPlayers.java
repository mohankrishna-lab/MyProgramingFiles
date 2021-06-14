package stackpakage;

import java.util.Comparator;

public class CricketerPlayers implements Comparator<CricketerPlayers>
{
	private String name;
	private String country;
	public CricketerPlayers(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
	public CricketerPlayers() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString()
	{
		return name + "\t\t" + country;
	}
	
	@Override
	public int compare(CricketerPlayers c1 , CricketerPlayers c2)
	{
		if(c1.country.equals(c2.country))
		{
			return c2.name.compareTo(c1.name);
		}
		else
		{
			return c1.country.compareTo(c2.country);
		}
	}
}
