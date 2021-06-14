package arraylistss;

import java.util.*;

public class RemoveDuplicateElementsList 
{

	public static void main(String[] args)
	{
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(7);
		l.add(6);
		l.add(5);
		l.add(4);
		l.add(7);
		l.add(3);
		l.add(4);
		
		List<Integer> ll =removeDuplicateEle(l);
		
		System.out.println(ll);
	}
	
	public static List<Integer> removeDuplicateEle(List<Integer> l)
	{
		List<Integer> ll = new ArrayList<Integer>();
		int k = l.size();
		
		for (int i = 0 ; i < l.size(); i++)
		{
			for (int j = i + 1; j < l.size() ; j++)
			{
				if (l.contains(l.get(j)))
				{
					k = j;
				}
				
				while (k < l.size())
				{
					if (l.contains(l.get(k)))
					{
						l.remove(k);
					}
					k++;
				}
			}
			
			ll.add(l.get(i));
		}
		return ll;
	}

}
