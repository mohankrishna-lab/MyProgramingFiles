package stackpakage;

import java.util.*;
import java.util.Map.Entry;
public class MapDemo 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		
		char ch = 'a';
		int num = 1;
		
		for (int i = 1 ; i <= 26;i++ )
		{
			m.put(ch, num);
			ch++;
			num++;
		}
		
		System.out.println(m);
		
		System.out.println("enter the String");
		
		String s = sc.next();
		
		char ch1[] = s.toCharArray();
		
		Iterator<Entry<Character, Integer>> itr= m.entrySet().iterator();
		int sum = 0;
		
		while (itr.hasNext())
		{
			Entry<Character,Integer> i = itr.next();
			
			for (int j = 0;j < ch1.length ; j++)
			{
				if (i.getKey() == ch1[j])
				
					sum += i.getValue();
				
			}
		}
		
		System.out.println(sum);
	}

}
