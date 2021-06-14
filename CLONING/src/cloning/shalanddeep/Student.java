package cloning.shalanddeep;

public class Student implements Cloneable
{
	private String name;
	private int id;
	private double marks;
	Address a;
	
	
	public Address getA() {
		return a;
	}

	public void setA(Address a) {
		this.a = a;
	}

	public Student(String name,int id,double marks,Address a)
	{
		this.name = name;
		this.id = id;
		this.marks = marks;
		this.a = a;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setid(int id)
	{
		this.id = id;
	}
	
	public void setmarks(double marks)
	{
		this.marks = marks;
	}
	
	@Override
	public String toString()
	{
		return name+"\t"+id+"\t"+marks+"\t"+a;
	}
	
	@Override
	public Object clone()
	{
		Object o = null;
		try
		{
			Address a1 = new Address(a.getDoorNo(),a.getMain(),a.getCross());
			o = new Student(name , id , marks , a1);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return o;
	}
	
	@Override
	public int hashCode()
	{
		return id;
	}
}
