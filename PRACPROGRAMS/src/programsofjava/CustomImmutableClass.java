package programsofjava;

final public class CustomImmutableClass 
{
	final int x;
	public CustomImmutableClass(int x)
	{
		this.x = x;
	}
	
	public CustomImmutableClass modify(int x)
	{
		if (this.x != x)
		{
			return new CustomImmutableClass(x);
		}
		else
		{
			return this;
		}
	}
}
