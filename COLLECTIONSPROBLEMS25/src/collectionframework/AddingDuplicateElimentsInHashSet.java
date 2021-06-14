package collectionframework;

import java.util.*;
public class AddingDuplicateElimentsInHashSet
{

	public static void main(String[] args)
	{
		Set<Integer> s = new HashSet<Integer>();
		
		int[] a = {12,45,65,23,567,21,12,45,23,65,343,232,76,64};
		
		addingDuplicates(s, a);
	}
	
	public static void addingDuplicates(Set<Integer>s, int[] a)
	{
		for (Integer i : a)
		{
			if (!s.add(i))
			{
				System.out.println("duplicate values is: " + i);
			}
		}
	}

}
