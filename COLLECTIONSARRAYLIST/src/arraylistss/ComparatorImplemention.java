package arraylistss;

import java.util.*;
public class ComparatorImplemention implements Comparator<Double>
{

	public static void main(String[] args)
	{
		List<Double> l = new ArrayList<Double>();
		
		l.add(67.87);
		l.add(32.43);
		l.add(78.78);
		l.add(768.6);
		l.add(43.78);
		l.add(56.78);
		
		Collections.sort(l,new ComparatorImplemention());
		
		System.out.println(l);
	}
	
	@Override
	public int compare(Double l1,Double l2)
	{
		return l2.compareTo(l1);
	}

}
