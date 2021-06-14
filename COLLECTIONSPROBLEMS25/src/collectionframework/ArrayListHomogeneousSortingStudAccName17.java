package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListHomogeneousSortingStudAccName17 
{
	public static void main(String[] args) 
	{
		List<Stud> l = new ArrayList<Stud>();
		
		l.add(new Stud("sai",14,98.6));
		l.add(new Stud("shash",15,96.6));
		l.add(new Stud("mohan",16,56.6));
		l.add(new Stud("mysure",11,98.9));
		l.add(new Stud("simha",12,98.7));
		l.add(new Stud("rewanth",13,86.6));
		
		Collections.sort(l,new Stud());
		
		for (Stud s : l)
		{
			System.out.println(s);
		}
	}
}
