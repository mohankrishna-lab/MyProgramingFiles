package collectionframework;

import java.util.*;
public class ArrayListHomogeneousSortingStudentAccId16
{

	public static void main(String[] args) 
	{
		List<Student> l = new ArrayList<Student>();
		
		l.add(new Student("sai",14,98.6));
		l.add(new Student("Shash",15,96.6));
		l.add(new Student("mohan",16,56.6));
		l.add(new Student("mysure",11,98.9));
		l.add(new Student("simha",12,98.7));
		l.add(new Student("rewanth",13,86.6));
		
		
		Collections.sort(l,new Student());
		
		for (Student s : l)
		{
			System.out.println(s);
		}
	}

}
