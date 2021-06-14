package examinationprograms;

import java.util.*;
public class BubbleSortArrayList 
{

	public static void main(String[] args)
	{
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(12);
		l.add(31);
		l.add(2);
		l.add(98);
		l.add(66);
		l.add(45);
		
		for (int i = 0; i < l.size()-1; i++)
		{
				if (l.get(i) > l.get(i + 1))
				{
					Integer temp = l.set(i,l.get(i+1));
					
					l.set(i+1,temp);
				}
		}
		
		System.out.println(l);
	}

}
