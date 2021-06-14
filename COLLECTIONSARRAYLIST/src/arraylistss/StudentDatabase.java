package arraylistss;

import java.util.*;
public class StudentDatabase 
{
	List<Student> l;
	Scanner sc;
	
	public StudentDatabase(List<Student> l, Scanner sc)
	{
		this.l = l;
		this.sc = sc;
	}
	
	public void add()
	{
		l.add(readStudentInfo());
	}
	
	public Student readStudentInfo()
	{
		sc.nextLine();
		System.out.println("enter student name");
		String name = sc.nextLine();
		
		System.out.println("enter student id");
		int id = sc.nextInt();
		
		System.out.println("enter student marks");
		double marks = sc.nextDouble();
		
		System.out.println("enter student mobile");
		long mobile = sc.nextLong();
		
		return new Student(name,id,marks,mobile);
	}
	
	public void remove()
	{
		if (!l.isEmpty())
		{
			System.out.println("enter student id to remove");
			int id = sc.nextInt();
			
			for (Student s : l)
			{
				if (s.getId() == id)
				{
					l.remove(s);
					return;
				}
			}
			System.out.println(id + " doesn't exit");
		}
		else
		{
			System.out.println("list is empty");
		}
	}
	
	public void searchStudent()
	{
		System.out.println("enter id to search");
		int id = sc.nextInt();
		
		if (!l.isEmpty())
		{
			for (Student s :l)
			{
				if (s.getId() == id)
				{
					System.out.println("student id " + id + " exists in list");
					return;
				}
			}
			
			try
			{
				throw new StudentNotFoundException("student with this id is doesn't exits");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		else
		{
			try
			{
				throw new ListEmptyException("list is empty");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void update()
	{
		System.out.println("choose your option");
		System.out.println("1.update marks\n2.update mobile");
		int ch = sc.nextInt();
		
		if (ch == 1)
		{
			System.out.println("enter id number to change marks");
			int id = sc.nextInt();
			System.out.println("enter updated marks");
			double marks = sc.nextDouble();
			
			upateMarks(id,marks);
		}
		else if (ch == 2)
		{
			System.out.println("enter id number to change mobile");
			int id = sc.nextInt();
			System.out.println("enter updated mobile");
			long mobile = sc.nextLong();
			
			updateMobile(id,mobile);
		}
	}
	
	public void upateMarks(int id,double marks)
	{
		if (!l.isEmpty())
		{
			for (Student s : l)
			{
				if (s.getId() == id)
				{
					s.setMarks(marks);
					display();
					return;
				}
			}
			System.out.println("student with id " + id + " doesn't exists");
		}
		else
		{
			System.out.println("list is empty");
		}
	}
	
	public void updateMobile(int id,long mobile)
	{
		if (!l.isEmpty())
		{
			for (Student s : l)
			{
				if (s.getId() == id)
				{
					s.setMobile(mobile);
					display();
					return;
				}
			}
			System.out.println("student with id " + id + " doesn't exists");
		}
		else
		{
			System.out.println("list is empty");
		}
	}
	
	public void display()
	{
		System.out.println("name\t\t\tid\t\t\tmarks\t\t\tmobile");
		for (Student s : l)
		{
			System.out.println(s);
		}
	}
	
	public void sortStudent()
	{
		//tbd
	}
}
