package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListHomogeneousSortDouble14 
{
	public static void main(String[] args)
	{
		List<Double> l = new ArrayList<Double>();
		l.add(65.3);
		l.add(12.32);
		l.add(23.67);
		l.add(99.76);
		l.add(45.87);
		l.add(56.32);
		l.add(33.23);
		l.add(66.66);
		
		System.out.println("before sorting");
		System.out.println(l);
		
		Collections.sort(l);
		System.out.println("after sorting");
		System.out.println(l);
	}
}
