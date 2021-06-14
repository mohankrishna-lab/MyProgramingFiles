package collectionframework;

import java.util.Comparator;
public class Stud implements Comparator<Stud>
{
	private String name;
	private int id;
	private double marks;
	public Stud(String name, int id, double marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	
	public Stud()
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
	public int compare(Stud s1, Stud s2)
	{
		return s1.name.compareTo(s2.name);
	}
}
