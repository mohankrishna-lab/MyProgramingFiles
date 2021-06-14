package collectionframework;

import java.util.Comparator;
public class Student1 implements Comparator<Student1>
{
	private String name;
	private int id;
	private double marks;
	public Student1(String name, int id, double marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	
	public Student1()
	{
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString()
	{
		return name + "\t\t" + id + "\t" + marks;
	}
	
	@Override
	public int compare(Student1 s1, Student1 s2)
	{
		if (s1.id == s2.id)
		{
			if (s1.name.equals(s2.name))
				return s1.name.compareTo(s2.name);
			else
				return ((Double)s1.marks).compareTo(s2.marks);
		}
		return ((Integer)s1.id).compareTo(s2.id);
	}
}
