package objectclass;

public class Watch1 
{
	private int time;
	
	@Override
	public String toString()
	{
		return "" + time;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return true;
	}
}
