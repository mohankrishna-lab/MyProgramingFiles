package collectionframework;

import java.util.*;

public class SortingValuesOfHashMap
{

	public static void main(String[] args) 
	{
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		m.put(11, "mysura");
		m.put(12, "simha");
		m.put(13, "sai");
		m.put(14, "rewanth");
		m.put(15, "shashank");
		m.put(16, "mohan");
		
		Collection<String> c=m.values();
		List<String> l = new ArrayList<String>(c);
		Collections.sort(l);
		
		Iterator<String> itr = l.iterator();
		
		while (itr.hasNext())
		{		
			System.out.println(itr.next());
		}
	}

}
