package arraylistss;

import java.util.*;

public class FruitsListService
{
	public static List<String> addFruitsToList()
	{
		List<String> l = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter how many fruits to add to list");
		
		int num = sc.nextInt();
		
		System.out.println("Enter " + num + " of fruits into list" );
		
		String[] ss = new String[num];
		int j = 0;
		for (int i = 1 ; i <= num ; i++)
		{
			String s = sc.next();
			ss[j++] = s;
		}
		
		for (int i = 0 ; i < ss.length;i++)
		{
			boolean flag = true;
			for (int k = i + 1 ; k < ss.length ; k++)
			{
				if (ss[i].equalsIgnoreCase(ss[k]))
				{
					flag = false;
				}		
			}
			
			if (flag)
			{
				l.add(ss[i]);
			}
		}
		
		return l;
	}
	
	public static int searchFruitInList(List<String> l , String s)
	{
		for (int i = 0; i < l.size(); i++)
		{
			if (l.get(i).equals(s))
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int searchFruitInListIgnoreCase(List<String> l , String s)
	{
		for (int i = 0; i < l.size(); i++)
		{
			if (l.get(i).equalsIgnoreCase(s))
			{
				return i;
			}
		}
		return -1;
	}
}
