package programsprac;

import java.util.*;

public class AddObejects {

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add(18);
		al.add("jsp");
		al.add("jsp");
		//al.add("98");
		/*System.out.println(al.size());
		System.out.println(al);
		
		for (int i = 0; i < al.size(); i++)
		{
			Object o = al.get(i);
			
			if (o instanceof Integer)
			{
				al.set(i, (int)al.get(i) + 2);
			}
			else if (o instanceof String)
			{
				al.set(i, (String)al.get(i) + "hello");
			}
		}*/
		
		/*ListIterator itr = al.listIterator(al.size());
		
		int count = 1;
		while (itr.hasPrevious())
		{
			Object o = itr.previous();
			
			if (al.indexOf(o) != al.lastIndexOf(o))
			{
				itr.remove();
			}
		}*/
		
		Iterator itr = al.iterator();
		
		
		System.out.println(al);
	}

}
