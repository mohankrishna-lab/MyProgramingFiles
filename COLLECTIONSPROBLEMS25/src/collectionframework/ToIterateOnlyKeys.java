package collectionframework;

import java.util.*;
import java.util.Map.Entry;
public class ToIterateOnlyKeys 
{

	public static void main(String[] args) 
	{
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		m.put(11, "mysura");
		m.put(12, "simha");
		m.put(13, "sai");
		m.put(14, "rewanth");
		m.put(15, "shashank");
		m.put(16, "mysura");
		m.put(17, "mohan");
		
		Iterator<Entry<Integer, String>> itr = m.entrySet().iterator();
		
		while (itr.hasNext())
		{
			Entry<Integer, String> i = itr.next();
			System.out.println(i.getKey());
		}
	}

}
