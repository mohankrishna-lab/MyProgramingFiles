package mapscollection;

import java.util.*;
import java.util.Map.Entry;
public class SortValues
{

	public static void main(String[] args) 
	{
		Map<Integer, String> m = new LinkedHashMap<Integer, String>();
		m.put(11, "hello");
		m.put(12,"hi");
		m.put(14, "hola");
		m.put(13, "dont know");
		m.put(8, "bye");
		
		System.out.println(m);
		
		ArrayList<String> l = new ArrayList<String>();
		
		Iterator<Entry<Integer, String>> itr = m.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<Integer, String> e = itr.next();
			l.add(e.getValue());
		}
		
		System.out.println(l);
		
		Collections.sort(l);
		
		System.out.println(l);
	}

}
