package mapscollection;

import java.util.*;
public class OccuranceOfEachCharacter
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
		
		System.out.println(m);
	}

}
