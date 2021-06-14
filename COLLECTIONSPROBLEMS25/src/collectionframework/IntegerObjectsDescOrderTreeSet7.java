package collectionframework;

import java.util.*;

public class IntegerObjectsDescOrderTreeSet7 implements Comparator<Integer>
{

	public static void main(String[] args) 
	{
		//we can do this by using constructor of tree set and by passing implements Comparator class object like this (OR)
		Set<Integer> s = new TreeSet<Integer>(new IntegerObjectsDescOrderTreeSet7());
		s.add(12);
		s.add(65);
		s.add(67);
		s.add(22);
		s.add(44);
		s.add(98);
		s.add(56);
		s.add(66);
		
		System.out.println(s);
		
		
		//we can do this by converting TreeSet into ArrayList
		
		/*List<Integer> l = new ArrayList<Integer>(s);
		Collections.sort(l,new IntegerObjectsDescOrderTreeSet7());
		System.out.println(l);*/	
		
	}
	
	@Override
	public int compare(Integer i1, Integer i2)
	{
		return i2.compareTo(i1);
	}

}
