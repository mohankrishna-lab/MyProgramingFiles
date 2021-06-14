package arraylistss;

import java.util.*;
public class SingleReapeatedObject {

	public static void main(String[] args) 
	{
		Integer[] a = {1,1,2,2,3,3,4,5,5,6,6};
		
		printSingleElement(a);
	}
	
	public static void printSingleElement(Integer[] a)
	{
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(a));
		
		for (int j = 0; j < l.size(); j++)
		{
			int count = 0;
			for (int i = 0 ; i < l.size() ; i++)
			{
				if (l.get(j) == (l.get(i)))
				{
					count++;
				}
			}
			
			if (count == 1)
			{
				System.out.println(l.get(j));
			}
		}
	}
}
