package abstractionexample;

public class FactoryClass 
{
	public Itr getObject(char s)
	{
		
		if (s == 'A')
		{
			return new A();
		}
		else
		{
			return  new B();
		}
		
		
	}
}
