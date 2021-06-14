package arraylistss;

import java.util.Comparator;

public class Employees implements Comparator<Employees>
{
	private String name;
	private double sal;
	private long mobile;
	public Employees(String name, double sal, long mobile) {
		super();
		this.name = name;
		this.sal = sal;
		this.mobile = mobile;
	}
	
	public Employees()
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public String toString()
	{
		return name + "\t\t" + sal + "\t\t" + mobile;
	}
	
	@Override
	public int compare(Employees e1 , Employees e2)
	{
		return e1.name.compareTo(e2.name);
	}
}
