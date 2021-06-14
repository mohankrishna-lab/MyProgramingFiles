package collectionframework;

import java.util.*;
public class SortingStudentObjects10 
{

	public static void main(String[] args) 
	{
		List<Student1> l = new ArrayList<Student1>();
		
		l.add(new Student1("rewanth",13,86.6));
		l.add(new Student1("sai",14,98.6));
		l.add(new Student1("shash",15,96.6));
		l.add(new Student1("mohan",16,56.6));
		l.add(new Student1("mysure",11,98.9));
		l.add(new Student1("simha",12,98.7));
		
		Collections.sort(l, new Student1());
		
		for (Student1 s: l)
			System.out.println(s);
	}
}
