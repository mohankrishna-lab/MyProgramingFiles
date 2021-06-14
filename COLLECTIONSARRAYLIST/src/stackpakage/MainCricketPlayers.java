package stackpakage;

import java.util.*;
public class MainCricketPlayers {

	public static void main(String[] args) 
	{
		SortedSet<CricketerPlayers> s = new TreeSet<CricketerPlayers>(new CricketerPlayers());
		
		s.add(new CricketerPlayers("virat" , "india"));
		s.add(new CricketerPlayers("rohit" , "india"));
		s.add(new CricketerPlayers("smith" , "australia"));
		s.add(new CricketerPlayers("stokes" , "england"));
		s.add(new CricketerPlayers("sachin" , "india"));
		
		
		System.out.println("name\t\tcountry");
		System.out.println("==========================");
		Iterator<CricketerPlayers> itr = s.iterator();
		
		while (itr.hasNext())
		{
			CricketerPlayers c = itr.next();
			System.out.println(c);
		}	
	}

}
