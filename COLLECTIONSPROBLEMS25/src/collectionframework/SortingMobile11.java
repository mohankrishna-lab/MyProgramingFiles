package collectionframework;

import java.util.*;
public class SortingMobile11 
{

	public static void main(String[] args)
	{
		List<Mobile> l = new ArrayList<Mobile>();
		
		l.add(new Mobile(987575777,"nokia", 15000.00));
		l.add(new Mobile(987575896,"samsung",8766.76));
		l.add(new Mobile(987576666,"redmi",16666.66));
		
		Collections.sort(l,new Mobile());
		
		for (Mobile m : l)
		{
			System.out.println(m);
		}
	}

}
