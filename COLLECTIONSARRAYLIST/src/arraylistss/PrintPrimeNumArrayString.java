package arraylistss;

import java.util.*;
public class PrintPrimeNumArrayString 
{

	public static void main(String[] args) 
	{
		String s = "67,31,22,1,3,5,7,2,9,66,97,61,56,44";
		
		printPrimeNum(s);
	}
	
	public static void printPrimeNum(String s)
	{
		String[] ss = s.split(",");
		
		List<String> l = new ArrayList<String>();
		for (String str : ss)
		{
			if (isPrime(str))
			{
				l.add(str);
			}
		}
		
		System.out.println(l);
	}
	
	public static boolean isPrime(String s)
	{
		int num = Integer.parseInt(s);
		
		if (num == 0 || num == 1)
		{
			return false;
		}
		else
		{
			for (int i = 2 ; i < num ; i++)
			{
				if (num % i == 0)
				{
					return false;
				}
			}
		}
		return true;
	}

}
