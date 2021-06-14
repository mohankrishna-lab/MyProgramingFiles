package collectionframework;

import java.util.*;


public class ToConvertKeysOfHashMapToArrayList 
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
		
		Set<Integer> c=m.keySet();
		List<Integer> l = new ArrayList<Integer>(c);
		Collections.sort(l);
		
		Iterator<Integer> itr = l.iterator();
		
		while (itr.hasNext())
		{		
			System.out.println(itr.next());
		}
	}

}
