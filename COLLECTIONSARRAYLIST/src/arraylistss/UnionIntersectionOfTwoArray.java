package arraylistss;

import java.util.*;
import java.util.stream.Collectors;

public class UnionIntersectionOfTwoArray 
{

	public static void main(String[] args) 
	{
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(78,43,56,78,21,43));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(78,35,21,55,78,98));
		
		unionAndInterSection(l1,l2);
		
	}
	
	public static void unionAndInterSection(List<Integer> l1 , List<Integer> l2)
	{
		List<Integer> l3 = l1.stream().distinct().collect(Collectors.toList());
		List<Integer> l4 = l2.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Union");
		for (Integer itr1 : l3)
		{
			System.out.print(itr1 + " ");
		}
		
		for (Integer itr1 : l4)
		{
			if (!l3.contains(itr1))
			{
				System.out.print(itr1 + " ");
			}
		}
		System.out.println();
		
		System.out.println("Intersection");
		for (Integer itr1 : l3)
		{
			if (l4.contains(itr1))
			{
				System.out.print(itr1 + " ");
			}
		}
	}

}
