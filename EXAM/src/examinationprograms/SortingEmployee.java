package examinationprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingEmployee 
{

	public static void main(String[] args) 
	{
		List<Employee> l = new ArrayList<Employee>();
		
		l.add(new Employee("mysure",78.9));
		l.add(new Employee("simha",77.9));
		l.add(new Employee("sai",55.7));
		l.add(new Employee("rewanth",98.9));
		l.add(new Employee("shashank",66.6));
		l.add(new Employee("mohan",44.66));
		
		Collections.sort(l,new Employee());
		
		System.out.println(l);
	}

}
