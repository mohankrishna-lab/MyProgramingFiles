package arraylistss;

import java.util.*;
public class StudentArrayListOperations 
{

	public static void main(String[] args) 
	{
		List<Student> l = new LinkedList<Student>();
		
		l.add(new Student("mysure",11,98.9,978368236));
		l.add(new Student("simha",12,78.8,794823742));
		l.add(new Student("rewanth",13,89.9,894723844));
		l.add(new Student("sai",14,99.6,908429740));
		
		Iterator<Student> itr = l.iterator();
		
		while (itr.hasNext())
		{
			Student s = itr.next();
			
			if (s.getMarks() > 80)
			{
				System.out.println(s);
			}
		}
	}

}
