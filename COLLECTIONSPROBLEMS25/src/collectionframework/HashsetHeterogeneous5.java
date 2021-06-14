package collectionframework;

import java.util.*;
public class HashsetHeterogeneous5
{

	public static void main(String[] args) 
	{
		Set s = new HashSet();
		
		s.add(new Student("mysure",11,98.9));
		s.add(new Student("simha",12,98.7));
		s.add(new Student("rewanth",13,86.6));
		s.add(new Student("sai",14,98.6));
		s.add(new Student("Shash",15,96.6));
		s.add(new Student("mohan",16,56.6));
		
		s.add(new Mobile(987575777,"nokia", 15000.00));
		s.add(new Mobile(987575896,"samsung",8766.76));
		s.add(new Mobile(987576666,"redmi",16666.66));
		
		System.out.println("display all student objects:");
		System.out.println("------------------------------");
		toDisplayOnlyStudent(s);
		System.out.println("removed student objects that marks are less than 60:");
		System.out.println("------------------------------");
		toRemoveBelowMarks(s);
		
		System.out.println("removed student marks are < 60 or starts with s and ends with a:");
		System.out.println("------------------------------");
		toRemoveStartsWithSAndEndsWithA(s);
		
		System.out.println("display all mobiles objects those price between 15000 and 25000:");
		System.out.println("------------------------------");
		displayMobileObjectsBtnPrice(s);
	}
	
	public static void toDisplayOnlyStudent(Set s)
	{
		Iterator itr = s.iterator();
		
		while (itr.hasNext())
		{
			Object obj = itr.next();
			if (obj instanceof Student)
			{
				System.out.println(obj);
			}
		}
	}

	public static void toRemoveBelowMarks(Set s)
	{
		Iterator itr = s.iterator();
		
		while (itr.hasNext())
		{
			Object obj = itr.next();
			if (obj instanceof Student)
			{
				if (((Student) obj).getMarks() < 60)
				{
					System.out.println(obj);
					itr.remove();
				}
				
			}
		}
	}
	
	public static void toRemoveStartsWithSAndEndsWithA(Set s)
	{
		Iterator itr = s.iterator();
		
		while (itr.hasNext())
		{
			Object obj = itr.next();
			if (obj instanceof Student)
			{
				if (((Student) obj).getMarks() < 60 || ((Student)obj).getName().startsWith("s") && ((Student)obj).getName().endsWith("a"))
				{
					System.out.println(obj);
					itr.remove();
				}
				
			}
		}
	}
	
	public static void displayMobileObjectsBtnPrice(Set s)
	{
		Iterator itr = s.iterator();
		
		while (itr.hasNext())
		{
			Object obj = itr.next();
			
			if (obj instanceof Mobile)
			{
				if (((Mobile)obj).getPrice()>=15000 && ((Mobile)obj).getPrice()<=25000)
				{
					System.out.println(obj);
				}
						
			}
		}
	}
}
