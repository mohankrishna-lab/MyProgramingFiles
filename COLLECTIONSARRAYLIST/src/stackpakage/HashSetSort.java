package stackpakage;

import java.util.*;

public class HashSetSort
{

	public static void main(String[] args)
	{
		Set<Integer> s = new HashSet<Integer>();
		s.add(67);
		s.add(76);
		s.add(689);
		s.add(89);
		s.add(54);
		s.add(87);
		s.add(66);
		s.add(2);
		s.add(31);
		s.add(76);
		
		
		
		System.out.println(s);
		
		Iterator<Integer> itr = s.iterator();
		
		/*while (itr.hasNext())
		{
			Integer i = itr.next();
			
			if (isPrime(i))
			{
				itr.remove();
			}
		}*/
		
		//System.out.println(s);
		
		/*while (itr.hasNext())
		{
			Integer i = itr.next();
			System.out.println(i);
		}
		
		itr = s.iterator();
		while (itr.hasNext())
		{
			Integer i = itr.next();
			System.out.println(i);
		}*/
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
			System.out.println(itr.next());
			System.out.println(itr.next());
		}
	}
	
	public static boolean isPrime(int num)
	{
		if (num == 1 || num == 0)
		{
			return false;
		}
		else
		{
			for (int i = 2;i<num;i++)
			{
				if (num % i == 0)
				{
					return false;
				}
			}
		}
		return true;
	}

}
