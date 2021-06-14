package programsprac;

import java.util.*;

public class HackerRankZenpact {

	public static void main(String[] args) 
	{
		List<String> l = new ArrayList();
		l.add("pat");
		l.add("tap");
		l.add("apt");
		l.add("bat");
		System.out.println(display(l));
	}
	
	public static int display(List<String> l)
	{
		int count = 0;
		
		List<String> l1 = new ArrayList<String>();
		
		for (String s : l)
		{
			l1.add(sort(s));
		}
		
		int i;
		for (i =0; i < l1.size() - 1 ;i++)
		{
			int k = 0;
			for (int j =i+1; j < l1.size();j++)
			{
				
				if (l1.get(i).equals(l1.get(j)))
				{
					k = j;
					System.out.println("bye");
					count++;
					while (k < l1.size())
					{
						if (l1.get(j).equals(l1.get(k)))
						{
							i = k+1;
							
						}
						
						k++;
					}
					
				}
				else
				{
					System.out.println("hi");
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static String sort(String s)
	{
		String str="";
		
		char[] ch = s.toCharArray();
		
		Arrays.sort(ch);
		
		for (int i = 0; i < ch.length;i++)
		{
			str += ch[i];
		}
		return str;
	}

}
