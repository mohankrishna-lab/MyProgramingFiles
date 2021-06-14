package votersdetails.voter;

public class Voters
{
	private String name;
	private int age;
	
	public Voters(String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void SetName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void SetAge(int age)
	{
		this.age = age;
	}

	public void eligibleOrNot()
	{	
		if (this.age >= 18)
		{
			System.out.println(name + " you are an adult and you are elegible to vote");
		}
		else
		{
			System.out.println(name + " you are underage and you are not elegible to vote");
		}
	}
}
