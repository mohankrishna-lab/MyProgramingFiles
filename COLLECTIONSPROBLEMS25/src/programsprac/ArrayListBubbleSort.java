package programsprac;

import java.util.*;
public class ArrayListBubbleSort
{

	public static void main(String[] args)
	{
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(32);
		l.add(45);
		l.add(12);
		l.add(78);
		l.add(1);
		
		for (int i = 0; i < l.size()-1;i++)
		{
			for (int j = i+1; j < l.size(); j++)
			{
				if (l.get(i) > l.get(j))
				{
					int temp = l.get(i);
					l.set(i, l.get(j));
					l.set(j, temp);
				}
			}
		}
		System.out.println(l);
	}

}
