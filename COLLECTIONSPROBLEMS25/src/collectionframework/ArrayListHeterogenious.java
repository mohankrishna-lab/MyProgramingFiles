package collectionframework;

import java.util.*;
public class ArrayListHeterogenious 
{

	public static void main(String[] args)
	{
		List l = new ArrayList();
		
		l.add(12);
		l.add("string");
		l.add(32);
		l.add(11);
		l.add("max");
		l.add("superb");
		l.add(12);
		l.add(66);
		
		printOnlyIntegers(l);
		
		printEvenNum(l);
		
		displayStartsWithS(l);
	}
	
	public static void printOnlyIntegers(List l)
	{
		System.out.println("only integer values in the given arraylist are:");
		for (int i = 0; i < l.size(); i++)
		{
			if(l.get(i) instanceof Integer)
			{
				System.out.println(l.get(i));
			}
		}
	}
	
	public static void printEvenNum(List l)
	{
		System.out.println("even numbers in given arraylist are:");
		for (int i = 0; i < l.size(); i++)
		{
			if(l.get(i) instanceof Integer)
			{
				if (isEven((Integer)l.get(i)))
				{
					System.out.println(l.get(i));
				}
			}
		}
		
	}
	
	public static boolean isEven(int num)
	{
		if (num % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void displayStartsWithS(List l)
	{
		System.out.println("String stats with s in given arraylist are:");
		for (int i = 0; i < l.size(); i++)
		{
			if(l.get(i) instanceof String)
			{
				if (l.get(i).toString().startsWith("s"))
				{
					System.out.println(l.get(i));
				}
			}
		}
	}
}
