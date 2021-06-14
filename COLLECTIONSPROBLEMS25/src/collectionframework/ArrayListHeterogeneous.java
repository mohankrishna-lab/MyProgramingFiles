package collectionframework;

import java.util.*;
public class ArrayListHeterogeneous
{

	public static void main(String[] args) 
	{
		List l = new ArrayList();
		
		l.add(new Student("mysure",11,98.9));
		l.add(new Student("simha",12,98.7));
		l.add(new Student("rewanth",13,86.6));
		l.add(new Student("sai",14,98.6));
		l.add(new Student("Shash",15,96.6));
		l.add(new Student("mohan",16,56.6));
		
		l.add(new Mobile(987575777,"nokia",54.5));
		l.add(new Mobile(987575896,"samsung",765.7));
		l.add(new Mobile(987576666,"redmi",787.7));
		
		System.out.println("displaying only student objects");
		for (int i = 0; i < l.size(); i++)
		{
			if (l.get(i) instanceof Student)
			{
				System.out.println(l.get(i));
			}
		}
		
		System.out.println("displaying both student and objects");
		System.out.println("name\t\tid\tmarks");
		for (int i = 0; i < l.size(); i++)
		{
			if (l.get(i) instanceof Student)
			{
				System.out.println(l.get(i));
			}
		}
		
		System.out.println("num\t\tmobilename");
		for (int i = 0; i < l.size(); i++)
		{
			if (l.get(i) instanceof Mobile)
			{
				System.out.println(l.get(i));
			}
		}
		
		System.out.println("displaying marks greater than 60");
		for (int i = 0; i < l.size(); i++)
		{
			if (l.get(i) instanceof Student)
			{
				Student s = (Student)l.get(i);
				if (s.getMarks() > 60)
				{
					System.out.println(l.get(i));
				}
			}
		}
		
		System.out.println("displaing students starts with s and having marks greater than 65");
		for (int i = 0; i < l.size(); i++)
		{
			if (l.get(i) instanceof Student)
			{
				Student s = (Student)l.get(i);
				if (s.getName().startsWith("s") && s.getMarks() > 60)
				{
					System.out.println(l.get(i));
				}
			}
		}
	}

}
