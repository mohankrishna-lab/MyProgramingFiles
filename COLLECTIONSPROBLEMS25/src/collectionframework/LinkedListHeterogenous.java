package collectionframework;

import java.util.*;
public class LinkedListHeterogenous 
{

	public static void main(String[] args) 
	{
		List l = new LinkedList();
		
		l.add(12);
		l.add(89);
		l.add(76);
		l.add("statup");
		l.add("supreme");
		l.add("hi");
		l.add(89);
		l.add(66);		
		
		printOnlyIntegers(l);
		printEvenNum(l);
		displayStartsWithS(l);
		addRemove(l);
	}
	
	public static void printOnlyIntegers(List l)
	{
		System.out.println("only integer values in the given linkedlist are:");
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
		System.out.println("even numbers in given linkedlist are:");
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
		System.out.println("String stats with s in given linkedlist are:");
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
	
	public static void addRemove(List l)
	{
		l.set(0, "intial");
		l.remove(l.size() - 1);
		
		System.out.println(l);
	}

}
