package arraylistss;

import java.util.*;

public class ArrayListAssignment
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		
		l.add(43);
		l.add('d');
		l.add("hell0");
		l.add(98.89);
		l.add("world");
		l.add(78.89);
		l.add(98);
		l.add(87);
		l.add('a');
		l.add(89);
		l.add('t');
		l.add('Z');
		l.add(77);
		l.add(88.90f);
		
		
		/*for (int i = 0; i < l.size(); i++) //done
		{
			Object obj = l.get(i);
			
			if (obj instanceof Character)
			{
				System.out.println(obj);
			}
			
		}*/
		
		/*for (int i = 0;i < l.size();i++)
		{
			Object obj = l.get(i);
			
			if (obj instanceof Double || obj instanceof Float)
			{
				System.out.println(obj);
			}
		}*/
		
		/*for (int i = 0;i < l.size();i++)
		{
			Object obj = l.get(i);
			
			if (obj instanceof String)
			{
				System.out.println(obj);
			}
		}*/
		
		
		
		for (int i = 0; i < l.size(); i++)
		{
			Object obj = l.get(i);
			
			if (obj instanceof Integer)
			{
				Integer a = (Integer)obj;
				
				if (!(a % 2 == 0))
				{
					int b = a + 1;
					l.remove(i);
					l.add(i, b); 
				}
			}
		}
		
		/*for (int i = 0 ; i < l.size(); i++)
		{
			Object obj = l.get(i);
			
			if (!(obj instanceof String) && !(obj instanceof Double))
			{
				l.remove(i);
				i--;
			}
		}*/
		System.out.println(l);
		/*for (int i = 0; i < l.size()/2 ; i++)
		{
			l.set(l.size() - 1 - i, l.set(i, l.get(l.size() -1 - i)));
		}*/
		
		Collections.reverse(l);
		System.out.println(l);
	}
}
