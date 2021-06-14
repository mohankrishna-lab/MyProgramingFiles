package stackpakage;

import java.util.*;

public class MoviesSort
{

	public static void main(String[] args) 
	{
		List<Movies> l = new LinkedList<Movies>();

		l.add(new Movies("forest Gump",99.9,"comedy"));
		l.add(new Movies("me before you",92.9,"drama"));
		l.add(new Movies("green mile",99.2,"drama"));
		l.add(new Movies("cast away",96.6,"drama"));
		l.add(new Movies("Best of me",96.6,"feel-good"));
		
		Collections.sort(l,new Movies());
		
		for (Movies m : l)
		{
			System.out.println(m);
		}
	}

}
