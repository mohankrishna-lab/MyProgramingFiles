package collectionframework;

import java.util.*;
import java.util.Map.Entry;
public class HashMapCityWeather
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Map<String, Double> m = new HashMap<String, Double>();
		
		
		System.out.println("enter how many enteries are you going to make");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++)
		{
			System.out.println("enter city name:");
			String city = sc.next();
			System.out.println("enter weather of city");
			Double weather = sc.nextDouble();
			m.put(city, weather);
		}
		
		//displayCityWeather(m);
		//checkCityExitsInMap(m);
		//deleteEntry(m);
		//updatingTemperature(m);
		//displayOnlyCityNames(m);
		displayOnlyWeather(m);
	}
	
	public static void displayCityWeather(Map<String, Double> m)
	{
		Iterator<Entry<String, Double>> itr = m.entrySet().iterator();
		
		System.out.println("city\t\tweather");
		
		while(itr.hasNext())
		{
			Entry<String, Double> i = itr.next();
			
			System.out.println(i.getKey() + "\t\t" + i.getValue());
		}
	}
	
	public static void checkCityExitsInMap(Map<String, Double> m)
	{
		System.out.println("enter the city name to check wheather it exists or not");
		
		String city = sc.next();
		
		Iterator<Entry<String, Double>> itr = m.entrySet().iterator();
		
		boolean flag = true;
		while(itr.hasNext())
		{
			Entry<String, Double> i = itr.next();
			
			if (i.getKey().equals(city))
			{
				System.out.println(city + " is present in map");
				flag = false;
				break;
				
			}
		}
		if (flag)
		{
			System.out.println(city + "city does't exits in map");
		}	
	}
	
	public static void deleteEntry(Map<String, Double> m)
	{
		System.out.println("enter the city name to delete entry");
		
		String city = sc.next();
		
		Iterator<Entry<String, Double>> itr = m.entrySet().iterator();
		
		boolean flag = true;
		while(itr.hasNext())
		{
			Entry<String, Double> i = itr.next();
			
			if (i.getKey().equals(city))
			{
				System.out.println("removed entry is " + i);
				itr.remove();
				flag = false;
				break;
			}
		}
		if (flag)
		{
			System.out.println(city + " doesn't exists in map");
		}
	}
	
	public static void updatingTemperature(Map<String, Double> m)
	{
		System.out.println("enter city name to which you want to update temperature");
		String city = sc.next();
		System.out.println("enter new temperature");
		Double temp = sc.nextDouble();
		
		Iterator<Entry<String, Double>> itr = m.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<String, Double> i = itr.next();
			if (i.getKey().equals(city))
			{
				i.setValue(temp);
				break;
			}
		}
		
		System.out.println("updated map with new temperature is:");
		displayCityWeather(m);
	}
	
	public static void displayOnlyCityNames(Map<String, Double> m)
	{
		Iterator<Entry<String, Double>> itr = m.entrySet().iterator();
		
		System.out.println("city names:");
		
		while(itr.hasNext())
		{
			Entry<String, Double> i = itr.next();
			
			System.out.println(i.getKey());
		}
	}
	
	public static void displayOnlyWeather(Map<String, Double> m)
	{
		Iterator<Entry<String, Double>> itr = m.entrySet().iterator();
		
		System.out.println("weather of cities are:");
		
		while(itr.hasNext())
		{
			Entry<String, Double> i = itr.next();
			
			System.out.println(i.getValue());
		}
	}
}
