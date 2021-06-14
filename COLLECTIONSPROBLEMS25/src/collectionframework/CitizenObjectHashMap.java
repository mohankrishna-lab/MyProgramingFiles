package collectionframework;

import java.util.Map.Entry;
import java.util.*;
public class CitizenObjectHashMap
{
	public static void main(String[] args)
	{
		Map<Integer, Citizen> m = new HashMap<Integer, Citizen>();
		
		m.put(11, new Citizen("max", 26));
		m.put(12, new Citizen("smith", 18));
		m.put(13, new Citizen("ageorge", 16));
		m.put(14, new Citizen("ackal", 26));
		m.put(15, new Citizen("miny", 32));
		
		displayBtnAge(m);
		displayCitizenNameStartsWithA(m);
	}
	
	public static void displayBtnAge(Map<Integer, Citizen> m)
	{
		Iterator<Entry<Integer, Citizen>> itr = m.entrySet().iterator();
		
		System.out.println("id\tname\tage");
		System.out.println("====================");
		while (itr.hasNext())
		{
			Entry<Integer, Citizen> i = itr.next();
			
			if (i.getValue().getAge() >= 25 && i.getValue().getAge() <= 35)
			{
				System.out.println(i.getKey() + "\t" + i.getValue());
			}
		}
	}
	
	public static void displayCitizenNameStartsWithA(Map<Integer, Citizen> m)
	{
		Iterator<Entry<Integer, Citizen>> itr = m.entrySet().iterator();
		
		System.out.println("id\tname\tage");
		System.out.println("====================");
		while (itr.hasNext())
		{
			Entry<Integer, Citizen> i = itr.next();
			
			if (i.getValue().getName().startsWith("a"))
			{
				System.out.println(i.getKey() + "\t" + i.getValue());
			}
		}
	}
}
