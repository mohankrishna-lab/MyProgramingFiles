package collectionframework;

import java.util.*;
public class MovieListSorting 
{

	public static void main(String[] args) 
	{
		Set<Movie> s = new TreeSet<Movie>(new Movie());
		
		s.add(new Movie("forrest gump", 99.8,"feels good",2017));
		s.add(new Movie("green mile", 88.8,"feels good",1998));
		s.add(new Movie("shashank R", 77.8,"feels good",2017));
		s.add(new Movie("cast away", 97.8,"feels good",1999));
		
		System.out.println("displaying movie released in year 2017");
		System.out.println("name\t\t\trating\tgenere\t\tyear");
		for (Movie m : s)
		{
			if (m.getYear() == 2017)
			{
				System.out.println(m);
			}
		}
		
		System.out.println("======================================================");
		System.out.println("sorting based on movie rating");
		System.out.println("name\t\t\trating\tgenere\t\tyear");
		
		for (Movie m : s)
		{
				System.out.println(m);
		}
	}

}
