package mapscollection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class PrintAllCharacters 
{

	public static void main(String[] args) 
	{
Map<Character,Integer > m = new LinkedHashMap<Character, Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a string");
		
		String s = sc.next();
		
		char ch[] = s.toCharArray();
		
		for (int i = 0; i < ch.length ; i++)
		{
			if (i == 0)
			{
				m.put(ch[i], 1);
			}
			else
			{
				if (!m.containsKey(ch[i]))
				{
					m.put(ch[i],1);
				}
				else
				{
					int a =m.get(ch[i])+1;
					m.put(ch[i], a);
				}
			}
		}
		
		Iterator<Entry<Character, Integer>> itr  = m.entrySet().iterator();
		
		System.out.println("duplicate characters from " + s + " String are: ");
		
		while (itr.hasNext())
		{
			Entry<Character, Integer> i = itr.next();
			
			System.out.println(i.getKey());
		}
	}

}
