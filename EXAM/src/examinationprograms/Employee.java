package examinationprograms;

import java.util.Comparator;

public class Employee implements Comparator<Employee>
{
	private String name;
	private double sal;
	public Employee(String name, double sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	
	public Employee()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	@Override
	public String toString()
	{
		return name + "\t" + sal;
	}
	
	@Override
	public int compare(Employee e1, Employee e2)
	{
		return ((Double)e2.sal).compareTo(e1.sal);
	}
}
