package collectionframework;

import java.util.*;


public class DoubleObjectDescOrderTreeSet9 implements Comparator<Double>
{
	public static void main(String[] args) 
	{
		Set<Double> s = new TreeSet<Double>(new DoubleObjectDescOrderTreeSet9());
		s.add(12.4);
		s.add(65.3);
		s.add(67.32);
		s.add(22.56);
		s.add(44.89);
		s.add(98.786);
		s.add(56.86);
		s.add(66.66);
		
		System.out.println(s);
	}
	
	@Override
	public int compare(Double d1, Double d2)
	{
		return d2.compareTo(d1);
	}
}
